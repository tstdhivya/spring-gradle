package post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostController {
        @Autowired
        private PostService postService;
        @PostMapping("/PostCreate")
        public PostDto createPostDetails(@RequestBody PostDto postDto){
            return postService.createPost(postDto);
        }
        @GetMapping("/postUser")
        public ArrayList<PostDto> getAllPost(){
            return postService.getAllPost();
        }
        @GetMapping("/PostId/{post_id}")
        public PostDto getPostId(@PathVariable("post_id")Integer post_id){
            return PostService.getPostById(post_id);}

    @DeleteMapping("/PostDelete/{post_id}")
    public void deletePost(@PathVariable("post_id")Integer post_id){
        PostService.deletePost(post_id);
    }


}
