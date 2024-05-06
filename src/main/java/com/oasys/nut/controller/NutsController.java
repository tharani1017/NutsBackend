package com.oasys.nut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oasys.nut.entity.NutsEntity;
import com.oasys.nut.service.NutsService;

@RestController
@RequestMapping(value="/insert")
@CrossOrigin(origins="*")
public class NutsController {
	
@Autowired
NutsService ns;
@RequestMapping(value="/data")
public NutsEntity insertdata(@RequestBody NutsEntity n ) {
	return ns.insertdata(n);
}

}
