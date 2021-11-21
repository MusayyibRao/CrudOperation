package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class employeeService  implements EmployeeServ {

	
@Autowired	
private EmployeeRepository repo;

/*
 * public void updateEmployee(Employee empl,int id) {
 * 
 * this.repo.save(empl); }
 */


public Employee updateUser(Employee employ,int id)
{
	System.out.println("id is "+id);
	 Employee emp = repo.findById(id);
	  emp.setFirstName(employ.getFirstName());
	  emp.setLastName(employ.getLastName());
	  emp.setEmail(employ.getEmail());
	  
	  repo.save(emp);
	  System.out.println("Data is udated...");
	  return emp;	 
}


  public List<Employee> findPaginated(int pageNo,int pageSize) 
  { Pageable pageble=PageRequest.of(pageNo,pageSize);
  Page<Employee> PageResult = repo.findAll(pageble); 
    return PageResult.toList();
  
  }
 


}


	

