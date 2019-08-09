package com.aryans.library.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
@ComponentScan("com.aryans.library")
@EnableTransactionManagement
public class SpringRestConfig implements WebMvcConfigurer {
	
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUrl("jdbc:derby://localhost:1527/BooksInvDB");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDriverManagerDataSource());
		return jt;
	}
	
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager() {
		DataSourceTransactionManager dsTrnxMngr = new DataSourceTransactionManager();
		dsTrnxMngr.setDataSource(getDriverManagerDataSource());
		return dsTrnxMngr;
	}
}
