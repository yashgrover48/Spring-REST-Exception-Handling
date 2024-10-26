package com.demo.controller;

import com.demo.entity.Student;
import com.demo.rest.StudentErrorResponse;
import com.demo.rest.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

	
	@GetMapping("/health")
	public String getHealth(){
		System.out.println("Inside getHealth in DemoController");
		return "UP";
	}
}
