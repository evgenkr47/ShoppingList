package com.example.shoppinglist.presentation

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.databinding.ActivitySplashBinding
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        CoroutineScope(Dispatchers.Main).launch {
            launchSplash()
        }

    }

    private suspend fun launchSplash(){
        binding.progressSplash.max = 1000
        val value = 1000
        ObjectAnimator.ofInt(binding.progressSplash, "progress", value).setDuration(2000).start()
        delay(2000)
        startActivity(Intent(this@SplashActivity, MainActivity::class.java))
    }
}