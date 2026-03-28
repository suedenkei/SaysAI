package com.example.saysai

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val sentence = intent.getStringExtra("SENTENCE") ?: "(nothing signed)"

        findViewById<TextView>(R.id.resultSentence).text = sentence
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}