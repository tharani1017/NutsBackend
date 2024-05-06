package com.oasys.nut.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.oasys.nut.entity.NutsEntity;

public interface NutsRepository extends JpaRepositoryImplementation<NutsEntity, Integer>{

}
