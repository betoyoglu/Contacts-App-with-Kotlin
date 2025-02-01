package com.example.contacts_app_with_kotlin.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contacts_app_with_kotlin.data.entity.Kisiler

@Database(entities = [Kisiler::class], version = 1)
abstract class Veritabani : RoomDatabase(){
    abstract fun getKisilerDao():KisilerDao
}