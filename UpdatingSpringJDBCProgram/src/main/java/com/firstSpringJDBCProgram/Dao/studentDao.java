package com.firstSpringJDBCProgram.Dao;

import com.firstSpringJDBCProgram.Entity.Student;

public interface studentDao {

	public int insert(Student student);
	public int change(Student student);
}
