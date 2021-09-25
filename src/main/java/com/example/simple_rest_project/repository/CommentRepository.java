package com.example.simple_rest_project.repository;

import com.example.simple_rest_project.mdoel.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByIdIn(List<Long> ids);
}
