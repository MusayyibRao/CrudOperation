package com.employee.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public interface EmployeeServ {
	
	  List<Employee> findPaginated(int pageNo,int pageSize);
	 
}
