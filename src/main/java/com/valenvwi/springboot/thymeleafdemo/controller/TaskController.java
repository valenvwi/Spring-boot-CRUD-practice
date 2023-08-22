package com.valenvwi.springboot.thymeleafdemo.controller;

import com.valenvwi.springboot.thymeleafdemo.entity.Task;
import com.valenvwi.springboot.thymeleafdemo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

	private TaskService taskService;

	public TaskController( TaskService theTaskService){
		taskService = theTaskService;
	}


	// add mapping for "/list"

	@GetMapping("/list")
	public String listTasks(Model theModel) {
		List<Task> theTasks = taskService.findAll();

		// add to the spring model
		theModel.addAttribute("tasks", theTasks);

		return "tasks/list-tasks";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		Task theTask = new Task();
		theModel.addAttribute("task", theTask);
		return "tasks/task-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("taskId") int theId, Model theModel){
		Task theTask = taskService.findById(theId);
		theModel.addAttribute("task", theTask);
		return "tasks/task-form";
	}

	@PostMapping("/save")
	public String saveTask(@ModelAttribute("task") Task theTask){
		taskService.save(theTask);
		return "redirect:/tasks/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("taskId") int theId){
		taskService.deleteById(theId);
		return "redirect:/tasks/list";
	}
}









