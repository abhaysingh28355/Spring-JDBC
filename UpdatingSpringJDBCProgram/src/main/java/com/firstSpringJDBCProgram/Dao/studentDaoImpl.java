package com.firstSpringJDBCProgram.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.firstSpringJDBCProgram.Entity.Student;

public class studentDaoImpl implements studentDao{

	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		 String query = "insert into student(id,name,city,state,pincode) value(?,?,?,?,?)";
		 int r = this.jdbcTemplate.update(query, student.getCity(),student.getId(),student.getName(),student.getPincode(),student.getPincode(),student.getState());
		return r;
	}
	
	public int change(Student student) {
		// Updating data
		String query ="update student set city=?,name=?,set pincode=?,set state=? where id=?";
		int res = this.jdbcTemplate.update(query,student.getId(),student.getCity(),student.getName(),student.getPincode(),student.getState());
		return res;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	

	

}
