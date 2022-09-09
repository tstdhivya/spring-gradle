package com.demo.demo101;

import com.demo.demo10.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    ArrayList<Employee> user=new ArrayList<Employee>();
    @GetMapping("/name7")
    public ArrayList<Employee> getUser(){
        return user;
    }
    @GetMapping("/name8/{user_id}")
    public Employee getEmployeeById(@PathVariable("user_id")String user_id){
        Employee result=null;
        for(int i=0;i< user.size();i++){
            if(user.get(i).getId().equals(user_id)){
                result=user.get(i);
                break;
            }
        }
        return result;
    }
    @PostMapping("/name9")
    public String saveName(@RequestBody Employee nameObj){
        user.add(nameObj);
        return "success";
    }
    @PutMapping("/name10/{user_id}")
    public void updateName(@PathVariable("user_id") String user_id,@RequestBody Employee names){
        for(Employee t1: user) {
            if (t1.getId().equals(user_id)) {
                t1.setName(names.getName());
                t1.setWorkingHours(names.getWorkingHours());
                t1.setSalary(names.getSalary());
                t1.setYearOfJoining(names.getYearOfJoining());
                break;
            }}}
    @DeleteMapping("/name11/{user_id}")
    public void deleteName(@PathVariable("user_id")String user_id){
        ArrayList<Employee> new_list=new ArrayList<Employee>();
        for (Employee t2: user){
            if(!t2.getId().equals(user_id)){
                new_list.add(t2);
            }
        }
        user=new_list;
    }
}