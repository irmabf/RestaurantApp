package com.irmablanco.restaurantorder.activity

//import android.app.Fragment
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.*
import com.irmablanco.restaurantorder.R
import com.irmablanco.restaurantorder.model.Dish
import com.irmablanco.restaurantorder.model.Table
import kotlinx.android.synthetic.main.fragment_dish.*

class DishFragment: Fragment() {
    /*
    * Comunicar una actividad con su fragment. Que este fragment reciba argumentos de su actividad ActivityFragment
    *
    * El metodo newInstance(table: Table) creará nuevas instancias de DishFragment
    *
    * Los DishFragment, para personalizarse, recibiran datos de la mesa de la que queremos añadir info de pedidos...
    *
    *
    * */

    companion object {
        val ARG_TABLE = "ARG_TABLE"
        fun newInstance(table: Table): Fragment {
            //Nos creamos el fragment.
            val fragment = DishFragment()
            //Nos creamos los argumentos del fragment.
            val arguments = Bundle()
            arguments.putSerializable(ARG_TABLE, table)
            //Asignamos los argumentos al fragment.
            fragment.arguments = arguments
            //Devolvemos el fragment
            return fragment
        }
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
    /*
    get() {
        return Dish(
                "Pizza",
                R.drawable.pizza_quesos_plato,
                 12f,
                "Pizza hecha en horno de leña con 4 quesos")
    }*/
    /** ====================================== FRAGMENTS LIFECYCLE =========================================================== */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_dish, container, false)
    }
    /*📌Este metodo NO equivale al onViewCreated de las activividades, en este caso se usa para
    * avisar de que la vista ya esta creada y es, por tanto, donde tenemos que actualizar la interdaz*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Este codigo me va a actualizar la interfaz
        /* dish = Dish(
                 "Hamburguesa",
                 R.drawable.hamburguesa_patatas_1,
                 10f,
                 "Hamburguesa de pollo hecha  a la parrilla con patatas fritas")*/

        val table = arguments?.getSerializable(ARG_TABLE) as Table
        dish = table.dish
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.pager, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}









