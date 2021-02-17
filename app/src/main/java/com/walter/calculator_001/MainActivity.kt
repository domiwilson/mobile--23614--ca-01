package com.walter.calculator_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LOG_MESSAGE_1","Calculator Works")


        val num1 = findViewById(R.id.number_one) as EditText
        val num2 = findViewById(R.id.number_two) as EditText
        val res = findViewById(R.id.resultView) as EditText

        val b1 = findViewById(R.id.click_button) as Button


        b1.setOnClickListener{

            val val1= num1.text.toString().toInt()
            val val2= num1.text.toString().toInt()

            val result = val1 + val2;

            res.setText(result.toString())

        }




    }
}