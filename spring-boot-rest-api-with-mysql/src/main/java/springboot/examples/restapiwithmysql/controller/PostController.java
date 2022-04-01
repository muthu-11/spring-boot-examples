package springboot.examples.restapiwithmysql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.examples.restapiwithmysql.model.Post;
import springboot.examples.restapiwithmysql.service.PostService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @GetMapping("/{id}")
    Post getPostById(@PathVariable int id){
        return postService.findPostById(id);
    }

    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postService.createOrUpdatePost(post);
    }

    @PutMapping
    Post updatePost(@RequestBody Post post){
        return postService.createOrUpdatePost(post);
    }
    
    @DeleteMapping("/{id}")
    void deletePost(@PathVariable int id){
        postService.deletePostById(id);
    }

}
