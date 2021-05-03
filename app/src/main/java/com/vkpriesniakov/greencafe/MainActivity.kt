package com.vkpriesniakov.greencafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.vkpriesniakov.greencafe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var dishes: ArrayList<Dishes>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mAdapter = CafeAdapter()
        binding.includeContent.mainRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = mAdapter
        }

        initiateDishes()

        mAdapter.setDishes(dishes)
    }

    private fun initiateDishes() {
        dishes = ArrayList()

        dishes.apply {
            add(
                Dishes(
                    image = ContextCompat.getDrawable(this@MainActivity, R.drawable.pizza_image),
                    description = "Вітчина, помідори,перець, сир, вершковий соус, гриби",
                    title = "Фірмова",
                    price = "150 грн",
                    size = "50 см/1200 г"
                )
            )
            add(
                Dishes(
                    image = ContextCompat.getDrawable(this@MainActivity, R.drawable.cesar_pizza),
                    description = "Салямі, помідори, зелень, сир, соус",
                    title = "Цезарь",
                    price = "140 грн",
                    size = "50 см/1200 г"
                )
            )
            add(
                Dishes(
                    image = ContextCompat.getDrawable(
                        this@MainActivity,
                        R.drawable.pic_fout_seasonsd
                    ),
                    description = "Салямі, гриби, куриця, помідори, сир, соус",
                    title = "4 Сезона",
                    price = "150 грн",
                    size = "50 см/1200 г"
                )
            )
            add(
                Dishes(
                    image = ContextCompat.getDrawable(this@MainActivity, R.drawable.sea_pizza),
                    description = "Креветки, оливки, зелень, сир, мідїї, вершковий соус",
                    title = "Морська",
                    price = "165 грн",
                    size = "50 см/1300 г"
                )
            )
        }
    }
}