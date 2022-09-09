package com.demo.demo10;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TeacherConstructor {
    ArrayList<Teacher> name=new ArrayList<Teacher>();
    @GetMapping("/name1")
    public ArrayList<Teacher> getName(){
        return name;
    }
    @GetMapping("/name2/{teacher_id}")
    public Teacher getStudentById(@PathVariable("teacher_id")String teacher_id){
        Teacher result=null;
        for(int i=0;i< name.size();i++){
            if(name.get(i).getId().equals(teacher_id)){
                result=name.get(i);
                break;
            }
        }
        return result;
    }
    @PostMapping("/name3")
    public String saveName(@RequestBody Teacher nameObj){
        name.add(nameObj);
        return "success";
    }
    @PutMapping("/name5/{teacher_id}")
        public void updateName(@PathVariable("teacher_id") String teacher_id,@RequestBody Teacher names){
        for(Teacher t1: name){
            if(t1.getId().equals(teacher_id)){
                t1.setName(names.getName());
                t1.setAge(names.getAge());
                t1.setLocation(names.getLocation());
                t1.setSalary(names.getSalary());
                break;
            }}}
    @DeleteMapping("/name6/{teacher_id}")
    public void deleteName(@PathVariable("teacher_id")String teacher_id){
        ArrayList<Teacher> new_list=new ArrayList<Teacher>();
        for (Teacher t2:name){
            if(!t2.getId().equals(teacher_id)){
                new_list.add(t2);
            }
        }
        name=new_list;
    }
}
