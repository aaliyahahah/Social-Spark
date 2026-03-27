package com.example.socialsparks

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

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val resultText = findViewById<TextView>(R.id.resultText)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        suggestButton.setOnClickListener {

            val userInput = timeInput.text.toString().trim()

            Log.d("INPUT", "User entered: $userInput")

            if (userInput.equals("Morning", true)) {
                resultText.text = "Send a 'Good morning' text to a family member ☀️"

            } else if (userInput.equals("Mid-morning", true)) {
                resultText.text = "Reach out to a colleague with a quick 'Thank you' 🙌"

            } else if (userInput.equals("Afternoon", true)) {
                resultText.text = "Share a funny meme or link with a friend 😂"

            } else if (userInput.equals("Afternoon Snack Time", true)) {
                resultText.text = "Send a quick 'thinking of you' message 💛"

            } else if (userInput.equals("Dinner", true)) {
                resultText.text = "Call a friend or relative for a 5-minute catch-up 📞"

            } else if (userInput.equals("Night", true) || userInput.equals("After Dinner", true)) {
                resultText.text = "Leave a thoughtful comment on a friend's post 🌙"

            } else if (userInput.isEmpty()) {
                resultText.text = "Please enter a time of day!"

            } else {
                resultText.text = "Invalid input. Try: Morning, Afternoon, Dinner 😊"
            }
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            resultText.text = ""
            Log.d("RESET", "Fields cleared")
        }
    }
}