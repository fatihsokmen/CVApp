package com.github.fatihsokmen.cvapp.home.adapter


import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import javax.inject.Inject

class ProfileAdapter @Inject constructor(
    private val viewHolderFactories: Map<@JvmSuppressWildcards Int, @JvmSuppressWildcards BaseViewHolderFactory.Builder<ItemModel>>
) : RecyclerView.Adapter<BaseViewHolder<ItemModel>>() {

    private var data: List<ItemModel> = emptyList()

    fun bindData(data: List<ItemModel>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ItemModel> {
        return viewHolderFactories[viewType]?.parentView(parent)?.build()?.createViewHolder()
            ?: throw IllegalArgumentException("Unknown view holder type: $viewType")
    }

    override fun onBindViewHolder(holder: BaseViewHolder<ItemModel>, position: Int) {
        holder.bindData(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
