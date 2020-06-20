package com.example.proj.demo.service;

import com.example.proj.demo.model.Task;
import com.example.proj.demo.model.TaskList;

import java.util.List;

public interface TaskService {
    List<TaskList> findAllTaskLists();

    List<Task> findAllTasksByTaskList(TaskList taskList);

    Task save(Task task);

    TaskList save(TaskList taskList);

}
