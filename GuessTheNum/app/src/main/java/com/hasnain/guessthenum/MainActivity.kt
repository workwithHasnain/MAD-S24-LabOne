package com.hasnain.guessthenum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    lateinit var resultText: TextView
    lateinit var guessInput: EditText
    lateinit var guessButton: Button
    var numToGuess = Random.nextInt(1, 1001)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

        guessInput = findViewById(R.id.guessInput)
        guessButton = findViewById(R.id.guessButton)
        resultText = findViewById(R.id.resultText)
        guessButton.setOnClickListener {
            val userGuess = guessInput.text.toString().toIntOrNull()

            if (userGuess != null) {
                if (userGuess == numToGuess) {
                    resultText.text = "\uD83C\uDF89 Congratulations ! \uD83C\uDF89 \nYou guessed the correct number."
                    guessInput.text = null
                    numToGuess = Random.nextInt(1, 1001)
                } else {
                    resultText.text = when {
                        userGuess < numToGuess -> "Your guess is low. Try again!"
                        else -> "Your guess is high. Try again!"
                    }
                }
            } else {
                resultText.text = "Please enter a valid number."
            }
        }
    }
}