package com.example.android_ca2_set_b

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Ques2 : AppCompatActivity() {
    lateinit var radiobutton : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ques2)
        var str : String = ""
        val name = findViewById<EditText>(R.id.edittext1)
        val age = findViewById<EditText>(R.id.editText2)
        val radio1 = findViewById<RadioButton>(R.id.male)
        val radio2 = findViewById<RadioButton>(R.id.female)


        val cricket = findViewById<CheckBox>(R.id.checkBox1)
        val chess = findViewById<CheckBox>(R.id.checkBox2)
        val football = findViewById<CheckBox>(R.id.checkBox3)
        val btnsubmit = findViewById<Button>(R.id.submitbtn)
        val Text1: String = name.text.toString()
        val Text2 : String = age.text.toString()
        val Rgrp = findViewById<RadioGroup>(R.id.radio_group)



        str += "Name : " + Text1 + " \nAge : " + Text2

        btnsubmit.setOnClickListener {
            val selectId: Int =Rgrp.checkedRadioButtonId
            radiobutton=findViewById(selectId)
            str+= "\nGender : " + radiobutton.text.toString()
            str+="\nHobbies :"
            if(cricket.isChecked)
                str+=" Cricket "
            if(chess.isChecked)
                str+=" Chess "
            if(football.isChecked)
                str+=" football "

            Toast.makeText(this,str,Toast.LENGTH_LONG ).show()
            str=""
            name.setText("")
            age.setText("")

            if(radio1.isChecked){
                radio1.isChecked = false
            }
            if(radio2.isChecked){
                radio2.isChecked = false
            }
            if(cricket.isChecked){
                cricket.toggle()
            }
            if(chess.isChecked){
                chess.toggle()
            }
            if(football.isChecked){
                football.toggle()
            }
        }
    }
}