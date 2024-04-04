package com.Springjdbcproject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringjdbcprojectDao.EmployeeDao;
import com.SpringjdbcprojectEntity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "first programming....." );
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
        EmployeeDao dao = context.getBean("employeedao",EmployeeDao.class);
        
        Employee emp1 = new Employee();
        emp1.setEid(29);
        emp1.setEname("Anand");
        emp1.setDesgn("SDE1");
        int result = dao.insert(emp1);
        System.out.println("Recorded added "+result);
        
//        Employee emp1 = new Employee();
//        emp1.setEid(24);
//        emp1.setEname("Raftaar SIngh");
//        emp1.setDesgn("SDE3");
//        int result = dao.update(emp1);
//     System.out.println("Recorded added "+result);
        
        
//        int eidToDelete = 24;
//        int deleteResult = dao.delete(eidToDelete);
//        System.out.println("Record deleted: " + deleteResult);
        
//        Employee employee = dao.getEmployee(220);
//        System.out.println(employee);
        List<Employee> employees = dao.getAllEmployees();
        for(Employee e:employees) {
        	System.out.println(e);
        }
    }
}
