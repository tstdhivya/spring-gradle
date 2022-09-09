package com.example.demo9;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    ArrayList<StudentService> students = new ArrayList<StudentService>();

    public ArrayList<StudentService> getStudents(){
        return students;
    }

    public StudentService getStudentById(String student_id){
        StudentService result = null;
        for(int i = 0;i<students.size();++i)
         {
if(students.get(i).getId().equals(student_id){
           result students.get(i)}}
        return result;
    }

    public String createStudent(StudentService student) {
        students.add(student);
        return "success";
    }


    public void updateStudent(String student_id, StudentService student){
        for (StudentService stu: students) {
            if(stu.getId().equals(student_id)){
                stu.setFatherName(student.getFatherName());
                stu.setName(student.getName());
                stu.setAge(student.getAge());
                break;
            }
        }
    }

    public void deleteStudent(String student_id){
        ArrayList<StudentService> new_list = new ArrayList<StudentService>();
        for (StudentService student: students){
            if(!student.getId().equals(student_id)){
                new_list.add(student);
            }
        }
        students = new_list;
    }}









