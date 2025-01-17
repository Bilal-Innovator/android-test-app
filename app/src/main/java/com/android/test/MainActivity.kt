package com.android.test

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private var btnTriggerEvent:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        btnTriggerEvent = findViewById(R.id.btnTriggerEvent)
        btnTriggerEvent?.setOnClickListener {
            Toast.makeText(this, "Event triggered !!", Toast.LENGTH_SHORT).show()
        }
    }
}