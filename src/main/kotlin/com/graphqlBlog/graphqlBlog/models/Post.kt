package com.graphqlBlog.graphqlBlog.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "posts")
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID = UUID.randomUUID(),
    val body: String,
    val author: String
)