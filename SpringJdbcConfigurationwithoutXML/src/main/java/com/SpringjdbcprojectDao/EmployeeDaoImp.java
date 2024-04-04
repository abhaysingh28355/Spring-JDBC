package com.SpringjdbcprojectDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringjdbcprojectEntity.Employee;

public class EmployeeDaoImp implements EmployeeDao{

private JdbcTemplate jdbctemplate;
	
	public int insert(Employee emp) {
	String query="insert into employee value(?,?,?)";
	int r=this.jdbctemplate.update(query,emp.getEid(),emp.getEname(),emp.getDesgn());
		return r;
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	public int update(Employee employee) {
		// Updating data in databases
		
		  String query = "update employee set name=?, Design=? where id=?";
	        return jdbctemplate.update(query, employee.getEname(), employee.getDesgn(), employee.getEid());
		
		
	}
//	   public int delete(int eid) {
//	        String query = "delete from employee where id=?";
//	        return jdbctemplate.update(query, eid);
//	    }
	public Employee getEmployee(int employeeId) {
		// Select single Employee data
		String query="select * from employee where id=?";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		Employee employee = this.jdbctemplate.queryForObject(query, rowMapper,employeeId);
		return employee;
	}
	public List<Employee> getAllEmployees() {
		// Select multiple Employee data
		String query ="select * from employee";
		List<Employee> employees = this.jdbctemplate.query(query, new RowMapperImpl());
		return employees;
	}
	

	
}
