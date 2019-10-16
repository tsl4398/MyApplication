package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val rollButton: Button = findViewById((R.id.roll_button))
        rollButton.setOnClickListener { rollDice()}
}

    private fun rollDice()
    {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val random = Random().nextInt(bound 6) + 1

        val result : TextView = findViewById(R.id.result_text)
        result_text.text = randomInt.toString()
    }
}
