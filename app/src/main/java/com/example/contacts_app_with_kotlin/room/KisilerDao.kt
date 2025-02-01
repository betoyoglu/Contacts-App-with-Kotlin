package com.example.contacts_app_with_kotlin.room

import androidx.room.Dao
import androidx.room.Query
import com.example.contacts_app_with_kotlin.data.entity.Kisiler

@Dao
interface KisilerDao {
    @Query("SELECT * FROM kisiler")
    suspend fun kisileriYukle() : List<Kisiler>
}