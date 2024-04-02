package com.firstSpringJDBCProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.firstSpringJDBCProgram.Dao.studentDao;
import com.firstSpringJDBCProgram.Entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program started........................");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		studentDao studentDao = context.getBean("studentdao", studentDao.class);

		Student st = new Student();
		st.setCity("Rohtas");
		st.setId(453);
		st.setName("Abhay Singh");
		st.setPincode("802212");
		st.setState("Bihar");

		int result = studentDao.insert(st);
		System.out.println("Student added" + result);

	}
}
