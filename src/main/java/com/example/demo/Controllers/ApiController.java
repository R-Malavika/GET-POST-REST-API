package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Services.ApiService;

@RestController

public class ApiController {

@Autowired 

ApiService stuService;

@PostMapping("/add")

public Employee addInfo(@RequestBody Employee st) {

return stuService.saveDetails(st);

}

@GetMapping("/show")

public List<Employee>fetchDetails()

{

return stuService.getDetails();

}

}