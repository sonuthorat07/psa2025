package com.crm.service;

import com.crm.entity.Post;
import com.crm.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }

    public void deletePost() {
        postRepository.deleteById(1L);
    }
}
