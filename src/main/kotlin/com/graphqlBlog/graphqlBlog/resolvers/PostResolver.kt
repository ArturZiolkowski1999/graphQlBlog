package com.graphqlBlog.graphqlBlog.resolvers

import com.graphqlBlog.graphqlBlog.models.Post
import com.graphqlBlog.graphqlBlog.services.PostService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class PostResolver(private val postService: PostService) {

    @QueryMapping
    fun getPosts(): List<Post>{
        return postService.getAllPosts()
    }

}