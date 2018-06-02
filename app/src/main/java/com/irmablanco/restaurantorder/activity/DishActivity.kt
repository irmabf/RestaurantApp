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
    /**El tag aqui pertenecería a las instancias, seria un
     * atributo de instancia o de objeto y eso
     * no es  correcto, con lo que crearemos un companion object
     *Lo que creemos en un companion object pertenece a la clase y no al objeto
     *El companion object es un equivalente al static var de java,
     * un metodo estatico tambien se meteria en el companion object*/
    //val TAG = DishActivity::class.java.canonicalName
    /*companion object {
        val TAG = DishActivity::class.java.canonicalName
    }*/

}