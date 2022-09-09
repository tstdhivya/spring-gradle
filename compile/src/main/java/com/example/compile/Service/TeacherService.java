package com.example.compile.Service;

import com.example.compile.Controller.TeacherController;
import com.example.compile.DAO.PostDAO;
import com.example.compile.DAO.TeacherDao;
import com.example.compile.DTO.PostDTO;
import com.example.compile.DTO.TeacherDTO;
import com.example.compile.Repository.PostRepository;
import com.example.compile.Repository.TeacherRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class TeacherService {
    @Autowired
   private TeacherRepository teacherRepository;
    private ModelMapper modelMapper=new ModelMapper();
    public TeacherDTO convertDAOtoDTO(TeacherDao teacherDao){
        return modelMapper.map(teacherDao,TeacherDTO.class);}
    public TeacherDao convertDTOtoDAO(TeacherDTO teacherDTO){
        return modelMapper.map(teacherDTO,TeacherDao.class);}
    public TeacherDTO createTeacher(TeacherDTO name){
        TeacherDao NAME=this.convertDTOtoDAO(name);
        NAME=teacherRepository.save(NAME);
        return this.convertDAOtoDTO(NAME);}
    public ArrayList<TeacherDTO>getAllTeacher(){
        List<TeacherDao>name=teacherRepository.findAll();
        ArrayList<TeacherDTO>NAME=new ArrayList<>();
        for (TeacherDao U:name){
            NAME.add(this.convertDAOtoDTO(U));}
        return NAME;
        }
        public TeacherDTO getTeacherId(Integer teacher_id){
        Optional<TeacherDao>NAME=teacherRepository.findById(teacher_id);
        return modelMapper.map(NAME.get(),TeacherDTO.class);
        }
        public TeacherDTO updateTeacher(Integer teacher_id,TeacherDTO name){
        TeacherDao NAME=this.convertDTOtoDAO(name);
        NAME.setId(teacher_id);
        NAME=teacherRepository.save(NAME);
        return this.convertDAOtoDTO(NAME);}
    public void deleteTeacher(Integer teacher_id){
    teacherRepository.deleteById(teacher_id);}
}


