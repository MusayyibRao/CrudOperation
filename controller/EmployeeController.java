package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.PageRequest;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeServ;
import com.employee.service.employeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("")
public class EmployeeController {

	
@Autowired
private EmployeeRepository repo;

@Autowired
private employeeService eservice;



  @Autowired 
  private EmployeeServ repoSer;
 
  
  
	/* get Pagination Api */

  @GetMapping("/employees/{pageNo}/{pageSize}")
  public List<Employee>getPaginated(@PathVariable int pageNo,@PathVariable int pageSize) 
  {
  return repoSer.findPaginated(pageNo, pageSize); 
  }
 




/* get all data from database */


/*
 * @GetMapping("/") public String showPage(Model
 * model,@RequestParam(defaultValue = "0") int page) {
 * model.addAttribute("data", repo.findAll(new PageRequest(page,4)));
 * 
 * model.addAttribute("currentPage", page);
 * 
 * return "employees";
 * 
 * }
 */



  @GetMapping("/employees") public List<Employee> getAllEmployee() {
  
  return repo.findAll();
  
  
  }
 
 
 /* create data in database */

@PostMapping("/employees")
public Employee createEmployee(@RequestBody Employee employee)
{
return repo.save(employee);


}

/* get data from database by employee id */

@GetMapping("/employees/{id}")

public 	Employee getEmployee(@PathVariable("id") int id)
{

	return repo.getEmployeeById(id);
}	

@PutMapping("/employees/{id}")
public Employee updateEmployee(@RequestBody Employee employ,@PathVariable("id") int id )
{
	   this.eservice.updateUser(employ,id);
	   return employ;
}
 



@DeleteMapping("/employees/{id}")
public void deleteEmployee(@PathVariable("id") int id)
{

	this.repo.deleteById(id);
}



}
