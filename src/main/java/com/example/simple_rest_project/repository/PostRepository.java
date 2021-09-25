package com.example.simple_rest_project.repository;

import com.example.simple_rest_project.mdoel.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
