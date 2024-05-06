package com.oasys.nut.controller;

import java.io.IOException;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.nut.entity.RegisterEntity;
import com.oasys.nut.entity.UserLog;
import com.oasys.nut.service.UserService;

@RestController
@RequestMapping(value = "user")
@CrossOrigin(origins ="http://localhost:4200")

public class UserController {
	@Autowired
	UserService userser;

	@GetMapping(value = "/msg")
	public String getmsg() {
		return "Hello";
	}
	@PostMapping(value="/insert")
	public RegisterEntity UserSign (@RequestBody RegisterEntity reg) {
		return userser.UserSign(reg);
	}

	@PostMapping(value = "/login")
	public RegisterEntity checkLogin(@RequestBody UserLog userlog) throws DataFormatException, IOException {

		return userser.checkLogin(userlog);

	}
}
