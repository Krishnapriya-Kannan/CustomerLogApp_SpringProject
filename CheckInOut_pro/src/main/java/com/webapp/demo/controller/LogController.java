package com.webapp.demo.controller;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.classlog.CheckLog;
import com.webapp.demo.dao.LogDao;

@RestController
public class LogController {
	@Autowired
	LogDao dao;
	@RequestMapping(path="/checkIn")
	@ResponseBody
	public void CheckIn(@RequestParam String name,CheckLog obj){
		obj.setClogType("in");
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		obj.setCdate(date.toString());
		obj.setCtime(time.toString());
		obj.setCid(name+time.toString());
		dao.save(obj);
		System.out.println("checkIn added "+ name);
		
	}
	
	@RequestMapping(path="/checkOut")
	@ResponseBody
	public void CheckOut(@RequestParam String name,CheckLog obj){
		obj.setClogType("out");
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		obj.setCdate(date.toString());
		obj.setCtime(time.toString());
		obj.setCid(name+time.toString());
		dao.save(obj);
		System.out.println("checkout check"+ name);
		
	}
	
	@RequestMapping(path="/getLog")
	@ResponseBody
	public List<CheckLog> GetLogByDate(@RequestParam String date,CheckLog obj){
		
		
		System.out.println("getLog shows"+ date);
		return dao.findAllByDate(date);
	
}
	@RequestMapping(path="/getAllLog")
	@ResponseBody
	public List<CheckLog> GetAllLog(){
		System.out.println("getLog shows all log");
		return dao.findAll();
	
}
	
}