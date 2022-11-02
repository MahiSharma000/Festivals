package com.example.festivals.adapters

import android.content.ClipData.Item
import android.content.Context
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.festivals.R
import com.example.festivals.models.Festival

class FestivalAdapter (
    private val context: Context,
    private val festival: List<Festival>,
    private  val layoutResourceId:Int
        ):RecyclerView.Adapter<FestivalAdapter.FestivalHolder>(){
    class FestivalHolder(private val itemView : View
    ) : RecyclerView.ViewHolder(itemView) {
        private val textMovie: TextView = itemView.findViewById(R.id.textFestival)
        fun bind(festival: Festival) {
            textMovie.setText(festival.fesResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FestivalHolder {
       val view=LayoutInflater.from(context).inflate(layoutResourceId,parent,false)
        return FestivalHolder(view)
    }

    override fun onBindViewHolder(holder: FestivalHolder, position: Int) {
       holder.bind(festival[position])
    }

    override fun getItemCount()=festival.count()

}