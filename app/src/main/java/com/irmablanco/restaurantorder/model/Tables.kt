package com.irmablanco.restaurantorder.model

import java.io.Serializable

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