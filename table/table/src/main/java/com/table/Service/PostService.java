package com.table.Service;

import com.table.DAO.PostDAO;
import com.table.Dto.PostDTO;
import com.table.Repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    private ModelMapper modelMapper=new ModelMapper();
   public PostDAO convertDtoToDao(PostDTO postDTO){
       return modelMapper.map( postDTO,PostDAO.class);
   }
   public PostDTO convertDaoToDto(PostDAO postDAO){
       return modelMapper.map(postDAO,PostDTO.class);
   }
   public PostDTO createPost(PostDTO postDTO){
       PostDAO postDAO=this.convertDtoToDao(postDTO);
       postDAO =postRepository.save(postDAO);
       return modelMapper.map(postDAO,PostDTO.class);
   }
   public PostDTO getPostById(Integer post_id){
       Optional<PostDAO> postDAO=postRepository.findById((post_id));
       return modelMapper.map(postDAO.get(),PostDTO.class);
   }
   public ArrayList<PostDTO>getAllPost(){
       List<PostDAO> postDAOS=postRepository.findAll();
       ArrayList<PostDTO> postDTOS=new ArrayList<>();
       for (PostDAO postDAO:postDAOS){
           postDTOS.add(modelMapper.map(postDAO,PostDTO.class));
       }
       return postDTOS;
   }
}
