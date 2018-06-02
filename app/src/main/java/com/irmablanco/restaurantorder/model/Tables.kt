package com.irmablanco.restaurantorder.model

import android.app.ActionBar
import com.irmablanco.restaurantorder.R
import kotlinx.android.synthetic.main.fragment_dish.view.*
import java.io.Serializable


/*
object Tables : Serializable {
    private  var tables: List<Table> = listOf(
            Table("Mesa 1"),
            Table("Mesa 2"),
            Table("Mesa 3"),
            Table("Mesa 4"),
            Table("Mesa 5"),
            Table("Mesa 6"),
            Table("Mesa 7"),
            Table("Mesa 8"),
            Table("Mesa 9"),
            Table("Mesa 10"),
            Table("Mesa 11"),
            Table("Mesa 12")
    )
    val count
        get() = tables.size
    /*Operator overloading*/
    operator fun get(index: Int) = tables[index]

    /*inline fun <reified T> Collection<T>.toTypedArray(): Array<T> (source)
       Returns a typed array containing all of the elements of this collection.
        Allocates an array of runtime type T having its size equal to the size of this collection and populates
        the array with the elements of this collection.

        val collection = listOf(1, 2, 3)
        val array = collection.toTypedArray()
        println(array.contentToString()) // [1, 2, 3]*/
    fun toArray() = tables.toTypedArray()
 }
    */

class Tables{

    //Generamos una lista de mesas
    private  val tables: List<Table> = listOf(
            Table("Mesa 1", Dish("Hamburguesa", R.drawable.plato_hamburguesa, 6f, "Hamburguesa de pollo o vacuno con patatas fritas. Hecha a la parrilla")),
            Table("Mesa 2", Dish("Pizza 4 Quesos", R.drawable.pizza_quesos_plato, 10f, "Pizza de 4 quesos hecha en  horno de lecha. Tomate natural y quesos artesanales")),
            Table("Mesa 3", Dish("Salmon", R.drawable.salmon_plato, 10f, "Salmon a la plancha con aceite de oliva"))
    )

    /**
     * OPCIONES PARA ACCEDER A LAS MESAS
     * */
    /*Para poder acceder desde fuera a una mesa en concreto necesito saber cuantas mesas hay en este array o lista de mesas
    *
    * */
    val count
        get() = tables.size

    /*
    * Para acceder a una mesa, metodo donde me pasan el indice
    * y yo devuelvo, de todas las ciudades, aquella que me pasan por índice
    * **/
    fun getTable(index: Int) = tables[index]
}








