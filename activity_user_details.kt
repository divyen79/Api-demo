package com.invitationmaker.lss.apidemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        val name = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val website = intent.getStringExtra("website")

        findViewById<TextView>(R.id.detailsText).text = """
            Name: $name
            Username: $username
            Email: $email
            Phone: $phone
            Website: $website
        """.trimIndent()
    }
}
