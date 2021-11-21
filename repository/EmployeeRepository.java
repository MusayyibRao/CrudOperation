package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Employee getEmployeeById(int id);
	
	
	  public Employee findById(int id);
	 
	 
	
//	  public void updateEmployee(Employee employee,int id);
	  
	  
	  
	 	 
	/*	
	 * public String getEmployeeById(int id);
	 */	
	
	
}
