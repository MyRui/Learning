package com.dr.learndemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dr.learndemo.animate.PropertyAnimateActivity
import com.dr.learndemo.animate.ViewAnimateActivity
import com.dr.learndemo.simulateNetEaseCloudMusic.ui.RippleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rippleActivityBtn.setOnClickListener {
            startActivity(Intent(this, RippleActivity::class.java))
        }

        viewAnimateBtn.setOnClickListener {
            startActivity(Intent(this, ViewAnimateActivity::class.java))
        }

        viewAnimateBtn.setOnClickListener {
            startActivity(Intent(this, PropertyAnimateActivity::class.java))
        }
    }

}