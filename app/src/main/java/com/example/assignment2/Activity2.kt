package com.example.assignment2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var mainlayout : RelativeLayout = findViewById(R.id.act2)

        var username =intent.getStringExtra("Username")
        var age = intent.getStringExtra("Age")
        var gender = intent.getStringExtra("Gender")

        if(gender == "Male")
        {

            mainlayout.setBackgroundColor(ContextCompat.getColor(this@Activity2, R.color.red))
        }
        else
        {
            mainlayout.setBackgroundColor(ContextCompat.getColor(this@Activity2, R.color.pink))
        }

        fun getName(): String?
        {
            return username
        }
        fun getage(): Int?
        {
            return age?.toInt()
        }
        fun getGender(): String?
        {
            return gender
        }
        fun setName(user:String?)
        {
            username=user
        }
        fun setgender(gen:String?)
        {
            gender=gen
        }
        fun setage(a:String?)
        {
            age=a
        }
    }
}