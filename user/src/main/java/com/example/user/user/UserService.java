package com.example.user.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public UserDto convertDaoToDto(UserDao userDao) {
        return modelMapper.map(userDao, UserDto.class);
    }

    public UserDao convertDtoToDao(UserDto userDto) {
        return modelMapper.map(userDto, UserDao.class);
    }

    public  ArrayList<UserDto> getAllUser() {
        List<UserDao> name = userRepository.findAll();
        ArrayList<UserDto> names=new ArrayList<>();
        for (UserDao u: name){
            names.add(this.convertDaoToDto(u));
        }
        return names;
    }
    public UserDto getUserById(Integer user_id){
       Optional<UserDao> names=userRepository.findById(user_id);
       return modelMapper.map(names.get(), UserDto.class);
    }
    public UserDto createUser(UserDto name) {
       UserDao names=this.convertDtoToDao(name);
        names=userRepository.save(names);
        return this.convertDaoToDto(names);
      //  return modelMapper.map(UserDao,UserDto.class)

    }
    public UserDto updateUser(int user_id, UserDto name){
        UserDao names=this.convertDtoToDao(name);
        names.setId(user_id);
        names=userRepository.save(names);
        return this.convertDaoToDto(names);
    }
    public void deleteUser(int user_id){
        userRepository.deleteById(user_id);
    }
}