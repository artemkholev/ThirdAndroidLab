package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("message")
        binding.message.text = message

        binding.buttonCloseSecondActivity.setOnClickListener {
            val name = binding.input.text.toString()
            if (name.isNotBlank()) {
                val resultIntent = Intent()
                resultIntent.putExtra("name", name)
                setResult(RESULT_OK, resultIntent)
                finish()
            }
        }
    }
}