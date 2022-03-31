package springboot.examples.restapiexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.examples.restapiexample.model.Post;
import springboot.examples.restapiexample.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping
    Post addPost( @RequestBody Post post){
        return postService.addPost(post);
    }

    @PutMapping
    Post updatePost(@RequestBody Post post){
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    void deletePost(@PathVariable int id){
        postService.deletePost(id);
    }

}
