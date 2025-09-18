package edu.temple.simplerecyclerview

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NumberDisplayAdapter(private val items: Array<Int>):
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {
        class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder
            (textView) {

        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = NumberViewHolder (
        TextView(parent.context).apply {
            setPadding(10,10,10,10)
        }
    )

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        with (holder.textview){
            text = items[position].toString()
            textSize = items[position].toFloat()
        }
    }

    override fun getItemCount() = items.size

}