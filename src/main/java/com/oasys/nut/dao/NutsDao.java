package com.oasys.nut.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.nut.entity.NutsEntity;
import com.oasys.nut.repo.NutsRepository;
@Repository
public class NutsDao {
@Autowired
NutsRepository ns;
	public NutsEntity insertdata(NutsEntity n) {
		return ns.save(n);
	}

}
