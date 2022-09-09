package com.example.compile.Controller;

import com.example.compile.DTO.PostDTO;
import com.example.compile.DTO.TeacherDTO;
import com.example.compile.Service.PostService;
import com.example.compile.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class TeacherController {
    @Autowired
private TeacherService teacherService;
    public TeacherController(TeacherService teacherService){
        this.teacherService=teacherService;
    }@PostMapping("/teacher")
    public TeacherDTO createTeacher(@RequestBody TeacherDTO teacherDTO){
        return teacherService.createTeacher(teacherDTO);
    }
    @GetMapping("/teacher")
    public ArrayList<TeacherDTO>getAllTeacher(){
        return teacherService.getAllTeacher();}
    @GetMapping("/teacher/{teacher_id}")
    public TeacherDTO getTeacherId(@PathVariable("teacher_id")Integer teacher_id){
        return teacherService.getTeacherId(teacher_id);
    }
    @PutMapping("/teacher/{teacher_id}")
   public TeacherDTO updateTeacher(@PathVariable("teacher_id")Integer teacher_id,@RequestBody TeacherDTO name){
        return teacherService.updateTeacher(teacher_id,name);
    }
    @DeleteMapping("/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")Integer teacher_id){
       teacherService.deleteTeacher(teacher_id);
    }

}

