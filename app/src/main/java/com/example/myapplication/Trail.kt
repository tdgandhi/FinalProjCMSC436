package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class Trail : AppCompatActivity() {


    var buttons = arrayOfNulls<Button>(8)
    var nums = BooleanArray(9)
    var chrono: Chronometer? = null
    var line_red: ArrayList<Int> = ArrayList()
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null
    var button6: Button? = null
    var relative_layout: RelativeLayout? = null
    var startX = 0
    var startXRed = 0
    var startY = 0
    var startYRed = 0
    var stopX = 0
    var stopXRed = 0
    var stopY = 0
    var stopYRed = 0

    private fun __init__() {
        relative_layout = findViewById<View>(R.id.relative_layout) as RelativeLayout
        button1 = findViewById<View>(R.id.button1) as Button
        button2 = findViewById<View>(R.id.button2) as Button
        button3 = findViewById<View>(R.id.button3) as Button
        button4 = findViewById<View>(R.id.button4) as Button
        button5 = findViewById<View>(R.id.button5) as Button
        button6 = findViewById<View>(R.id.button6) as Button
        var i = 0
        while (true) {
            val zArr: BooleanArray = nums
            if (i < zArr.size) {
                zArr[i] = false
                i++
            } else {

                return
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trail2)
    }
}