package com.example.proj.demo.service;

import com.example.proj.demo.model.Task;
import com.example.proj.demo.model.TaskList;
import com.example.proj.demo.repo.TaskListRepository;
import com.example.proj.demo.repo.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    private TaskListRepository taskListRepository;

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskList> findAllTaskLists() {
        return taskListRepository.findAll();
    }

    public List<Task> findAllTasksByTaskList(TaskList taskList) {
        return taskRepository.findByTaskList(taskList);
    }

    @Transactional
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Transactional
    public TaskList save(TaskList taskList) {
        return taskListRepository.save(taskList);
    }

}
