package com.example.firstproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstproject.databinding.RecyclerViewItemView1Binding
import com.example.firstproject.databinding.RecyclerViewItemView2Binding

class CombineRvAdapter(private val context: Context, private val dataList: List<RecyclerData>) :
    RecyclerView.Adapter<CombineRvAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (viewType == 0) {
            ViewHolder(
                LayoutInflater.from(context)
                    .inflate(R.layout.recycler_view_item_view_1, parent, false)
            )
        } else {
            ViewHolder(
                LayoutInflater.from(context)
                    .inflate(R.layout.recycler_view_item_view_2, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = dataList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind1(position: Int) {
            val firstBinding = RecyclerViewItemView1Binding.bind(itemView)

            firstBinding.text1.text = dataList[position].text
        }

        fun bind2(position: Int) {
            val secondBinding = RecyclerViewItemView2Binding.bind(itemView)

            secondBinding.text2.text = dataList[position].text
        }

        fun bind(position: Int) {
            if (dataList[position].type == 0) {
                bind1(position)
            } else {
                bind2(position)
            }
        }
    }


    override fun getItemViewType(position: Int): Int {
        return dataList[position].type
    }
}