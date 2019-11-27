package util;

import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PagerAspect {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Pointcut("execution(* service..*(..))")
	public void selfPoint() {}
	
	@Around("selfPoint()")
	public Object selfAround(ProceedingJoinPoint jp) {
		Object obj = null;
		MethodSignature ms = (MethodSignature) jp.getSignature();
		Method method = ms.getMethod();
		MiniPager minipager = method.getAnnotation(MiniPager.class);
		if (minipager==null) {
			try {
				obj=jp.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return obj;
		}
		String tablename = minipager.tablename();
		int totalItems = jdbcTemplate.queryForObject("select count(*) from "+tablename, Integer.class);
		int pagesize = (int)jp.getArgs()[1];
		int pageNo = (int)jp.getArgs()[0];
		int totalpages = (totalItems + pagesize - 1)/pagesize;
		if (pageNo>totalpages) {
			pageNo = totalpages;
		}
		Pager pager = new Pager();
		try {
			List list = (List)jp.proceed(new Object[] {pageNo,pagesize});
			pager.setDate(list);
			pager.setTotal(totalpages);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return pager;
	}
}
