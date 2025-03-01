package com.example.converttoinch

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var view:View
    private lateinit var edt1:EditText
    private lateinit var convertBtn:Button
    private lateinit var displaytxt:TextView
    private lateinit var floatBtn:FloatingActionButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edt1=findViewById(R.id.edit1)
        convertBtn = findViewById(R.id.convertBtn1)
        displaytxt=findViewById(R.id.centTxt)
        floatBtn=findViewById(R.id.floatingActionButton)
        view=findViewById(R.id.main)

        val colors= arrayOf(Color.RED,Color.BLUE,Color.CYAN,Color.GRAY,Color.GREEN,Color.YELLOW)

        convertBtn.setOnClickListener {
            if(!edt1.text.toString().isEmpty()){
                var result=edt1.text.toString().toDouble()/2.54
                displaytxt.text="Result : %.2f centimeters ".format(result)
            }
        }
        floatBtn.setOnClickListener{
            view.setBackgroundColor(colors[Random.nextInt(colors.size)])
        }

    }
}