package com.firstapp.app;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.firstapp.dao.SystemRepository;

@SpringBootApplication(scanBasePackages= {"com.firstapp.app"})
@EnableJpaRepositories("com.firstapp.dao")
@EntityScan("com.firstapp.model")
public class MysqlJdbcDriverApplication implements CommandLineRunner {

	@Autowired
	DataSource datasource;

	@Autowired
	SystemRepository systemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MysqlJdbcDriverApplication .class, args);
		/*
		 * String[] beanNames = ctx.getBeanDefinitionNames(); Arrays.sort(beanNames);
		 * for (String beanName : beanNames) { System.out.println(beanName); }
		 */
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Our Datasource is " + datasource);
		Iterable<com.firstapp.model.System> systemlist = systemRepository.findAll();
		for (com.firstapp.model.System systemmodel : systemlist) {
			System.out.println("Here is a System " + systemmodel.toString());
		}

	}

}
