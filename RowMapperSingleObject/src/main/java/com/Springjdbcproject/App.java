package com.Springjdbcproject;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeedao",EmployeeDao.class);
        
//        Employee emp1 = new Employee();
//        emp1.setEid(24);
//        emp1.setEname("Shyam");
//        emp1.setDesgn("Python");
//        int result = dao.insert(emp1);
//        System.out.println("Recorded added "+result);
        
//        Employee emp1 = new Employee();
//        emp1.setEid(24);
//        emp1.setEname("Raftaar SIngh");
//        emp1.setDesgn("SDE3");
//        int result = dao.update(emp1);
//     System.out.println("Recorded added "+result);
        
        
//        int eidToDelete = 24;
//        int deleteResult = dao.delete(eidToDelete);
//        System.out.println("Record deleted: " + deleteResult);
        
        Employee employee = dao.getEmployee(220);
        System.out.println(employee);
    }
}
