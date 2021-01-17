package com.nh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nh.entity.CityEntity;
import com.nh.repository.CityRepository;

public class CitySeviceImpl  implements CityService{
     @Autowired
     private CityRepository repo;

	@Override
	public List<CityEntity> getAllCity() {
		    List<CityEntity> findAll = repo.findAll();
		return  findAll;
	}

	
	
	}


