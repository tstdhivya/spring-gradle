package com.example.demo8;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    @Autowired
            Service studentService;
    @GetMapping("/user")
    public ArrayList<Teacher> getName(){
        return studentService.getTeachers();
    }
    @GetMapping("/user/{teachers_id}")
    public Teacher getTeacherId(@PathVariable("teachers_id") String teachers_id){
        Teacher result=null;
       return studentService.getTeachers(teachers_id);

    }
    @PostMapping("/user")
    public String saveName(@RequestBody Teacher teachersObj){
        teachers.add(teachersObj);
        return "success";
    }
    @PutMapping("/update/{teachers_id}")
    public void updateName(@PathVariable("teachers_id")String teachers_id,@RequestBody @NotNull Teacher teachersobj){
        for(Teacher t :teachers){
            if(teachersobj.getId().equals(teachers_id)){
                t.setFatherName(teachersobj.getFatherName());
                t.setName(teachersobj.getName());
                t.setAge(teachersobj.getAge());
                break;
            }

        }
    }
    @DeleteMapping("/user/{teachers_id}")
    public void deleteName(@PathVariable("teachers_id") String teachers_id){
        ArrayList<Teacher> new_list=new ArrayList<Teacher>();
        for (Teacher t1:teachers){
            if(!t1.getId().equals(teachers_id)){
                new_list.add(t1);
            }
        }
    teachers=new_list;}
}
