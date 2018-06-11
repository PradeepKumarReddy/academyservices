package com.nia.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nia.services.entity.UserExam;
import com.nia.services.repository.UserExamRepository;

@RestController
@RequestMapping("/api")
public class UserExamController {
	
	@Autowired
	UserExamRepository userExamRepository;
	
	@GetMapping("/userExam/{examId}/{username}")
	public UserExam getUserExam(@RequestParam Long examId, @RequestParam String username) {
		List<UserExam> listExams = userExamRepository.getByIdAndUserName(examId, username);
		
		return listExams.get(0);
	}
	
	@PostMapping("/userExam/add")
	public UserExam addUserExam(@RequestBody UserExam userExam)
	{
		return userExamRepository.save(userExam);
	}
	
	@PostMapping("/userExam/update")
	public UserExam updateUserExam(@RequestBody UserExam userExam)
	{
		System.out.println("updateUserExam called");
		return userExamRepository.save(userExam);
		//turn null;
	}

}
