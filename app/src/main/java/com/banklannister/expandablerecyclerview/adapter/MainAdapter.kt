package com.banklannister.expandablerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.banklannister.expandablerecyclerview.R
import com.banklannister.expandablerecyclerview.databinding.ParentItemBinding
import com.banklannister.expandablerecyclerview.model.MainModel

class MainAdapter(private val collections: List<MainModel>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            tvParentTitle.text = collection.title

            val subItemAdapter = SubItemAdapter(collection.subItemModels)
            rvSubItem.adapter = subItemAdapter

            tvParentTitle.setOnClickListener {
                rvSubItem.visibility = if (rvSubItem.isShown) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount() = collections.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ParentItemBinding.bind(itemView)
    }
}