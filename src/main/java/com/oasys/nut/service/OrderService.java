package com.oasys.nut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.nut.dao.OrderDao;
import com.oasys.nut.entity.OrderInfo;

@Service
public class OrderService {
	@Autowired
	OrderDao od;

	public OrderInfo insertData(OrderInfo o) {
		return od.insertData(o);
	}

}
