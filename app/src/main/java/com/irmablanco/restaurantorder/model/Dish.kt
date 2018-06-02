package com.irmablanco.restaurantorder.model

import java.io.Serializable

/*data class Dish(val name: String, val image: Int, val price: Float, val description: String, val alergens: List<String> = listOf() ) : Serializable{

}*/
data class Dish(val name: String, val image: Int, val price: Float, val description: String) : Serializable{

}