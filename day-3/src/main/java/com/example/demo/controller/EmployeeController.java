package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;

@Controller
public class EmployeeController {
      @Autowired
      EmployeeRepository repo;
      
      @GetMapping("/getvalues")
      List<EmployeeModel> getList(){
    	  return repo.findAll();
      }
      @PostMapping("/post")
           public EmployeeModel create(@RequestBody EmployeeModel stu) {
    	  return repo.save(stu);
      }

}
