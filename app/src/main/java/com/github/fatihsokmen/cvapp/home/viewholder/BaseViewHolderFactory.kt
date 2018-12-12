package com.github.fatihsokmen.cvapp.home.viewholder


import android.view.ViewGroup
import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import dagger.BindsInstance

interface BaseViewHolderFactory<T : ItemModel> {

    fun createViewHolder(): BaseViewHolder<T>

    interface Builder<T : ItemModel> {

        @BindsInstance
        fun parentView(parentView: ViewGroup): Builder<T>

        fun baseComponent(baseComponent: BaseComponent): Builder<T>

        fun layoutModule(layoutModule: BaseViewHolderLayoutModule): Builder<T>

        fun build(): BaseViewHolderFactory<T>
    }
}