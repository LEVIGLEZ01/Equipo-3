package com.lewis23.recycle_e3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductoAdapter (var context: Context,
                       var ListaProductos: MutableList<dtProducto>) : RecyclerView.Adapter<ProductoAdapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView
        init {
            txtid=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtdescripcion: TextView
        init {
            txtdescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtprecio_menudeo: TextView
        init {
            txtprecio_menudeo=itemView.findViewById(R.id.txtPrecio_Menudeo)
        }
        lateinit var txtprecio_mayoreo: TextView
        init {
            txtprecio_mayoreo=itemView.findViewById(R.id.txtPrecio_Mayoreo)
        }
        lateinit var txtimagen: ImageView
        init {
           txtimagen=itemView.findViewById(R.id.imagen)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.vista_productos,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaProductos.size
    }

    override fun onBindViewHolder(holder: vHolder, position: Int) {
        var productos = ListaProductos[position]
        holder.txtid.text=productos.Id
        holder.txtdescripcion.text=productos.Descripcion
        holder.txtprecio_menudeo.text=productos.Precio_menudeo
        holder.txtprecio_mayoreo.text=productos.Precio_mayoreo
        Picasso.get().load(productos.url).into(holder.txtimagen)

    }


}