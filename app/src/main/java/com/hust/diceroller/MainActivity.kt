package com.hust.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity rolls a 6-faced-dice and show result on screen
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice, update `TextView` with the result
     */
    private fun rollDice() {
        // Create new 6-faced-dice and roll
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update with the roll result
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSlides: Int) {

    fun roll(): Int {
        return (1..numSlides).random()
    }
}