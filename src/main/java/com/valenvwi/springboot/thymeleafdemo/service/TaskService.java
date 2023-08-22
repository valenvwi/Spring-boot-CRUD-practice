package com.valenvwi.springboot.thymeleafdemo.service;

import java.util.List;

import com.valenvwi.springboot.thymeleafdemo.entity.Task;

public interface TaskService {

	List<Task> findAll();
	
	Task findById(int theId);
	
	void save(Task theTask);
	
	void deleteById(int theId);
	
}
