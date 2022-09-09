package com.example.demo8.employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Staff1 {
    @PostMapping("/name")
    public ArrayList<Staff> getName(){

    }
}
