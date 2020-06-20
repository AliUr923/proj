package com.example.proj.demo;

import com.example.proj.demo.model.TaskList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjApplication{


    public static void main(String[] args) {
        SpringApplication.run(ProjApplication.class, args);
    }

}
