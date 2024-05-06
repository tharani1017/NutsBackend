package com.oasys.nut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.nut.entity.OrderInfo;
import com.oasys.nut.service.OrderService;


@RestController
@RequestMapping(value="/add")
@CrossOrigin(origins="*")
public class OrderController {

	@Autowired
	OrderService os;
	@PostMapping(value="/insert")
	public OrderInfo insertData(@RequestBody OrderInfo o) {
		return os.insertData(o);
	}
	
}
