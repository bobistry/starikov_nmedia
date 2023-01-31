package ru.netology.nmedia

data class Post (
    val id: Int,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int = 0,
    var share: Int = 0,
    var watched: Int = 0,
    var likedByMe: Boolean = false
)
