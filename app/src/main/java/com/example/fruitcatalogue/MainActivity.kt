package com.example.fruitmanifest

import Fruit
import FruitAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitcatalogue.R


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_recycler_view)

        val listOfFruit = getListOfFruits()
        val fruitAdapter = FruitAdapter(listOfFruit)

        recyclerView.adapter = fruitAdapter
    }

    private fun getListOfFruits(): List<Fruit>{
        val fruit =  mutableListOf<Fruit>()
        fruit.add(Fruit("Apple", R.drawable.apple, null))
        fruit.add(Fruit("Peach", R.drawable.peach, null))
        fruit.add(Fruit("Apricot", R.drawable.apricot, null))
        fruit.add(Fruit("Bananas", R.drawable.bananas, null))
        fruit.add(Fruit("Cherries", R.drawable.cherries, null))
        fruit.add(Fruit("Grapes", R.drawable.grapes, null))
        fruit.add(Fruit("Mango", R.drawable.mango, null))
        fruit.add(Fruit("Orange", R.drawable.orange, null))
        fruit.add(Fruit("Pineapple", R.drawable.pineapple, null))
        fruit.add(Fruit("Raspberries", R.drawable.raspberries, null))
        fruit.add(Fruit("Strawberries", R.drawable.strawberries, null))
        fruit.add(Fruit("Watermelon", R.drawable.watermelon, null))

        return fruit


    }

}