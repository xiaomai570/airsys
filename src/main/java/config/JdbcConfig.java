package config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
//@ComponentScan("day04")
@PropertySource("classpath:jdbc.properties")//-- 明确jdbc配置信息的位置
//-- @MapperScan({"dao"})//--明确那些包下的类要做映射处理
public class JdbcConfig {
	@Value("${jdbc.driverClass}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	// --MyBatis的配置
	/*@Value("${mybatis.config.path}")
	private String myBatisConfigPath;
	@Value("${mybatis.mapper.xml.config.path}")
	private String mapperXMLConfigPath;
	@Value("${mybatis.alias.package.path}")
	private String aliasPackagePath;*/

	// -- 2.数据库连接池对象
	@Bean(name = "dataSource")
	public DataSource createDataSource() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}

	// -- 配置JDBCTemplate
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate createJdbcTemplate(DataSource ds) {// -- 依赖注入，自动注入
		// -- 利用数据源构造JdbcTemplate
		return new JdbcTemplate(ds);
	}

	// -- 配置事务管理器
	@Bean(name = "transactionManager")
	public PlatformTransactionManager createPlatformTransactionManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
	
	/*@Bean(name="sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = 
    			new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = 
        		new PathMatchingResourcePatternResolver();
        String packageXMLConfigPath = 
        		PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperXMLConfigPath;
        
        // 设置MyBatis 配置文件的路径
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(myBatisConfigPath));
        // 设置mapper 对应的XML 文件的路径
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageXMLConfigPath));
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 设置实体别名包路径
        sqlSessionFactoryBean.setTypeAliasesPackage(aliasPackagePath);
        return sqlSessionFactoryBean.getObject();
	}*/
}
