package com.javarticles.springboot;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;*/


@SpringBootApplication
public class SpringBootDatasourceApplication {

	@Autowired
	DataSource datasource;

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(SpringBootDatasourceApplication.class, args);
		/*
		 * ConfigurableApplicationContext context = SpringApplication.run(
		 * SpringBootDatasourceApplication.class, args);
		 * 
		 * DatabaseOperations databaseOperations = (DatabaseOperations) context
		 * .getBean("databaseOperations");
		 * 
		 * databaseOperations.queryEmployees();
		 * 
		 * databaseOperations.insertEmployee(new Employee(100, "David", 45));
		 * 
		 * System.out.print("After insert, "); databaseOperations.queryEmployees();
		 */
	}

	public void print() {
		System.out.println("Our Datasource is " + datasource);
	}

}
