package com.example.proj.demo.model;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "tasklist_id")
    private TaskList taskList;

    @PostLoad
    public void afterLoad() {
        if (status == null) {
            status = Status.TODO;
        }
    }

    public enum Status {
        TODO, PROGRESS, COMPLETED
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setProject(TaskList taskList) {
        this.taskList = taskList;
    }

}
