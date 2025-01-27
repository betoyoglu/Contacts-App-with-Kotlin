package com.example.contacts_app_with_kotlin.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.contacts_app_with_kotlin.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiKayitViewModel : ViewModel() {
    var krepo = KisilerRepository()

    fun kaydet(kisi_ad:String, kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.kaydet(kisi_ad,kisi_tel)
        }
    }
}