package com.oasys.nut.dao;

import java.io.IOException;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.oasys.nut.entity.RegisterEntity;
import com.oasys.nut.entity.UserLog;
import com.oasys.nut.repo.UserRepository;
@Repository
public class UserDao {
	 @Autowired
	    private UserRepository userrepo;

	    @Autowired
	    private PasswordEncoder passwordEncoder; // Inject PasswordEncoder

	    public RegisterEntity posted(RegisterEntity value) {
	        // Hash the password before saving to the database
	        String encodedPassword = passwordEncoder.encode(value.getPassword());
	        value.setPassword(encodedPassword);
	        userrepo.save(value);
	        return value;
	    }

	    public RegisterEntity login(UserLog userlog) throws DataFormatException {
	        RegisterEntity user = userrepo.findByFirstname(userlog.getFirstname());

	        if (user != null && passwordEncoder.matches(userlog.getPassword(), user.getPassword())) {
	            return user;
	        }

	        return null;
	    }

	    public RegisterEntity UserSign(RegisterEntity reg) {
	        // Hash the password before saving to the database
	        String encodedPassword = passwordEncoder.encode(reg.getPassword());
	        reg.setPassword(encodedPassword);
	        return userrepo.save(reg);
	    }
}
