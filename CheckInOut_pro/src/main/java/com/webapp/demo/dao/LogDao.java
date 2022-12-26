package com.webapp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.classlog.CheckLog;

public interface LogDao extends JpaRepository<CheckLog,Integer >{
	
	@Query(value="select * from class_log where date= ?1",nativeQuery = true)
	List<CheckLog> findAllByDate(String date);
}