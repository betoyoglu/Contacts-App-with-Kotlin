package com.example.contacts_app_with_kotlin.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.contacts_app_with_kotlin.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiKayitViewModel @Inject constructor(var krepo: KisilerRepository) : ViewModel() {

    fun kaydet(kisi_ad:String, kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.kaydet(kisi_ad,kisi_tel)
        }
    }
}