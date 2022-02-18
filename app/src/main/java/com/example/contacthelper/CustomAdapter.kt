package com.example.contacthelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contacthelper.model.Numbers

class CustomAdapter(var items: ArrayList<Numbers>):RecyclerView.Adapter<CustomAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items.get(position)
        holder.tv_name.setText(item.name)
        holder.tv_number.setText(item.number)
    }

    override fun getItemCount(): Int {
        return items.size
    }
    inner class VH(view: View): RecyclerView.ViewHolder(view){
        var click_item:CardView
        var tv_name: TextView
        var tv_number: TextView

        init {
            click_item = view.findViewById(R.id.click_item)
            tv_name = view.findViewById(R.id.tv_name)
            tv_number = view.findViewById(R.id.tv_number)
        }
    }
}