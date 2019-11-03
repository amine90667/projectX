package com.example.pc.rundom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val seekBar2 = findViewById<SeekBar>(R.id.seekBar2)
        button.setOnClickListener {
            val rand = Random().nextInt(seekBar2.progress)+1
            textView2.text = rand.toString()
        }
    }
}




