package com.example.demo.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;
@Service
public class ApiService {
	@Autowired 
    EmployeeRepo stRepo; 
	
	public Employee saveDetails(Employee e) {
		return stRepo.save(e);
	}
	public List <Employee>getDetails()

{
		return stRepo.findAll();
		
}
	public Employee UpdateDetails(Employee e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}