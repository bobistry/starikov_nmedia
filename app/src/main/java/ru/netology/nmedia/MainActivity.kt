package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import ru.netology.nmedia.adapter.PostsAdapter
import ru.netology.nmedia.databinding.ActivityMainBinding
import ru.netology.nmedia.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val viewModel by viewModels<PostViewModel>()

        val adapter = PostsAdapter {
            viewModel.likeById(it.id)
        }
        binding.list.adapter = adapter
        viewModel.data.observe(this) {posts ->
            adapter.submitList(posts)
        }

    }

}
