package com.yakupbaki.kentsimgelerikotlin

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yakupbaki.kentsimgelerikotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarklist = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.coolosseum)
        val eiffel = Landmark("Eiffel", "France", R.drawable.effiel)
        val nasrullah = Landmark("Nasrullah", "Türkiye", R.drawable.nasrullah)


        landmarklist.add(pisa)
        landmarklist.add(colosseum)
        landmarklist.add(eiffel)
        landmarklist.add(nasrullah)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarklist)
        binding.recyclerView.adapter = landmarkAdapter
    }
}