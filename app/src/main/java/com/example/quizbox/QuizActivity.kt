package com.example.quizbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.question.*

class QuizActivity : AppCompatActivity() {
    internal var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question)

        //Intent sent from MainActivity.kt is captured here, this is the username, for display.
        welcome.text = intent.getStringExtra("EdiTtEXTvALUE")
    }

    fun submitAnswer(view: View) {
        //This assesses the correct answer to question 1.
        val answerToQuestion1 = sand.isChecked
        if (answerToQuestion1) {
            score += 1
        }
        //This assesses the correct answer to question 2.
        val answerToQuestion2 = zero.isChecked
        if (answerToQuestion2) {
            score += 1
        }
        //This assesses the correct answer to question 3.
        val answerToQuestion3 = entityA.isChecked
        if (answerToQuestion3) {
            score += 1
        }
        //This assesses the correct answer to question 4.
        val answerToQuestion4 = entityB1.isChecked
        if (answerToQuestion4) {
            score += 1
        }
        //This assesses the correct answer to question 5.
        val answerToQuestion5 = abc.isChecked
        if (answerToQuestion5) {
            score += 1
        }

        //This assesses the correct answer to question 6.
        val answerToQuestion6 = edit.text.toString()
        score += when (answerToQuestion6) {
            "Particle A" -> 1
            else -> 0
        }

        //Toast messages to display on submission and the navigation intent to restart the quiz
        Toast.makeText(this, "Thanks for taking this quiz", Toast.LENGTH_SHORT).show()
        //sleep(500)
        Toast.makeText(this, "You scored $score out of 6", Toast.LENGTH_LONG).show()
        score = 0

        //Restart quiz by going back to the home page
        startActivity(Intent(this@QuizActivity, MainActivity::class.java))
        finish()
    }
}