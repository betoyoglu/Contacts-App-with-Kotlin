package com.example.contacts_app_with_kotlin.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.contacts_app_with_kotlin.R
import com.example.contacts_app_with_kotlin.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {
    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.toolbarKisiKayit.title = "kişi kayıt"

        binding.buttonKaydet.setOnClickListener {
            val kisi_ad = binding.editTextKisiAd.text.toString()
            val kisi_tel= binding.editTextKisiTel.text.toString()
            kaydet(kisi_ad,kisi_tel)
        }
        return binding.root
    }

    fun kaydet(kisi_ad:String, kisi_tel:String){
        Log.e("kişi kaydet", "$kisi_ad - $kisi_tel")
    }

}