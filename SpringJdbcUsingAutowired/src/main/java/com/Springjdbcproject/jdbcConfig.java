package com.Springjdbcproject;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.SpringjdbcprojectDao.EmployeeDao;
import com.SpringjdbcprojectDao.EmployeeDaoImp;
import com.SpringjdbcprojectEntity.Employee;

@Configuration
@ComponentScan(basePackages = {"com.SpringjdbcprojectDao"})
public class jdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
		ds.setUsername("root");
		ds.setPassword("ABab12@$");
		return ds;
	}
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
	}
	@Bean(name={"employeedao"})
	public EmployeeDao getEmployeeDao() {
		EmployeeDaoImp emp = new EmployeeDaoImp();
		emp.setJdbctemplate(getTemplate());
			return emp;
		
		}
}
