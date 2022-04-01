package springboot.examples.restapiwithmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.examples.restapiwithmysql.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
    
}
