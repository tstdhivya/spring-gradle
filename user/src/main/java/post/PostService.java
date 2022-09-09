package post;

import com.example.user.user.UserDao;
import com.example.user.user.UserDto;
import com.example.user.user.UserRepository;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class PostService {
    @Autowired
    private static PostRepository postRepository;
    private static ModelMapper modelMapper = new ModelMapper();

    public PostDto convertDaoToDto(PostDao postDao) {
        return modelMapper.map(postDao, PostDto.class);
    }

    public PostDao convertDtoToDao(PostDto postDto) {
        return modelMapper.map(postDto, PostDao.class);
    }

    public  ArrayList<PostDto> getAllPost() {
        List<PostDao> name = postRepository.findAll();
        ArrayList<PostDto> names=new ArrayList<PostDto>();
        for (PostDao u: name){
            names.add(this.convertDaoToDto(u));
        }
        return names;
    }
    public static PostDto getPostById(Integer post_id){
        Optional<PostDao> names=postRepository.findById(post_id);
        return modelMapper.map(names.get(), PostDto.class);
    }
   public PostDto createPost(PostDto name) {
        PostDao names=this.convertDtoToDao(name);
        names=postRepository.save(names);
        return this.convertDaoToDto(names);
        //  return modelMapper.map(UserDao,UserDto.class)

    }
//   public PostDto updatePost(int post_id, PostDto name){
//        PostDao names=this.convertDtoToDao(name);
//        names.setId(post_id);
//        names=postRepository.save(names);
//        return this.convertDaoToDto(names);
//    }
    public static void deletePost(Integer post_id){
        postRepository.deleteById(post_id);
    }


}
