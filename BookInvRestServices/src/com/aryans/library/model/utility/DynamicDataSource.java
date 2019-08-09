package com.aryans.library.model.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Component
@PropertySource("classpath:Configs/DataBase.properties")
public class DynamicDataSource extends DriverManagerDataSource {

	@Value("${host}")
	String host;
	@Value("${port}")
	String port;
	@Value("${DBName}")
	String db;
	@Value("${DBType}")
	String dbType;
	
	public DynamicDataSource() {
		super();
		
//		if(dbType.equalsIgnoreCase("Derby")) {
//			super.setUrl("jdbc:derby://" + host + ":" + port + "/" + db);
//			super.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
//		}
	}
	
	
}
