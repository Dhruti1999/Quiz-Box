package com.example.quizbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * This sets onClickListener on the button element; this is another way of setting onClick listener in Kotlin
         * on a button instead of declaring it in xml file; also, it is noteworthy that the button on which onClick Listener
         * is set has no findViewById referencing it, in Kotlin, findViewById is not necessary, this has been done
         * by the import of kotlinx.android.synthetic.main.activity_main.* above as it goes through all the xml files
         * and find each view with respect to its id automatically.
         */
        take_quiz.setOnClickListener {
            val quizIntent = Intent(this, QuizActivity::class.java)
            quizIntent.putExtra("EdiTtEXTvALUE", "Welcome " + name_field.text)
            startActivity(quizIntent)
            finish()
        }
    }
}
