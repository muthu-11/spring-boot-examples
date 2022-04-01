package springboot.examples.restapiwithmysql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springboot.examples.restapiwithmysql.model.Post;
import springboot.examples.restapiwithmysql.repository.PostRepository;

@Service
public class PostService {

    private final PostRepository postRepository;
    
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post findPostById(int id) {
        return postRepository.getById(id);
    }

    public Post createOrUpdatePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePostById(int id) {
        postRepository.deleteById(id);
    }
    
}
