package com.github.fatihsokmen.cvapp.home

import com.github.fatihsokmen.cvapp.home.data.model.ItemModel

interface HomeFragmentContract {

    interface View {

        fun bindData(data: List<ItemModel>)

        fun showProgress(show: Boolean)

        fun showMessage(message: String)

        fun showError(message: String)
    }

    interface Presenter {

        fun init()

        fun clearSubscriptions()
    }
}