package com.example.contacts_app_with_kotlin.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.contacts_app_with_kotlin.R
import com.example.contacts_app_with_kotlin.databinding.FragmentKisiDetayBinding

class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKisiDetayBinding.inflate(inflater,container, false)

        binding.toolbarKisiDetay.title = "kişi detay"
        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        binding.editTextKisiAd.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_tel)

        binding.buttonGuncelle.setOnClickListener {
            val kisi_ad = binding.editTextKisiAd.text.toString()
            val kisi_tel = binding.editTextKisiTel.text.toString()
            guncelle(gelenKisi.kisi_id, kisi_ad,kisi_tel)
        }

        return binding.root
    }

    fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        Log.e("kişi güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }
}