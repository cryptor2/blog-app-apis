package com.prince.blog.blogappapis.services.impl;

import com.prince.blog.blogappapis.entities.Post;
import com.prince.blog.blogappapis.payload.PostDto;

import java.util.List;

public interface PostService {
    Post createPost(PostDto postDto, Integer userId, Integer categoryId);

    Post createPost(PostDto postDto);

    Post updatePost(PostDto postDto, Integer postId);

    void delete(Integer postId);

    List<Post> getAllPost();

    Post getPostById(Integer postId);

    List<Post> getAllPostByCategory(Integer categoryId)    ;

    List<Post> getAllPostByUser(Integer userId);

    List<Post> searchPosts(Integer userId);

}
