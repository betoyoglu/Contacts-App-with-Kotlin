package com.example.contacts_app_with_kotlin.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts_app_with_kotlin.R
import com.example.contacts_app_with_kotlin.data.entity.Kisiler
import com.example.contacts_app_with_kotlin.databinding.FragmentAnasayfaBinding
import com.example.contacts_app_with_kotlin.ui.adapter.KisilerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa,container, false)
        binding.anasayfaFragment=this

        binding.anasayfaToolbarBaslik = "kişiler"

        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1, "ahmet", "222")
        val k2 = Kisiler(2, "ali", "111")
        val k3 = Kisiler(3, "ada", "333")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter = KisilerAdapter(requireContext(), kisilerListesi)
        binding.kisilerAdapter = kisilerAdapter

        binding.searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
               return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }
        })
        return binding.root
    }

    fun fabTikla(it:View){ //view herhangi bir görsel nesne demek
        Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
    }

    fun ara(aramaKelimesi:String){
        Log.e("kişi ara", aramaKelimesi)
    }

}