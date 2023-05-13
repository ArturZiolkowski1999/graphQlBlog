package com.graphqlBlog.graphqlBlog.services

import com.graphqlBlog.graphqlBlog.models.Post
import com.graphqlBlog.graphqlBlog.repositories.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {

    fun getAllPosts(): List<Post> {
        return postRepository.findAll()
    }
}