package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val i = intent
        tv01.text = i.getStringExtra("txt1")
        tv02.text = i.getStringExtra("txt2")
        tv03.text = i.getStringExtra("txt3")

    }
}