package com.example.my2pmhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImg :ImageView
    lateinit var numberText: TextView
    lateinit var nameText: TextView
    lateinit var playerName: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberText = findViewById(R.id.numberText)
        diceImg = findViewById(R.id.diceImage)
        nameText = findViewById(R.id.enterName)
        playerName = findViewById(R.id.playerName)
        val rollButton : Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener { rollDice() }
        val updateBtn : Button = findViewById(R.id.updateButton)
        updateBtn.setOnClickListener { updateName(it) }
    }

    private fun updateName(view: View){
        playerName.text = nameText.text
    }

    private fun rollDice(){
        Toast.makeText(this, "ROLL", Toast.LENGTH_SHORT).show()

        val randomNumber = (1..6).random()
        numberText.text = randomNumber.toString()
        val imgSrc = when (randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(imgSrc)
    }
}