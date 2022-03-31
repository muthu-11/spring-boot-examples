package springboot.examples.restapiexample.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import springboot.examples.restapiexample.model.Post;


@Service
public class PostService {

    Map<Integer, Post> posts = new HashMap<>();
    
    public List<Post> getAllPosts(){
        return new ArrayList<>(posts.values());
    }

    public Post addPost(Post postDto){
        int id = posts.size()+1;
        Post post = new Post(id, postDto.getTitle(), postDto.getContent());
        posts.put(id, post);
        return post;
    }

    public Post updatePost(Post post){
        posts.put(post.getId(), post);
        return post;
    }

    public void deletePost(int id){
        posts.remove(id);
    }
}
