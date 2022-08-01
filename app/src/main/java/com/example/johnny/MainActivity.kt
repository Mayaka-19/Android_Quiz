package com.example.johnny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (kenya.isChecked) textresult.text="Kenya: Correct Answer"
        if (uganda.isChecked) textresult.text="Uganda: Correct Answer"
        if (tanzania.isChecked) textresult.text="Tanzania: Incorrect Answer"

    }

    fun onChoosed(view:View){
        if (no_radioButton.isChecked) text_result1.text="No: Ain't Certified"
        if (yes_radio.isChecked) text_result1.text="Yes: Am Certified"
        if (radioButton3.isChecked) text_result1.text="Not sure: Maybe or maybe not!"
    }
}