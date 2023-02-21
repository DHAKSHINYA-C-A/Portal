package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController 
{
       private String color="Green";
       @GetMapping("/")
       public String display()
       {
    	   return "My favourite color is "+color;
       }
 
       
}
