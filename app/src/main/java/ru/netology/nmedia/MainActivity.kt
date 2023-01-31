package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.netology.nmedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val post = Post(
            id = 1,
            author = "Нетология. Университет интернет-профессий",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интесивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам от новичков до уверенных профессионалов. Но самое ваное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия - помочь встать на путь роста и начать цепочку перемен - http://netolo.gy/fyb",
            published = "21 мая в 18:36",
            likedByMe = false
        )

        setContentView(binding.root)

        binding.apply {
            author.text = post.author
            published.text = post.published
            article.text = post.content
            if (post.likedByMe) {
                like.setImageResource(R.drawable.ic_liked_24)
            }
            likeCounter.text = post.likes.toString()

            like.setOnClickListener {
                if (post.likedByMe) {
                    post.likes--
                } else {
                    post.likes++
                }
                post.likedByMe = !post.likedByMe

                like.setImageResource(
                    if (post.likedByMe) R.drawable.ic_liked_24 else R.drawable.ic_like_24
                )

                likeCounter.text = post.likes.toString()
            }
        }

    }

//    private fun processQuantity(qty: Int): String {
//        val result: String
//        if (qty < 1000) {
//            result = qty.toString()
//        } else {
//            result = Math.ceil(qty / 1000.0).toString() + " K"
//        }
//        return result
//    }
}
