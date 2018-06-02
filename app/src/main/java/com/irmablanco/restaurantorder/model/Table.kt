package com.irmablanco.restaurantorder.model

import java.io.Serializable

/*data class Table (var name: String, var dish: List<Dish>?): Serializable {
    constructor(name: String): this(name, null)

    /*fun Any?.toString(): String (source)
    Returns a string representation of the object.
    Can be called with a null receiver,
    in which case it returns the string "null"

    Sobreescribimos para obtener solo el nombre al crear la lista de mesas*/
    override fun toString(): String {
        return name
    }
}*/

data class Table(var name: String, var dish: Dish): Serializable