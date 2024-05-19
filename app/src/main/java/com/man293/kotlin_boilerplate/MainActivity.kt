package com.man293.kotlin_boilerplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arr : IntArray = intArrayOf(1, 2, 3)
        Log.d("aaa", arr.get(1).toString())
    }
}