package com.irmablanco.restaurantorder.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.irmablanco.restaurantorder.R
import com.irmablanco.restaurantorder.model.Dish
import kotlinx.android.synthetic.main.activity_dish.*

class DishActivity: AppCompatActivity() {
    /**El tag aqui pertenecería a las instancias, seria un
     * atributo de instancia o de objeto y eso
     * no es  correcto, con lo que crearemos un companion object
     *Lo que creemos en un companion object pertenece a la clase y no al objeto
     *El companion object es un equivalente al static var de java,
     * un metodo estatico tambien se meteria en el companion object*/
    //val TAG = DishActivity::class.java.canonicalName
    companion object {
        val TAG = DishActivity::class.java.canonicalName
    }

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)
        //Este codigo me va a actualizar la interfaz
        dish = Dish(
                "Hamburguesa",
                R.drawable.hamburguesa_patatas_1,
                10f,
                "Hamburguesa de pollo hecha  a la parrilla con patatas fritas")

    }
}