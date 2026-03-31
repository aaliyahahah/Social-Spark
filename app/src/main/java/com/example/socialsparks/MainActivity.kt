package com.example.socialsparks

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTime = findViewById<EditText>(R.id.inputTime)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnSuggest.setOnClickListener {

            val time = inputTime.text.toString().trim().lowercase()

            Log.d("USER_INPUT", "User entered: $time")

            if (time == "morning") {
                txtResult.text = "Send a 'Good morning' text to a family member ☀️"
            }
            else if (time == "mid-morning") {
                txtResult.text = "Send a quick 'Thank you' to a colleague 🙌"
            }
            else if (time == "afternoon") {
                txtResult.text = "Share a funny meme with a friend 😂"
            }
            else if (time == "afternoon snack time") {
                txtResult.text = "Send a 'Thinking of you' message 💭"
            }
            else if (time == "dinner") {
                txtResult.text = "Call a friend for a quick catch-up 📞"
            }
            else if (time == "night" || time == "after dinner") {
                txtResult.text = "Leave a nice comment on a friend's post ❤️"
            }
            else {
                txtResult.text = "⚠️ Invalid input. Please enter Morning, Afternoon, Dinner, etc."
            }
        }

        btnReset.setOnClickListener {
            inputTime.text.clear()
            txtResult.text = ""
            Log.d("RESET", "User reset the app")
        }
    }
}

