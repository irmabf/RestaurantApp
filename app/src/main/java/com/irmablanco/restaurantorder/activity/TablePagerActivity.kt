package com.irmablanco.restaurantorder.activity

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v13.app.FragmentPagerAdapter
import com.irmablanco.restaurantorder.R
import com.irmablanco.restaurantorder.model.Tables
import kotlinx.android.synthetic.main.activity_table_pager.*

class TablePagerActivity : AppCompatActivity() {

    /**Vamos a necesitar un modelo y un adaptador para poder cargar los fragmentos en el TablePager
     *
    * Para el modelo: Creamos una instancia de la clase Table
    *
    * Para crear el adaptador: Hacemos uso de la clase Fragment Pager Adapter*
    *
    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_pager)

        val tables = Tables()
        /**
         *Aquí estamos creando una clase anonima que hereda de FragmentPagerAdapter que debe implementar
         * los métodos de la superclase getItem y getCount
         * getCount devuelve la cantidad de elementos del modelo Table
         *getItem me devuelve un fragment
         *
         * */
        val adapter = object: FragmentPagerAdapter(fragmentManager){
            /**
            * getItem devuelve un fragment. Tengo que devolver es un nuevo fragment que representa el
            * que me están pasando como índice. Ej: Si tengo 3 mesas, se va a llamar 3 veces a este método,
             * la primera con pos 0, donde tengo que devolver la primera mesa o un fragment con la primera
             * mesa etc.
             *
             * Invocamos a DishFragment con el metodo newInstance
             * **/
            override fun getItem(position: Int): Fragment {
                return DishFragment.newInstance(tables.getTable(position))
            }
            override fun getCount() = tables.count

            override fun getPageTitle(position: Int): CharSequence? {
                return tables.getTable(position).name
            }
            }
            //Paso el adaptador al view_pager, el adaptador dirá al pager los fragment que necesita
            view_pager.adapter = adapter
           //Por último vamos al android manifest e indicamos que el TablePagerActivity es el launccher
        }

    }

