package com.irmablanco.restaurantorder.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.irmablanco.restaurantorder.R
import com.irmablanco.restaurantorder.model.Dish
import kotlinx.android.synthetic.main.activity_dish.*

class DishActivity: AppCompatActivity() {

    /*Set up activity_dish which sets up fragment_dish*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)
    }

}