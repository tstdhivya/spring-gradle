package com.table.Controller;

import com.table.Dto.PostDTO;
import com.table.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("/posts")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return postService.createPost(postDTO);}
    @GetMapping("/posts/{post_id}")
    public PostDTO getPostById(@PathVariable("post_id")Integer post_id){
        return postService.getPostById(post_id);
    }
    @GetMapping("/post")
    public ArrayList<PostDTO>getAllPost(){
        return postService.getAllPost();
    }




}
