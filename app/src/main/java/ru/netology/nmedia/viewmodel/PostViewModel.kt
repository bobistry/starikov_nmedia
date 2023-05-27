package ru.netology.nmedia.viewmodel

import androidx.lifecycle.ViewModel
import ru.netology.nmedia.repository.PostRepositoryInMemoryImpl
import ru.netology.nmedia.repository.PostRepository

class PostViewModel: ViewModel() {
    private val repository: PostRepository = PostRepositoryInMemoryImpl()
    val data = repository.getAll()
    fun likeById(id: Long) = repository.likeById(id)
//    fun share() = repository.share()
//    fun watched() = repository.watched()
}
