package com.github.fatihsokmen.cvapp.home.viewholder.recommendation

import com.github.fatihsokmen.cvapp.home.data.model.RecommendationModel
import javax.inject.Inject

class RecommendationViewHolderPresenter @Inject constructor() : RecommendationViewHolderContract.Presenter {

    private lateinit var view: RecommendationViewHolderContract.View

    override fun setView(view: RecommendationViewHolderContract.View) {
        this.view = view
    }

    override fun bindData(data: RecommendationModel) {
        view.setStatement(data.statement)
        view.setWho(data.who)
        view.setWhoCompany(data.whoCompany)
        view.setWhoProfilePhotoUrl(data.whoPhotoUrl)
    }
}