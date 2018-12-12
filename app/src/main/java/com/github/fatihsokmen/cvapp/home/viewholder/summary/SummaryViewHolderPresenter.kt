package com.github.fatihsokmen.cvapp.home.viewholder.summary

import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import javax.inject.Inject

class SummaryViewHolderPresenter @Inject constructor() : SummaryViewHolderContract.Presenter {

    private lateinit var view: SummaryViewHolderContract.View

    override fun setView(view: SummaryViewHolderContract.View) {
        this.view = view
    }

    override fun bindData(data: SummaryModel) {
        view.setName(data.name)
        view.setTitle(data.title)
        view.setLocation(data.location)
        view.setDescription(data.description)
        view.setProfilePhotoUrl(data.profilePhotoUrl)
    }
}