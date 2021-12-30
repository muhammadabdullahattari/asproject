package com.example.vocationdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Selection
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       val vocationlist = arrayListOf("Fortress Stadium","Emporium Mall","Jinnah Garden","Baad Shai Mosque")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {
            val random = Random()
            val randomvocation = random.nextInt(vocationlist.count())
            selectedvocationtxt.text= vocationlist[randomvocation]


        }
        addbtn.setOnClickListener {
            val newvocation = newplctxt.text.toString()
            vocationlist.add(newvocation)
            newplctxt.text.clear()
            println(vocationlist)

        }










    }
}