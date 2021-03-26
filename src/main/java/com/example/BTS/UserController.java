package com.example.BTS;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTS.service.BugService;

@RestController
public class UserController {
	Logger logger=java.util.logging.Logger.getLogger(UserController.class.getName());
	@Autowired
	BugService bugService;
	@GetMapping("/hello")
	String hello() {
		logger.setLevel(Level.SEVERE);
		logger.log(Level.WARNING,bugService.hashCode()+"printed" );
		return "Hello";
	}
	
} 

