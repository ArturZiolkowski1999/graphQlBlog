package com.graphqlBlog.graphqlBlog.models

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*
import kotlin.random.Random
import javax.persistence.criteria.CriteriaBuilder.In

@Entity
@Table(name = "posts")
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = Random.nextInt(100000),
    val body: String,
    val author: String
)