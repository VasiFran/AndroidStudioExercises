package com.example.exercise3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise3.databinding.ReasonListBinding

class ReasonsAdapter(val list: List<ReasonsList>) : RecyclerView.Adapter<ReasonsAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ReasonListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(item: ReasonsList){
            binding.reasonsText.setText(item.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ReasonListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}