package com.example.contacts_app_with_kotlin.data.datasource

import android.util.Log
import com.example.contacts_app_with_kotlin.data.entity.Kisiler
import com.example.contacts_app_with_kotlin.room.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kdao:KisilerDao) {

    suspend fun kisileriYukle() : List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kdao.kisileriYukle()
        }

    suspend fun kaydet(kisi_ad:String, kisi_tel:String){
        Log.e("kişi kaydet", "$kisi_ad - $kisi_tel")
    }

    suspend fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        Log.e("kişi güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }

    suspend fun sil (kisi_id:Int){
        Log.e("kişi sil", kisi_id.toString())
    }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi = ArrayList<Kisiler>()
            val k1 = Kisiler(1, "ahmet", "222")
            kisilerListesi.add(k1)
            return@withContext kisilerListesi
        }
}