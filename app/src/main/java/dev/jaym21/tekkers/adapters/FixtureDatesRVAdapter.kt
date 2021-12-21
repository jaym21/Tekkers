package dev.jaym21.tekkers.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.jaym21.tekkers.R
import dev.jaym21.tekkers.utils.DateUtils

class FixtureDatesRVAdapter(private val dates: List<Long>): RecyclerView.Adapter<FixtureDatesRVAdapter.FixtureDatesViewHolder>() {

    inner class FixtureDatesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val date: TextView = itemView.findViewById(R.id.tvDate)
        val day: TextView = itemView.findViewById(R.id.tvDay)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FixtureDatesViewHolder {
        return FixtureDatesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_date_item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: FixtureDatesViewHolder, position: Int) {
        val currentItem = dates[position]
        holder.date.text = DateUtils().convertTimeMillisToDate(currentItem).substring(8)
        val dayOfWeek = DateUtils().getDayOfWeek(currentItem).substring(0,3)
        holder.day.text = dayOfWeek
    }

    override fun getItemCount(): Int {
        return dates.size
    }
}