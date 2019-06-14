package com.example.youtube

import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle as Bundle1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            // code
            Log.i("MainActivity", "Button was clicked !")

            Toast.makeText(this , "Button was clicked !", Toast.LENGTH_SHORT).show()
        }
    }
}
