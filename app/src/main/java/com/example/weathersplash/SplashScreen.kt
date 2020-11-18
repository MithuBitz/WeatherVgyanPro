package com.example.weathersplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_right_anim)
        val middleLeftAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_left_anim)

        logoImg.startAnimation(topAnimation)
        appNameTv.startAnimation(bottomAnimation)
        powerdByTv1.startAnimation(middleAnimation)
        powerdByTv.startAnimation(middleLeftAnimation)

        val splashTimeOut = 4000
        val homeIntent = Intent(this@SplashScreen, HomeActivity::class.java)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(homeIntent)
            finish()
        }, splashTimeOut.toLong())
    }
}