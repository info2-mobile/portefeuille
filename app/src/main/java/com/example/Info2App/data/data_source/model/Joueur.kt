package com.example.materialdesign.data.data_source.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
 data class Joueur(
    var id:Int,
    val contenu:String,
 ) : Parcelable{
     private  fun incrementId(){
         id=id+1
     }
 }
