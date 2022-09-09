package com.example.Crud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CrudDto {
    private Integer id;
    private String name;
    private String location;
    private  int age;
    private String phoneNumber;
}
