package com.example.user.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/userCreate")
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }
    @GetMapping("/user")
    public ArrayList<UserDto> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/userId/{user_id}")
    public UserDto getUserId(@PathVariable("user_id")Integer user_id){
        return userService.getUserById(user_id);}
    @PutMapping("/userUpdate/{user_id}")
    public UserDto updateUser(@PathVariable("user_id")Integer user_id, @RequestBody UserDto name){
        return userService.updateUser(user_id,name);
    }
    @DeleteMapping("/userDelete/{user_id}")
    public void deleteUser(@PathVariable("user_id")Integer user_id){
        userService.deleteUser(user_id);
    }


}
