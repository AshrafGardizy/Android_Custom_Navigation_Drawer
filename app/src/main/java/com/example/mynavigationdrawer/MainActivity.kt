package com.example.mynavigationdrawer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var  toggle:ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawerlayout:DrawerLayout = findViewById(R.id.drawerlayout)
        val navView:NavigationView = findViewById(R.id.nav_view)

        //Event for Toggle
        toggle = ActionBarDrawerToggle(this,drawerlayout,R.string.open,R.string.close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //Event for Menu Elements
        navView.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.nav_home-> Toast.makeText(applicationContext,"Home is Clicked",Toast.LENGTH_LONG).show()
                R.id.nav_message-> Toast.makeText(applicationContext,"Message is Clicked",Toast.LENGTH_LONG).show()
                R.id.nav_settings-> Toast.makeText(applicationContext,"Settings is Clicked",Toast.LENGTH_LONG).show()
                R.id.nav_login-> Toast.makeText(applicationContext,"Login is Clicked",Toast.LENGTH_LONG).show()
                R.id.nav_share-> Toast.makeText(applicationContext,"Share is Clicked",Toast.LENGTH_LONG).show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}