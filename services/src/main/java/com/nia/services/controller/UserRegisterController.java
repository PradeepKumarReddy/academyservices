package com.nia.services.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nia.services.entity.UserRegister;
import com.nia.services.repository.UserRegisterRepository;

@RestController
@RequestMapping("/api/user")
public class UserRegisterController {
	
	private UserRegisterRepository registerRepository;

    public UserRegisterController(UserRegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @PostMapping("/register")
    public UserRegister register(@RequestBody UserRegister userRegister) {
    	UserRegister savedUser = registerRepository.save(userRegister);
    	return savedUser;
    }

}
