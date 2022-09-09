package com.example.compile.Service;

import com.example.compile.DAO.PostDAO;
import com.example.compile.DTO.PostDTO;
import com.example.compile.HIbernet.PostHibernet;
import com.example.compile.Repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class PostService {
    @Autowired
    PostRepository postRepository;

//     @Autowired
//     PostHibernet postHibernet;
    private ModelMapper modelMapper = new ModelMapper();

    public PostDTO convertDAOtoDTO(PostDAO postDAO) {
        return modelMapper.map(postDAO, PostDTO.class);
    }

    public PostDAO convertDTOtoDAO(PostDTO postDTO) {
        return modelMapper.map(postDTO, PostDAO.class);
    }

    public PostDTO createPost(PostDTO name) {
        PostDAO NAME=this.convertDTOtoDAO(name);
        NAME=postRepository.save(NAME);
        return this.convertDAOtoDTO(NAME);
    }
    public ArrayList<PostDTO>getAllPost(){
        List<PostDAO> name=postRepository.findAll();
        ArrayList<PostDTO>NAME=new ArrayList<>();
        for (PostDAO U:name) {
            NAME.add(this.convertDAOtoDTO(U));
        }
    return NAME;
    }
    public PostDTO getPostId(Integer post_id){
        Optional<PostDAO>NAME=postRepository.findById(post_id);
        return modelMapper.map(NAME.get(),PostDTO.class);
    }
    public PostDTO updatePost(Integer post_id,PostDTO name){
        PostDAO NAME=this.convertDTOtoDAO(name);
        NAME.setId(post_id);
        NAME=postRepository.save(NAME);
        return this.convertDAOtoDTO(NAME);}
    public void deletePost(Integer post_id){
        postRepository.deleteById(post_id);}}