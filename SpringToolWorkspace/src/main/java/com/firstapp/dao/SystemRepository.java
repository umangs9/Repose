package com.firstapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.firstapp.model.System;

@Repository
public interface SystemRepository extends CrudRepository<System, Long> {
	public default String hello() {
		return "hello";
	}
}
