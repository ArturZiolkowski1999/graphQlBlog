package com.graphqlBlog.graphqlBlog.resolvers

import com.graphqlBlog.graphqlBlog.models.Post
import com.graphqlBlog.graphqlBlog.services.PostService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.*
import kotlin.random.Random

@Controller
class PostResolver(private val postService: PostService) {

    @QueryMapping
    fun getPosts(): List<Post>{
        return postService.getAllPosts()
    }

    @MutationMapping
    fun createPost(@Argument body: String, @Argument author: String): Post {
        val newPost =  Post(
            id = Random.nextInt(100000),
            author = author,
            body = body
        )
        postService.savePost(newPost)
        return newPost
    }

}