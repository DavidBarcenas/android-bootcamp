package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.Datasource

class DogCardAdapter(
    private val context: Context,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.ItemViewHolder>() {

    private val dogList = Datasource.dogs

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val dogImage: ImageView = view.findViewById(R.id.dog_image)
        val dogName: TextView = view.findViewById(R.id.dog_name)
        val dogAge: TextView = view.findViewById(R.id.dog_age)
        val dogHobbies: TextView = view.findViewById(R.id.dog_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var card: Int;

        if(layout == Layout.GRID) {
            card = R.layout.grid_list_item
        } else {
            card = R.layout.vertical_horizontal_list_item
        }

        val adapterLayout = LayoutInflater.from(parent.context).inflate(card, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val dog = dogList[position]
        holder.dogImage.setImageResource(dog.imageResourceId)
        holder.dogName.text = dog.name

        val resources = context?.resources
        holder.dogAge.text = resources?.getString(R.string.dog_age, dog.age)
        holder.dogHobbies.text = resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }

    override fun getItemCount() = dogList.size
}