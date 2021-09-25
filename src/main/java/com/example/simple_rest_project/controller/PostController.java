package com.example.simple_rest_project.controller;

import com.example.simple_rest_project.controller.dto.PostDto;
import com.example.simple_rest_project.mdoel.Post;
import com.example.simple_rest_project.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<PostDto> getPosts(@RequestParam(required = false) int page) {
        int pageNumber = page >= 0 ? page : 0;
//        throw new IllegalArgumentException("Not implemented yet");
        return PostDtoMapper.mapToPostDtos(postService.getPosts(pageNumber));
    }

    @GetMapping("/posts/comments")
    public List<Post> getPostsWithComments(@RequestParam(required = false) int page) {
        int pageNumber = page >= 0 ? page : 0;
        return postService.getPostsWithComments(pageNumber);
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id) {
        return postService.getSinglePost(id);
    }


}
