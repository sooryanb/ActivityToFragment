package com.example.activitytofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button
    lateinit var etvData: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etvData = findViewById(R.id.etvData)
        btnSend = findViewById(R.id.btnSend2)

        val fragment = FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()

        btnSend.setOnClickListener {
            val data = etvData.text.toString()
            val args = Bundle()
            args.putString("data" , data)

            fragment.putArguments(args)
        }

    }
}