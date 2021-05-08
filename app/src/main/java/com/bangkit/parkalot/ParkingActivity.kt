package com.bangkit.parkalot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bangkit.parkalot.databinding.ActivityParkingBinding

class ParkingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var parkingBinding: ActivityParkingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        parkingBinding = ActivityParkingBinding.inflate(layoutInflater)
        setContentView(parkingBinding.root)

        supportActionBar?.hide()

        parkingBinding.btnBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnBack -> {
                val toBack = Intent(this@ParkingActivity, HomeActivity::class.java)
                startActivity(toBack)
            }
        }
    }
}