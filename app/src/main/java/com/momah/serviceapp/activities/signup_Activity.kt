package com.momah.serviceapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.momah.serviceapp.R
import com.momah.serviceapp.homeActivity2
import kotlinx.android.synthetic.main.activity_signup_.*


class signup_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_)
        signupBotton.setOnClickListener {


            if (usernametext.text.trim().isNotEmpty()|| Emailtext.text.trim().isNotEmpty() || passwordtext.text.trim().isNotEmpty() ){
                Toast.makeText( this, "Input Provided", Toast.LENGTH_LONG).show()

                val Intent = Intent(this, homeActivity2 ::class.java )
                startActivity(Intent)

            }else {
                Toast.makeText( this, "Input Required", Toast.LENGTH_LONG).show()
            }




        }
    }
}