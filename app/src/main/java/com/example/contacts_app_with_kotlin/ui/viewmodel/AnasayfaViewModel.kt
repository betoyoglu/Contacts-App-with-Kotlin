package com.example.contacts_app_with_kotlin.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.contacts_app_with_kotlin.data.entity.Kisiler
import com.example.contacts_app_with_kotlin.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel(){
    var krepo = KisilerRepository()
    var kisilerListesi: MutableLiveData<List<Kisiler>> = MutableLiveData()

    init{
        kisileriYukle()
    }

    fun sil (kisi_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.sil(kisi_id)
            kisileriYukle()
        }
    }

    fun kisileriYukle() {
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = krepo.kisileriYukle()
        }

    }

    fun ara(aramaKelimesi:String){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = krepo.ara(aramaKelimesi)
        }
    }

}