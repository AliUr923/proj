package com.example.proj.demo.repo;

import com.example.proj.demo.model.Task;
import com.example.proj.demo.model.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {
    List<Task> findByTaskList(TaskList tasklist);
}
