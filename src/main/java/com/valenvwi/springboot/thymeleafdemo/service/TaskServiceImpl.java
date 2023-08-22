package com.valenvwi.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valenvwi.springboot.thymeleafdemo.dao.TaskRepository;
import com.valenvwi.springboot.thymeleafdemo.entity.Task;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;
	
	@Autowired
	public TaskServiceImpl(TaskRepository theTaskRepository) {
		taskRepository = theTaskRepository;
	}
	
	@Override
	public List<Task> findAll() {
		return taskRepository.findAllByOrderByTitleAsc();
	}

	@Override
	public Task findById(int theId) {
		Optional<Task> result = taskRepository.findById(theId);
		
		Task theTask = null;
		
		if (result.isPresent()) {
			theTask = result.get();
		}
		else {
			throw new RuntimeException("couldn't find task id - " + theId);
		}
		
		return theTask;
	}

	@Override
	public void save(Task theTask) {
		taskRepository.save(theTask);
	}

	@Override
	public void deleteById(int theId) {
		taskRepository.deleteById(theId);
	}

}






