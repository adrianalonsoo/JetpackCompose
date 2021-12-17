package com.example.ejercicioprimeraevaluacion

sealed class NavDrawerItem(var route: String,var icon: Int, var title: String){
    object Inicio: NavDrawerItem("Inicio",R.drawable.home,"Inicio")
    object Equipos: NavDrawerItem("Equipos",R.drawable.nba,"Equipos")
}
