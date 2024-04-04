package com.SpringjdbcprojectDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringjdbcprojectEntity.Employee;

public class RowMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEid(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setDesgn(rs.getString(3));
		return emp;
	}

}
