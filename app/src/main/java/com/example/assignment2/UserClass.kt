package com.example.assignment2
import java.io.Serializable
class UserClass( private var name:String,private var age:String, private var gender:String):Serializable {


    fun getName(): String
    {
        return name
    }
    fun getage(): String
    {
        return age
    }
    fun getGender(): String
    {
        return gender
    }
    fun setName(user:String)
    {
        name=user
    }
    fun setgender(gen:String)
    {
        gender=gen
    }
    fun setage(a:String)
    {
        age=a
    }
}