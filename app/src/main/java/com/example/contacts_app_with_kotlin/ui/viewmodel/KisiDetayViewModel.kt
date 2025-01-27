package com.example.contacts_app_with_kotlin.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.contacts_app_with_kotlin.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiDetayViewModel : ViewModel() {
    var krepo = KisilerRepository()

    fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.guncelle(kisi_id,kisi_ad,kisi_tel)
        }
    }
}