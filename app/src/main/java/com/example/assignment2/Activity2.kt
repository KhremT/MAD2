package com.example.assignment2

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import com.google.gson.Gson

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var mainlayout : RelativeLayout = findViewById(R.id.act2)
        var text :TextView=findViewById(R.id.act2text2)

        var userJsonString = intent.getStringExtra("Object")
        var gson = Gson()
        var recieved = gson.fromJson(userJsonString,UserClass::class.java)

        text.text=recieved.getName()

        if(recieved.getGender() == "Male")
        {

            mainlayout.setBackgroundColor(ContextCompat.getColor(this@Activity2, R.color.red))
        }
        else
        {
            mainlayout.setBackgroundColor(ContextCompat.getColor(this@Activity2, R.color.pink))
        }


    }
}