package com.example.simple_rest_project.service;

import com.example.simple_rest_project.mdoel.Post;
import com.example.simple_rest_project.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private static final int PAGE_SIZE = 3;
    private final PostRepository postRepository;

    public List<Post> getPosts(int page) {
        return postRepository.findAllPosts(PageRequest.of(page , PAGE_SIZE));
    }

    public Post getSinglePost(long id) {
        return postRepository.findById(id)
                .orElseThrow();
    }
}
