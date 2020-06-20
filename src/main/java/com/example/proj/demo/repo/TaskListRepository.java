package com.example.proj.demo.repo;

import com.example.proj.demo.model.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository <TaskList, Long> {
}
