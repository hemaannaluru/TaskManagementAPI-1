package com.service;

import com.model.Task;
import java.util.List;

public interface TaskService {
	Task createTask(Task task);

	List<Task> getAllTasks();

	Task getTaskById(Long id);

	Task updateTask(Long id, Task taskDetails);

	void deleteTask(Long id);

}
