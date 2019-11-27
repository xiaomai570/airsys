package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan({"dao","service","controller","entity"})
@Import(JdbcConfig.class)
@EnableAspectJAutoProxy
public class TestConfig {
	/**
	 * jsp的解析器
	 * Bean就是告诉Spring MVC你写的jsp文件的位置
	 */
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/");//位置
		resolver.setSuffix(".jsp");//省略jsp的后缀
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}
/**
 * 换句话说，我要首先配置好那个servlet，并且服务器启动时就实例化；
 * 1.tomcat启动的时候，Spring MVC框架写了一个监听器ContextListener，
 * 2.在servletContextListener中实例化这个核心的servlet
 * 3.这个servlet拦截一切请求
 * 4.拦截到请求后，再获取请求的路径转发给对应的Controller
 * 5.Controller再做处理
 * 
 * 想法：所有的Bean都要纳入到Spring容器管理，才能实现面向接口编程；
 * 		tomcat启动时，我们实例化一个Spring容器；然后把它放到ServletContext里面；
 * 
 * Spring MVC:
 * 在tomcat启动的时候；实例化一个Spring容器放入到ServletContext对象里；
 * 并且在ServletContext中实例化那个核心的Servlet
 * 而且该Servlet拦截一切请求；
 */
