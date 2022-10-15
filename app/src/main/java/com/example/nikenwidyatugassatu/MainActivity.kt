package com.example.nikenwidyatugassatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_happy : Button
    lateinit var btn_sad : Button
    lateinit var btn_mad : Button
    lateinit var txt_name : EditText
    lateinit var txt_desc : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_happy = findViewById(R.id.btn_happy)
        btn_sad = findViewById(R.id.btn_sad)
        btn_mad = findViewById(R.id.btn_mad)
        txt_name = findViewById(R.id.txt_name)
        txt_desc = findViewById(R.id.txt_desc)


        btn_happy.setOnClickListener{
            if (txt_name.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Please input your name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }else {
                Toast.makeText(
                    this,
                    "Hi " + txt_name.text + " you are happy today",
                    Toast.LENGTH_SHORT
                ).show()

            }

        }
        btn_sad.setOnClickListener{
            if (txt_name.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Please input your name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }else {
                Toast.makeText(
                    this,
                    "Hi " + txt_name.text + " you are sad today",
                    Toast.LENGTH_SHORT
                ).show()

            }

        }
        btn_mad.setOnClickListener{
            if (txt_name.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Please input your name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }else {
                Toast.makeText(
                    this,
                    "Hi " + txt_name.text + " you are mad today",
                    Toast.LENGTH_SHORT
                ).show()

            }

        }

    }
}