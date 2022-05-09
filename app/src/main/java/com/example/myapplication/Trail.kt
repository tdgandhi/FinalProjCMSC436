package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Trail : AppCompatActivity() {


    var buttons = arrayOf(
        findViewById<TextView>(R.id.button1),
        findViewById(R.id.button2),
        findViewById(R.id.button3),
        findViewById(R.id.button4),
        findViewById(R.id.button5),
        findViewById(R.id.button6)
    )
    val radius = 6
    var nums = BooleanArray(7)
    var error = false
    var chrono: Chronometer? = null
    var line_red: ArrayList<Int> = ArrayList()
    var count = 1
    var button1: TextView? = null
    var button2: TextView? = null
    var button3: TextView? = null
    var button4: TextView? = null
    var button5: TextView? = null
    var button6: TextView? = null
    var handLine = false
    var relative_layout: RelativeLayout? = null
    var LR: RedLine? = null
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
        button1 = findViewById<View>(R.id.button1) as TextView
        button2 = findViewById<View>(R.id.button2) as TextView
        button3 = findViewById<View>(R.id.button3) as TextView
        button4 = findViewById<View>(R.id.button4) as TextView
        button5 = findViewById<View>(R.id.button5) as TextView
        button6 = findViewById<View>(R.id.button6) as TextView
        var i = 0
        while (true) {
            val zArr: BooleanArray = nums
            if (i < zArr.size) {
                zArr[i] = false
                i++
            } else {
                chrono = findViewById(R.id.chronoa) as Chronometer
                return
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trail2)
        __init__();
        if (handLine) {
            val buttonArr: Array<TextView?> = buttons
            buttonArr[0] = button1
            buttonArr[1] = button2
            buttonArr[2] = button3
            buttonArr[3] = button4
            buttonArr[4] = button5
            buttonArr[5] = button6
            relative_layout!!.addView(MyView(applicationContext, buttons.get(count)) as View)
        }
        if (!handLine) {
            button1?.setOnClickListener {
                if (!nums[1] && !error) {
                    startX = (button1!!.getLeft() + radius) - 4
                    startY = (button1!!.getTop() + radius) - 4
                    nums[1] = true
                    chrono?.start()
                } else if(startXRed != 0) {
                    error = true
                    stopXRed = (button1!!.getLeft() + radius) - 4
                    stopYRed = (button1!!.getTop() + radius) - 4
                    line_red.add(startXRed)
                    line_red.add(startYRed)
                    line_red.add(stopXRed)
                    line_red.add(stopYRed)

                    LR = RedLine(applicationContext)
                    LR.setLine(line_red)
                    relative_layout?.addView(LR as View)
                }
                startXRed = (button1!!.getLeft() + radius) - 4
                startYRed = (button1!!.getTop() + radius) - 4

            }

            button2?.setOnClickListener {
                if (nums[1] && !nums[2] && !error) {
                    startX = (button2!!.getLeft() + radius) - 4
                    startY = (button2!!.getTop() + radius) - 4
                    nums[2] = true
                    chrono?.start()
                } else if(startXRed != 0) {
                    error = true
                    stopXRed = (button2!!.getLeft() + radius) - 4
                    stopYRed = (button2!!.getTop() + radius) - 4
                    line_red.add(startXRed)
                    line_red.add(startYRed)
                    line_red.add(stopXRed)
                    line_red.add(stopYRed)

                    LR = RedLine(applicationContext)
                    LR.setLine(line_red)
                    relative_layout?.addView(LR as View)
                }
                startXRed = (button2!!.getLeft() + radius) - 4
                startYRed = (button2!!.getTop() + radius) - 4

            }

            button3?.setOnClickListener {
                if (nums[2] && !nums[3] && !error) {
                    startX = (button3!!.getLeft() + radius) - 4
                    startY = (button3!!.getTop() + radius) - 4
                    nums[3] = true
                    chrono?.start()
                } else if(startXRed != 0) {
                    error = true
                    stopXRed = (button3!!.getLeft() + radius) - 4
                    stopYRed = (button3!!.getTop() + radius) - 4
                    line_red.add(startXRed)
                    line_red.add(startYRed)
                    line_red.add(stopXRed)
                    line_red.add(stopYRed)

                    LR = RedLine(applicationContext)
                    LR.setLine(line_red)
                    relative_layout?.addView(LR as View)
                }
                startXRed = (button3!!.getLeft() + radius) - 4
                startYRed = (button3!!.getTop() + radius) - 4

            }

            button4?.setOnClickListener {
                if (nums[3] && !nums[4] && !error) {
                    startX = (button4!!.getLeft() + radius) - 4
                    startY = (button4!!.getTop() + radius) - 4
                    nums[4] = true
                    chrono?.start()
                } else if(startXRed != 0) {
                    error = true
                    stopXRed = (button4!!.getLeft() + radius) - 4
                    stopYRed = (button4!!.getTop() + radius) - 4
                    line_red.add(startXRed)
                    line_red.add(startYRed)
                    line_red.add(stopXRed)
                    line_red.add(stopYRed)

                    LR = RedLine(applicationContext)
                    LR.setLine(line_red)
                    relative_layout?.addView(LR as View)
                }
                startXRed = (button4!!.getLeft() + radius) - 4
                startYRed = (button4!!.getTop() + radius) - 4

            }

            button5?.setOnClickListener {
                if (nums[4] && !nums[5] && !error) {
                    startX = (button5!!.getLeft() + radius) - 4
                    startY = (button5!!.getTop() + radius) - 4
                    nums[5] = true
                    chrono?.start()
                } else if(startXRed != 0) {
                    error = true
                    stopXRed = (button5!!.getLeft() + radius) - 4
                    stopYRed = (button5!!.getTop() + radius) - 4
                    line_red.add(startXRed)
                    line_red.add(startYRed)
                    line_red.add(stopXRed)
                    line_red.add(stopYRed)

                    LR = RedLine(applicationContext)
                    LR.setLine(line_red)
                    relative_layout?.addView(LR as View)
                }
                startXRed = (button5!!.getLeft() + radius) - 4
                startYRed = (button5!!.getTop() + radius) - 4

            }

            button6?.setOnClickListener {
                if (nums[5] && !nums[6] && !error) {
                    startX = (button6!!.getLeft() + radius) - 4
                    startY = (button6!!.getTop() + radius) - 4
                    nums[6] = true
                    chrono?.start()
                } else if(startXRed != 0) {
                    error = true
                    stopXRed = (button6!!.getLeft() + radius) - 4
                    stopYRed = (button6!!.getTop() + radius) - 4
                    line_red.add(startXRed)
                    line_red.add(startYRed)
                    line_red.add(stopXRed)
                    line_red.add(stopYRed)

                    LR = RedLine(applicationContext)
                    LR.setLine(line_red)
                    relative_layout?.addView(LR as View)
                }
                startXRed = (button6!!.getLeft() + radius) - 4
                startYRed = (button6!!.getTop() + radius) - 4

            }

            relative_layout?.setOnClickListener {
                error = false
                relative_layout!!.removeView(LR as View)
                line_red.clear()
                startXRed = 0
            }
        }
    }

    inner class MyView internal constructor(context: Context, button: TextView) {

    }

    inner class Line internal constructor(context: Context, button: Button) {

    }

    inner class RedLine internal constructor(context: Context, button: Button) {

    }
}

