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
        val yeniKisi = Kisiler(0,kisi_ad,kisi_tel)
        kdao.kaydet(yeniKisi)
    }

    suspend fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        val guncellenenKisi = Kisiler(kisi_id,kisi_ad,kisi_tel)
        kdao.guncelle(guncellenenKisi)
    }

    suspend fun sil (kisi_id:Int){
        val silinenKisi = Kisiler(kisi_id, "", "")
        kdao.sil(silinenKisi)
    }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kdao.ara(aramaKelimesi)
        }
}