package com.example.Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CrudController {
    @Autowired
    private CrudService crudService;
    @PostMapping("/postDetails")
    public CrudDto createCrud(@RequestBody CrudDto crudDto){
        return   crudService.createCrud(crudDto);
    }
    @GetMapping("/getDetails")
    public ArrayList<CrudDto> getAllUser(){
        return crudService.getAllPost();
    }
//    @GetMapping("/getCrud")
//    public ArrayList<CrudDto>getAllPost(){
//        return crudService.getAllPost();
//    }
    @GetMapping("/crudId/{crud_id}")
    public CrudDto getCrudById(@PathVariable("crud_id")Integer crud_id){
        return crudService.getCrudById(crud_id);}
}
