package com.demo.demo102;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    ArrayList<Student> students = new ArrayList<Student>();

    public ArrayList<Student> getStudents(){
        return students;
    }

    public Student getStudentById(String student_id){
        Student result = null;
        for(int i =0 ; i<students.size();i++){
            if(students.get(i).getId().equals(student_id)){
                result = students.get(i);
                break;
            }
        }
        return result;
    }

    public String createStudent(Student student){
        students.add(student);
        return "success";
    }


    public void updateStudent(String student_id, Student student){
        for (Student stu: students) {
            if(stu.getId().equals(student_id)){
                stu.setFatherName(student.getFatherName());
                stu.setName(student.getName());
                stu.setAge(student.getAge());
                break;
            }
        }
    }

    public void deleteStudent(String student_id){
        ArrayList<Student> new_list = new ArrayList<Student>();
        for (Student student: students){
            if(!student.getId().equals(student_id)){
                new_list.add(student);
            }
        }
        students = new_list;
    }


}
