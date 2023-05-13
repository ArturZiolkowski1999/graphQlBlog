package com.graphqlBlog.graphqlBlog.repositories

import com.graphqlBlog.graphqlBlog.models.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post, Long>