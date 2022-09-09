package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class StudentController {
    ArrayList<Teacher> teachers=new ArrayList<Teacher>();
    @GetMapping("/user1")
    public ArrayList<Teacher> getName(){
        return teachers;
    }


}
