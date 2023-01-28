package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import ru.netology.nmedia.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<ImageView>(R.id.post_likes_view).setOnClickListener {
//            (it as ImageView).setImageResource(R.drawable.ic_baseline_favorite_active_24)
//        }

//        setContentView(R.layout.activity_main)
//        post_likes_view.setOnClickListener {
//            post_likes_view.setImageResource(R.drawable.ic_baseline_favorite_active_24)
//        }

//        setContentView(binding.root)
    }
}
