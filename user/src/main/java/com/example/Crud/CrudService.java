package com.example.Crud;

import com.example.user.user.UserDao;
import com.example.user.user.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

@Service

public class CrudService {
    @Autowired
    private CrudRepository crudRepository;
    private ModelMapper modelMapper=new ModelMapper();
    public CrudDto convertDaoToDto(CrudDao crudDao) {
        return modelMapper.map(crudDao, CrudDto.class);
    }

    public CrudDao convertDtoToDao(CrudDto crudDto) {
        return modelMapper.map(crudDto, CrudDao.class);
    }
        public CrudDto createCrud(CrudDto name){
        CrudDao names=modelMapper.map(name,CrudDao.class);
        return names;
    }
         public ArrayList<CrudDto>getAllPost(){
        List<CrudDao> crudDaos=crudRepository.findAll();
        ArrayList<CrudDto>crudDtoArrayList=new ArrayList<CrudDto>();
        for (CrudDao obj:crudDaos){
            crudDtoArrayList.add(this.convertDaoToDto(obj));

        }
        return crudDtoArrayList;
    }
        public CrudDto getCrudById(Integer crud_id) {
            Optional<CrudDao> names = crudRepository.findById(crud_id);
            return modelMapper.map(names.get(), CrudDto.class);
        }
}

