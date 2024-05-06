package com.oasys.nut.service;

import java.io.IOException;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.nut.dao.UserDao;
import com.oasys.nut.entity.RegisterEntity;
import com.oasys.nut.entity.UserLog;

@Service
public class UserService {
	@Autowired
	UserDao userdao;

	public RegisterEntity checkLogin(UserLog userLog) throws DataFormatException, IOException {
	    return userdao.login(userLog);
	}

	public RegisterEntity UserSign(RegisterEntity reg) {
		return userdao.UserSign(reg);
	}

	
}
