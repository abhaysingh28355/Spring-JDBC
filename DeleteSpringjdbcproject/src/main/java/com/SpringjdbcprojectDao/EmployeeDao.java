package com.SpringjdbcprojectDao;

import com.SpringjdbcprojectEntity.Employee;

public interface EmployeeDao {

	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int eidToDelete);
}
