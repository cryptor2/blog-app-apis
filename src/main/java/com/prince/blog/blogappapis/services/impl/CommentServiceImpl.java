package com.prince.blog.blogappapis.services.impl;

import com.prince.blog.blogappapis.payload.CommentDto;
import com.prince.blog.blogappapis.repositories.CommentRepo;
import com.prince.blog.blogappapis.repositories.PostRepo;
import com.prince.blog.blogappapis.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class CoomentServiceImpl implements CommentService {
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;
    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        return null;
    }

    @Override
    public void deleteCommnet(Integer commentId) {

    }
}
