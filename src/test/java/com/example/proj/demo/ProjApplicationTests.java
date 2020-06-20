package com.example.proj.demo;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.data.domain.ExampleMatcher.matching;

import com.example.proj.demo.model.TaskList;
import com.example.proj.demo.repo.TaskListRepository;
import org.junit.Before;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;




@SpringBootTest
public class ProjApplicationTests {
    @Autowired
    private TaskListRepository taskListRepository;
    TaskList innovation;
    TaskList insightReport;
    TaskList bigQuantity;


    @Before
    public void setUp(){
        taskListRepository.deleteAll();
        innovation = taskListRepository.save(new TaskList("innovation"));
        insightReport = taskListRepository.save(new TaskList("insight-report"));
        bigQuantity = taskListRepository.save(new TaskList("big-Quantity"));
    }


    @Test
    public void findAllWithParams() {
        Example<TaskList> example = Example.of(new TaskList("innovation"));
        assertThat(taskListRepository.findAll(example), hasItem(innovation));
    }

    @Test
    public void countByExample() {
        Example<TaskList> taskListExample = Example.of(new TaskList("innovation"));
        assertEquals(taskListRepository.count(taskListExample), is(1L));
    }

    @Test
    public void substringMatching() {
        Example<TaskList> example = Example.of(new TaskList("in"), matching().withStringMatcher(ExampleMatcher.StringMatcher.STARTING));
        assertEquals(taskListRepository.findAll(example), hasItems(innovation, insightReport));
    }


}
