package com.example.compile.Controller;

import com.example.compile.DTO.PostDTO;
import com.example.compile.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class PostController {
    @Autowired
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
      return postService.createPost(postDTO);
    }
    @GetMapping("/post")
    public ArrayList<PostDTO>getAllPost(){
        return postService.getAllPost();
    }
    @GetMapping("/post/{post_id}")
    public PostDTO getPostId(@PathVariable("post_id")Integer post_id){
        return postService.getPostId(post_id);
    }
    @PutMapping("/post/{post_id}")
    public PostDTO updatePost(@PathVariable("post_id")Integer post_id,@RequestBody PostDTO name){
        return postService.updatePost(post_id,name);
    }
    @DeleteMapping("/post/{post_id}")
    public void deletePost(@PathVariable("post_id")Integer post_id){
        postService.deletePost(post_id);
    }
}
