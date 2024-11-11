package com.example.a0chefsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BestFoodAdapter(private val foodList: List<FoodItem>) :
    RecyclerView.Adapter<BestFoodAdapter.BestFoodViewHolder>() {

    // ViewHolder class to hold the layout for each item
    class BestFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.imageView2)
        val foodName: TextView = itemView.findViewById(R.id.textView3)
        val foodPrice: TextView = itemView.findViewById(R.id.textView5)
        val addButton: TextView = itemView.findViewById(R.id.textView6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestFoodViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_best_food, parent, false)
        return BestFoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: BestFoodViewHolder, position: Int) {
        val foodItem = foodList[position]
        holder.foodName.text = foodItem.name
        holder.foodPrice.text = foodItem.price
        holder.foodImage.setImageResource(foodItem.imageResourceId)

        // Optional: Set an onClickListener for addButton
        holder.addButton.setOnClickListener {
            // Handle the add button click here
        }
    }

    override fun getItemCount() = foodList.size
}