package com.SpringjdbcprojectDao;

import org.springframework.jdbc.core.JdbcTemplate;

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
	   public int delete(int eid) {
	        String query = "delete from employee where id=?";
	        return jdbctemplate.update(query, eid);
	    }
	

	
}
