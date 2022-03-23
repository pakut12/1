package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1.setOnClickListener {
            var txt1 = tv1.text.toString()
            var txt2 = (tv2.text.toString().toDouble() / 100)
            var age = tv.text.toString()

            var txt3 = (txt1.toDouble() / Math.pow(txt2.toDouble(), 2.0))
            val BMI = "%,.2f".format(txt3.toString().toDouble())

            val BMR = (66 + (13.7 * txt1.toString().toDouble()) + (5 * tv2.text.toString()
                .toDouble()) - (6.8 * age.toString().toDouble()))
            var TDEE = 0.0
            if (rd1.isChecked) {
                TDEE = (BMR.toDouble() * 1.2)
            } else if (rd2.isChecked) {
                TDEE = (BMR.toDouble() * 1.375)
            } else if (rd3.isChecked) {
                TDEE = (BMR.toDouble() * 1.55)
            } else if (rd4.isChecked) {
                TDEE = (BMR.toDouble() * 1.725)
            } else if (rd5.isChecked) {
                TDEE = (BMR.toDouble() * 1.9)
            }

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("txt1",BMI.toString())
            i.putExtra("txt2",BMR.toString())
            i.putExtra("txt3",TDEE.toString())
            startActivity(i)


        }

    }
}