package com.example.simple_rest_project.controller;

import com.example.simple_rest_project.mdoel.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {
        throw new IllegalArgumentException("Not implemented yet");
    }

    @GetMapping("/posts")
    public Post getSinglePost() {
        throw new IllegalArgumentException("Not implemented yet");
    }


}
