package com.example.simple_rest_project.repository;

import com.example.simple_rest_project.mdoel.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


    //List<Post> findAllByTitle(String title);
    //@Query("Select p From Post p left join fetch p.comment")
    @Query("Select p From Post p")
    List<Post> findAllPosts(Pageable page);
}
