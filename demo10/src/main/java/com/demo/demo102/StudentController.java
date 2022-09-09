package com.demo.demo102;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student") //Read
    public ArrayList<Student> getName(){
        return studentService.getStudents();
    }

    @GetMapping("/student/{student_id}") //Read
    public Student getStudentById(@PathVariable("student_id") String student_id){
        return studentService.getStudentById(student_id);
    }

    @PostMapping("/student") //Create
    public String saveName(@RequestBody Student student){
        studentService.createStudent(student);
        return "success";
    }

    @PutMapping("/student/{student_id}") //Update
    public void updateName(@PathVariable("student_id") String student_id, @RequestBody Student student){
        studentService.updateStudent(student_id, student);
    }

    @DeleteMapping("/student/{student_id}") //delete
    public void deleteName(@PathVariable("student_id") String student_id){
        studentService.deleteStudent(student_id);
    }

}


