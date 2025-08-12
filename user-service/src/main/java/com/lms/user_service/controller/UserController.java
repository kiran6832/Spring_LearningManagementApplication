package com.lms.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.user_service.dto.LoginRequest;
import com.lms.user_service.dto.UserDTO;
import com.lms.user_service.entity.User;
import com.lms.user_service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public String userRegistration(@RequestBody UserDTO usedto) {
		return userService.register(usedto);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id){
		return ResponseEntity.ok(userService.getUserById(id));
		
	}
	
	@PostMapping("/login")
	public String userLogin(@RequestBody LoginRequest loginRequest) {
		return userService.login(loginRequest.getEmail(),loginRequest.getPassword());
		
	}

}
