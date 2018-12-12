package com.github.fatihsokmen.cvapp.home.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel

abstract class BaseViewHolder<T : ItemModel> constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bindData(data: T)
}