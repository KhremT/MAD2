package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.assignment2.UserClass
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etuser: EditText = findViewById(R.id.etuser)
        var etage: EditText= findViewById(R.id.etage)
        var spgender: Spinner = findViewById(R.id.spgender)
        var box: CheckBox = findViewById(R.id.box)

        // Assign list & style to spinner using adapter
        var adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this@MainActivity,R.array.Genders,R.layout.myspinner)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.setAdapter(adapter)



        box.setOnClickListener {
            if(box.isChecked()) {
                if(etuser.text.isNotEmpty() && etage.text.isNotEmpty()) {

                    var User = UserClass(etuser.text.toString(),etage.text.toString(),spgender.selectedItem.toString())
                    var gson = Gson()
                    var userJsonString = gson.toJson(User)
                    var intent = Intent(this, Activity2::class.java)
                    intent.putExtra("Object", userJsonString)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this@MainActivity,"Please fill in the fields",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}