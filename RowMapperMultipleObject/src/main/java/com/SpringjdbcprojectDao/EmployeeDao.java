package com.SpringjdbcprojectDao;

import java.util.List;

import com.SpringjdbcprojectEntity.Employee;

public interface EmployeeDao {

	public int insert(Employee employee);
	public int update(Employee employee);
//	public int delete(int eidToDelete);
	public Employee getEmployee(int employeeId);
	public List<Employee> getAllEmployees();
}
