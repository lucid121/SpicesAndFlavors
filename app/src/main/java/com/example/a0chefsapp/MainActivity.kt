package com.example.a0chefsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data
        val foodItemList = listOf(
            FoodItem("Spaghetti with Meatballs", "R85", R.drawable.main1),
            FoodItem("Cheeseburgers", "R90", R.drawable.main2),
            FoodItem("Pizza", "R110", R.drawable.main3),
            FoodItem("BBQ Ribs", "R130", R.drawable.main4),
            FoodItem("Pizza with Vegetables", "R100", R.drawable.pizza1),
            FoodItem("Pepperoni Pizza", "R110", R.drawable.pizza2),
            FoodItem("Margherita Pizza", "R95", R.drawable.pizza3),
            FoodItem("Mixed Pizza", "R115", R.drawable.pizza4),
            FoodItem("Oysters", "R160", R.drawable.seafood1),
            FoodItem("Shrimp", "R140", R.drawable.seafood2),
            FoodItem("Grilled Lobster", "R200", R.drawable.seafood3),
            FoodItem("Sliced Salmon", "R180", R.drawable.seafood4),
            FoodItem("Popcorn", "R25", R.drawable.snack1),
            FoodItem("Pocky Sticks", "R30", R.drawable.snack2),
            FoodItem("Chocolate Bar", "R40", R.drawable.snack3),
            FoodItem("Lay's Chips", "R35", R.drawable.snack4),
            FoodItem("Cream Soup", "R55", R.drawable.soup1),
            FoodItem("Vegetable Soup", "R50", R.drawable.soup2),
            FoodItem("Potato Soup", "R60", R.drawable.soup3),
            FoodItem("Chicken Noodle Soup", "R65", R.drawable.soup4),
            FoodItem("Fried Shrimp", "R100", R.drawable.starter1),
            FoodItem("Chicken Skewers", "R85", R.drawable.starter2),
            FoodItem("Grilled Vegetables", "R75", R.drawable.starter3),
            FoodItem("Stuffed Mushrooms", "R90", R.drawable.starter4)
        )


        // Set up RecyclerView with GridLayoutManager and Adapter
        val recyclerView = findViewById<RecyclerView>(R.id.recycle)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = BestFoodAdapter(foodItemList)
        // Setting up icon and text IDs to be clickable and to open respective activities
        setupClickListener(R.id.drinkiconid, drink::class.java)
        setupClickListener(R.id.drinktextid, drink::class.java)

        setupClickListener(R.id.startericonid, starter::class.java)
        setupClickListener(R.id.startertextid, starter::class.java)

        setupClickListener(R.id.mainiconid, main::class.java)
        setupClickListener(R.id.maintextid, MainActivity::class.java)

        setupClickListener(R.id.soupiconid, soup::class.java)
        setupClickListener(R.id.souptextid, soup::class.java)

        setupClickListener(R.id.pizzaiconid, pizza::class.java)
        setupClickListener(R.id.pizzatextid, pizza::class.java)

        setupClickListener(R.id.dessericonid, dessert::class.java)
        setupClickListener(R.id.dessertextid, dessert::class.java)

        setupClickListener(R.id.breakfasticonid, breakfast::class.java)
        setupClickListener(R.id.breakfasttextid, breakfast::class.java)

        setupClickListener(R.id.seafoodiconid, seafood::class.java)
        setupClickListener(R.id.seafoodtextid, seafood::class.java)
    }

    // Function to simplify setting click listeners and starting activities
    private fun setupClickListener(viewId: Int, targetActivity: Class<*>) {
        findViewById<View>(viewId).setOnClickListener {
            val intent = Intent(this, targetActivity)
            startActivity(intent)
        }
    }

}

