package com.oasys.nut.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.nut.entity.OrderInfo;
import com.oasys.nut.repo.OrderRepository;


@Repository
public class OrderDao {
	@Autowired
	OrderRepository or;

	public OrderInfo insertData(OrderInfo o) {
		return or.save(o);
	}
}

