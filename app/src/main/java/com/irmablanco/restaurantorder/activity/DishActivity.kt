package com.irmablanco.restaurantorder.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.irmablanco.restaurantorder.R
import com.irmablanco.restaurantorder.model.Dish
import kotlinx.android.synthetic.main.activity_dish.*

class DishActivity: AppCompatActivity() {
    val TAG = DishActivity::class.java.canonicalName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)

        val dish = Dish(
                "Hamburguesa",
                R.drawable.hamburguesa_patatas_1,
                10f,
                "Hamburguesa de pollo hecha  a la parrilla con patatas fritas")

        setDish(dish)
    }
    /*Creo metodo setDish para pasar el plato que quiero crearme
    y donde accedo directamente a las vistas de la interfaz*/

    fun setDish(dish: Dish){
        //Accedo por el id a las vistas del xml
        dish_name.text = dish.name
        dish_image.setImageResource(dish.image)
        dish_description.text = dish.description
        dish_price.text = getString(R.string.price_format, dish.price)
    }
}