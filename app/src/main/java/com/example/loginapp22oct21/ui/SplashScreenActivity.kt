package com.example.loginapp22oct21.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp22oct21.R
import kotlinx.coroutines.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        goToMainActivity()
    }

    private fun goToMainActivity() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(SCREEN_DELAY)
            startActivity(Intent(this@SplashScreenActivity, LoginActivity::class.java))
            finish()
        }
    }

    companion object {
        private const val SCREEN_DELAY = 5000L
    }
}
