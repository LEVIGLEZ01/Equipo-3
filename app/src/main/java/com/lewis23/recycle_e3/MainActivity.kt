package com.lewis23.recycle_e3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var listaProductos: MutableList<dtProducto> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProducto("1","Galletas","$14.00","$8.75","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/galletas.jpeg?alt=media&token=1a827037-cc8f-4e1d-970e-ee960f76f0c5"))
        listaProductos.add(
            dtProducto("2", "Jugos", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/jugos.jpeg?alt=media&token=d6c8e427-d676-4e5f-b30e-5dc67a238eb8"))
        listaProductos.add(
            dtProducto("3", "Sabritas", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/sabritas.jpeg?alt=media&token=28d406fb-51e6-4566-86fe-a21dc9cc009f"))
        listaProductos.add(
            dtProducto("4", "Desodorante", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/desodorante.jpeg?alt=media&token=afc09fb6-eee8-4b85-ba6a-06f8faef6600"))
        listaProductos.add(
            dtProducto("5", "Cepillos", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/cepillos.jpeg?alt=media&token=0d0c5329-031c-42f0-9bf4-fa111aef769c"))
        listaProductos.add(
            dtProducto("6", "Pasta", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/pasta.jpeg?alt=media&token=3b6e561e-cff0-4c32-8773-e19ca6565a37"))
        listaProductos.add(
            dtProducto("7", "Gel", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/gel.jpeg?alt=media&token=abe83030-734e-4d67-a057-99e730da21a1"))
        listaProductos.add(
            dtProducto("8", "Crema", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/cremas.jpeg?alt=media&token=7c0a425a-65fc-4f5e-a8de-cf21a0347355"))
        listaProductos.add(
            dtProducto("9", "Maizena", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/maizena.jpeg?alt=media&token=7af74ba1-2549-4630-97dc-e4e2a145f2b0\""))
        listaProductos.add(
            dtProducto("10", "Libros", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/libro.jpeg?alt=media&token=275de1cf-738a-4035-b545-64478bdd33dd"))
        listaProductos.add(
            dtProducto("11", "Vasos", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/vasos.jpeg?alt=media&token=a8712701-6261-4df2-9f63-1c998199251e"))
        listaProductos.add(
            dtProducto("12", "Sopas", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/sopa.jpeg?alt=media&token=31a0db53-2101-4c1c-ac2c-32c774d65506"))
        listaProductos.add(
            dtProducto("13", "Gasas", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/gasas.jpeg?alt=media&token=2df38c50-be38-4612-b0d8-551868e2e615"))
        listaProductos.add(
            dtProducto("14", "Pizzas", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/pizza.jpeg?alt=media&token=c7c79c09-74f3-41e8-930b-ff1cf27477f4"))
        listaProductos.add(
            dtProducto("15", "Tortilla", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/tortilla.jpeg?alt=media&token=207c4a40-1904-4479-8455-4f275c758f99"))
        listaProductos.add(
            dtProducto("16", "Jamon", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/jamon.jpeg?alt=media&token=2e634707-f333-462d-a46b-422d28a2557d"))
        listaProductos.add(
            dtProducto("17", "Queso", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/queso.jpeg?alt=media&token=c8a4db4b-3c56-4c5e-bd07-45337ff6fbe3"))
        listaProductos.add(
            dtProducto("18", "Pan", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/pan.jpeg?alt=media&token=86f85966-0227-4e57-929d-0973d71925e3"))
        listaProductos.add(
            dtProducto("19", "Crema para cabello", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/crema.jpeg?alt=media&token=bdf235a1-48a3-41d7-9006-5644e18b1e7b"))
        listaProductos.add(
            dtProducto("20", "Rastrillos", "$14", "$10","https://firebasestorage.googleapis.com/v0/b/recycler-d9441.appspot.com/o/rastrillo.jpeg?alt=media&token=ec332c44-35b6-4c74-9be9-64ac5a3f60e3"))

        var tabla= findViewById<RecyclerView>(R.id.tablaProducto)
        recycler=tabla
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter=ProductoAdapter(this, listaProductos)

    }
}