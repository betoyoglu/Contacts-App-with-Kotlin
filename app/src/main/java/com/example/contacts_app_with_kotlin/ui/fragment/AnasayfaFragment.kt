package com.example.contacts_app_with_kotlin.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts_app_with_kotlin.R
import com.example.contacts_app_with_kotlin.data.entity.Kisiler
import com.example.contacts_app_with_kotlin.databinding.FragmentAnasayfaBinding
import com.example.contacts_app_with_kotlin.ui.adapter.KisilerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)

        binding.toolbarAnasayfa.title = "kişiler"

        binding.rv.layoutManager = LinearLayoutManager(requireContext())

        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1, "ahmet", "222")
        val k2 = Kisiler(2, "ali", "111")
        val k3 = Kisiler(3, "ada", "333")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter = KisilerAdapter(requireContext(), kisilerListesi)
        binding.rv.adapter = kisilerAdapter

        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

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

    fun ara(aramaKelimesi:String){
        Log.e("kişi ara", aramaKelimesi)
    }

}