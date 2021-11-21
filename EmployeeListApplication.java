package com.employee;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeListApplication {

	public static void main(String[] args) {
		/* ConfigurableApplicationContext context= */
		SpringApplication.run(EmployeeListApplication.class, args);
	
	/*
	 * EmployeeRepository repo=context.getBean(EmployeeRepository.class);
	 * 
	 * 
	 * Employee emp=new Employee();
	 * 
	 * emp.setId(3); emp.setFirstName("sahil"); emp.setLastName("Rao");
	 * emp.setEmail("sahil67@gmail.com");
	 * 
	 * Employee emp1=new Employee(); emp1.setId(2); emp1.setFirstName("rao");
	 * emp1.setLastName("raj"); emp1.setEmail("raj123@gmail.com");
	 * 
	 * List<Employee>list=List.of(emp,emp1);
	 * 
	 * Iterable<Employee> itr=repo.saveAll(list);
	 * 
	 * itr.forEach(Employee->{System.out.println(Employee);});
	 * 
	 */
	   //System.out.println(list);
	
	}

}
