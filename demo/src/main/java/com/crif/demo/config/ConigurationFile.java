package com.crif.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConigurationFile {

	@Autowired
	private Environment environment;

	@Bean(name = "jdbcSecTemplate")
	public JdbcTemplate jdbcSecTemplate(DataSource dataSecSource) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(environment.getRequiredProperty("spring.datasource.driver-class-name"));

		dataSource.setUrl(environment.getRequiredProperty("spring.datasource.url"));

		dataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));

		dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));

		JdbcTemplate jdbcSecTemplate = new JdbcTemplate(dataSource);

		jdbcSecTemplate.setResultsMapCaseInsensitive(true);

		return jdbcSecTemplate;
	}

}
