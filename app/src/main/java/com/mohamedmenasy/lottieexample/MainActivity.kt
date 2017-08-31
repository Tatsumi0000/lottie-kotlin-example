package com.mohamedmenasy.lottieexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val animationView1 = findViewById(R.id.animation_view1) as LottieAnimationView
        val animationView2 = findViewById(R.id.animation_view2) as LottieAnimationView
        val animationView3 = findViewById(R.id.animation_view3) as LottieAnimationView

        animationView1.setAnimation("day_night_cycle.json", LottieAnimationView.CacheStrategy.Strong)
        animationView1.scale = 0.5f
        animationView1.loop(true)
        animationView1.playAnimation()

        animationView2.setAnimation("emoji_wink.json", LottieAnimationView.CacheStrategy.Strong)
        animationView2.loop(true)
        animationView2.playAnimation()

        animationView3.setAnimation("newAnimation.json", LottieAnimationView.CacheStrategy.Strong)
        animationView3.loop(true)
        animationView3.playAnimation()
    }
}
