package com.oasys.nut.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.oasys.nut.entity.RegisterEntity;

public interface UserRepository extends JpaRepositoryImplementation<RegisterEntity, Integer> {
	
	RegisterEntity findByFirstname(String firstname);

}
