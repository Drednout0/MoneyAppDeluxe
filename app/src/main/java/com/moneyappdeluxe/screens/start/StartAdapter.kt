package com.moneyappdeluxe.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.fitness.data.Value
import com.moneyappdeluxe.R
import com.moneyappdeluxe.model.startModel.ValuteItem
import com.moneyappdeluxe.model.startModel.Valutes
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter() : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    private var listStart =

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].Name
        holder.itemView.previous.text = listStart[position].Previous.toString()
        holder.itemView.charCode.text = listStart[position].CharCode
        holder.itemView.value.text = listStart[position].Value.toString()

    }

    override fun getItemCount(): Int {
        return listStart.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(map: List<ValuteItem, String>) {
        listStart = listOf<Valutes>()
        notifyDataSetChanged()
    }

}

