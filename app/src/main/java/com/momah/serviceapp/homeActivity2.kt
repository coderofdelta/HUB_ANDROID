package com.momah.serviceapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home2.*

class homeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
//        conButton.setOnClickListener {

//            val Intent = Intent(this, homeActivity2::class.java);
//            startActivity(intent)


            conButton.setOnClickListener {
                val intent = Intent(android.content.Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:07069530000")
                startActivity(intent)

        }
    }
}