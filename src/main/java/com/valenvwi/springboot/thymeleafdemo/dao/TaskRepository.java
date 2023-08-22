package com.valenvwi.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valenvwi.springboot.thymeleafdemo.entity.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	public List<Task> findAllByOrderByTitleAsc();
	
}
