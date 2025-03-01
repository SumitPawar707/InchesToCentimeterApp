package com.example.converttoinch

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var edt1:EditText
    private lateinit var convertBtn:Button
    private lateinit var displaytxt:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edt1=findViewById(R.id.edit1)
        convertBtn = findViewById(R.id.convertBtn1)
        displaytxt=findViewById(R.id.centTxt)

        convertBtn.setOnClickListener {
            if(!edt1.text.toString().isEmpty()){
                var result=edt1.text.toString().toDouble()/2.54
                displaytxt.text="Result : %.2f centimeters ".format(result)
            }
        }
    }
}