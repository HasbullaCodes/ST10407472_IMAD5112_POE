package com.joel.st10407472_poe_part_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var disp: TextView
    lateinit var EditTextOne: EditText
    lateinit var EditTextTwo: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var mult: Button
    lateinit var div: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        disp = findViewById(R.id.results)
        EditTextOne = findViewById(R.id.EditTextOne)
        EditTextTwo = findViewById(R.id.EditTextTwo)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mult = findViewById(R.id.mult)
        div = findViewById(R.id.Div)



        add.setOnClickListener {

            val value1 = EditTextOne.text.toString().toInt()
            val value2 = EditTextTwo.text.toString().toInt()

            addition(value1, value2)
        }

        sub.setOnClickListener {

            val value1 = EditTextOne.text.toString().toInt()
            val value2 = EditTextTwo.text.toString().toInt()

            subtraction(value1, value2)

        }

        mult.setOnClickListener {

            val value1 = EditTextOne.text.toString().toInt()
            val value2 = EditTextTwo.text.toString().toInt()

            multiplication(value1, value2)

        }

        div.setOnClickListener {

            val value1 = EditTextOne.text.toString().toDouble()
            val value2 = EditTextTwo.text.toString().toDouble()

            division(value1, value2)

        }


    }

    private fun addition(value1: Int, value2: Int)
    {
        val result = value1 + value2
        disp.text = value1.toString() + value2.toString()

    }

    private fun subtraction(value1: Int, value2: Int)
    {
        val result = value1 - value2
        disp.text = result.toString()
    }

    private fun multiplication(value1: Int, value2: Int)
    {
        val result = value1 * value2
        disp.text = result.toString()
    }

    private fun division(value1: Double, value2: Double)
    {
        val result = value1 / value2
        disp.text = result.toString()
    }
}