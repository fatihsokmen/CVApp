package com.github.fatihsokmen.cvapp.home.viewholder.summary

import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel

interface SummaryViewHolderContract {

    interface View {
        fun setName(name: String)

        fun setTitle(title: String)

        fun setLocation(location: String)

        fun setDescription(description: String)

        fun setProfilePhotoUrl(url: String)
    }

    interface Presenter {
        fun setView(view: SummaryViewHolderContract.View)

        fun bindData(data: SummaryModel)
    }
}