package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.repository.PostRepository

class PostRepositoryInMemoryImpl: PostRepository {
    private var posts = listOf(
        Post(
        id = 1,
        author = "Нетология. Университет интернет-профессий",
        content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интесивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам от новичков до уверенных профессионалов. Но самое ваное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия - помочь встать на путь роста и начать цепочку перемен - http://netolo.gy/fyb",
        published = "21 мая в 18:36",
        likedByMe = false
        ),
        Post(id = 2,
            author = "Нетология. Университет",
            content = "Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам от новичков до уверенных профессионалов. Но самое ваное остаётся с нами. Наша миссия - помочь встать на путь роста и начать цепочку перемен - http://netolo.gy/fyb",
            published = "22 мая в 12:36",
            likedByMe = false
        ),
        Post(id = 3,
            author = "Университет",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интесивов по онлайн-маркетингу. Наша миссия - помочь встать на путь роста и начать цепочку перемен - http://netolo.gy/fyb",
            published = "23 мая в 14:36",
            likedByMe = false
        ),
        Post(id = 4,
            author = "ПТУ",
            content = "Наша миссия - помочь встать на путь роста и начать цепочку перемен - http://netolo.gy/fyb",
            published = "24 мая в 15:36",
            likedByMe = false
        ),
        Post(id = 5,
            author = "МГИМО",
            content = "Привет, это новая Нетология! Наша миссия - помочь встать на путь роста и начать цепочку перемен - http://netolo.gy/fyb",
            published = "25 мая в 16:36",
            likedByMe = false
        )
    )

    private val data = MutableLiveData(posts)

    override fun getAll(): LiveData<List<Post>> = data
    override fun likeById(id: Long) {
        posts = posts.map{
            if (it.id != id) it else it.copy(likedByMe = !it.likedByMe, likes = it.likes + if (it.likedByMe) -1 else 1)
        }
        data.value = posts
    }

//    override fun share() {
//        post = post.copy(share = post.share + 1)
//        data.value = post
//    }
//
//    override fun watched() {
//        post = post.copy(watched = post.watched + 1)
//        data.value = post
//    }
}
