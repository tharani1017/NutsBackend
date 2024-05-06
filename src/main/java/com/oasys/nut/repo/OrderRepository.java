package com.oasys.nut.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.nut.entity.OrderInfo;

public interface OrderRepository extends JpaRepository<OrderInfo, Long>{

}
