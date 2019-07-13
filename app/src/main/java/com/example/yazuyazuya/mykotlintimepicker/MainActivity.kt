package com.example.yazuyazuya.mykotlintimepicker

import android.app.TimePickerDialog
//import android.support.v7.app.AppCompatActivity
import android.support.v4.app.FragmentActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class MainActivity : FragmentActivity(), TimePickerDialog.OnTimeSetListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            showTimePickerDialog(textView)
        }

    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {

        val str = String.format(Locale.US, "%d:%d", hourOfDay, minute)
        val textView = findViewById<TextView>(R.id.textView)

        // use the plug in of Kotlin Android Extensions
        textView.text = str

    }

    // called by Buttton tapping
    fun showTimePickerDialog(v: View) {
        val newFragment = TimePick()
        newFragment.show(supportFragmentManager, "timePicker")

    }

}
