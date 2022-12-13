package com.banklannister.expandablerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.banklannister.expandablerecyclerview.R
import com.banklannister.expandablerecyclerview.databinding.SublistItemBinding
import com.banklannister.expandablerecyclerview.model.SubItemModel

class SubItemAdapter(private val subItemModel: List<SubItemModel>) :
    RecyclerView.Adapter<SubItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sublist_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.apply {
           tvSubItemTitle.text = subItemModel[position].subItemTitle
       }
    }

    override fun getItemCount() = subItemModel.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = SublistItemBinding.bind(itemView)

    }
}