package com.example.tab_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout= findViewById<TabLayout>(R.id.tabLayout)
        val view= findViewById<ViewPager>(R.id.viewPager2)
        view.adapter =PageAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(view)
    }
}