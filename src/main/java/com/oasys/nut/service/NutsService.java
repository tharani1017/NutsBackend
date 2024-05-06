package com.oasys.nut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.nut.dao.NutsDao;
import com.oasys.nut.entity.NutsEntity;
@Service
public class NutsService {
@Autowired
NutsDao nd;
	public NutsEntity insertdata(NutsEntity n) {
		return nd.insertdata(n);
	}

}
