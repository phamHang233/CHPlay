package com.example.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppAdapter(private val appList: List<AppItem>) : RecyclerView.Adapter<AppAdapter.AppViewHolder>() {

    inner class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val appName: TextView = itemView.findViewById(R.id.appName)
//        val appImage : ImageView= itemView.findViewById(R.id.appIcon)
        val appRate : TextView= itemView.findViewById(R.id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.app_item, parent, false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val currentItem = appList[position]
        holder.appName.text = currentItem.appName
        holder.appRate.text= currentItem.rating.toString()
//        holder.appImage.setImageResource(


    }

    override fun getItemCount(): Int {
        return appList.size
    }
}
