package com.maknoun.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "مرحبا بيك عند\nmaknoun"
        tv.textSize = 28f
        tv.setTextColor(Color.WHITE)
        tv.gravity = Gravity.CENTER
        tv.setBackgroundColor(Color.parseColor("#121212"))
        setContentView(tv)
    }
}
