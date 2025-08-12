package com.lms.user_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.lms.user_service.clients.CourseClient;
import com.lms.user_service.dto.UserDTO;
import com.lms.user_service.entity.User;
import com.lms.user_service.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
//	@Autowired
//	private CourseClient courseClient;
//	
//	public String getCourseWelcome() {
//		return courseClient.getWelcome();
//	}
	
	public String register(UserDTO userdto) {
		
		User user =new User();
		user.setEmail(userdto.email);
		user.setUserName(userdto.userName);
		user.setPassword(passwordEncoder.encode(userdto.password));
		userRepository.save(user);
		return "register successfull";
	}
	
	
	public String login(String email,String password) {
		User user=userRepository.findByEmail(email);
		if (user == null) {
	        throw new RuntimeException("User not found with email: " + email);
	    }

		if(!user.getEmail().equals(email) || !passwordEncoder.matches(password,user.getPassword())) {
			return "user not found";
		}
		
		return "login successfully";
	}
	
	public User getUserById(Long id) {
		User user=userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
		return user;
	}

}
