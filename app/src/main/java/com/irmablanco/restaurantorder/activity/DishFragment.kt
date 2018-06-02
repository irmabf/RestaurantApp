package com.irmablanco.restaurantorder.activity

import android.app.Fragment
import android.os.Bundle
import android.view.*
import com.irmablanco.restaurantorder.R
import com.irmablanco.restaurantorder.model.Dish
import kotlinx.android.synthetic.main.activity_dish.*

class DishFragment: Fragment() {
    //Atributo para guardar el plato cuando nos lo pasen
    //setter, para que cada vez que se mofica el atributo setter provocar
    //una serie que modifica la interfaz
    var dish: Dish? = null
    //Cada vez que dish se modifique el setter asignara a la interfaz los nuevos valores
        set(value) {
            if (value != null) {
                //Accedo por el id a las vistas del xml
                dish_name.text = value.name
                dish_image.setImageResource(value.image)
                dish_description.text = value.description
                dish_price.text = getString(R.string.price_format, value.price)
            }
        }
    /*
    get() {
        return Dish(
                "Pizza",
                R.drawable.pizza_quesos_plato,
                 12f,
                "Pizza hecha en horno de leña con 4 quesos")
    }*/

    //Implementamos onCreateView, que es el metodo que equivale el onCreate de las actividades
    //Pero para los fragments

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)

        val root =  inflater?.inflate(R.layout.activity_dish, container, false)!!
        //Este codigo me va a actualizar la interfaz
        dish = Dish(
                "Hamburguesa",
                R.drawable.hamburguesa_patatas_1,
                10f,
                "Hamburguesa de pollo hecha  a la parrilla con patatas fritas")

        return root
    }

   /* override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.pager, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }*/
}
