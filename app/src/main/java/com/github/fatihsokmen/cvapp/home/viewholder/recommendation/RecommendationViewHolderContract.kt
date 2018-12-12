package com.github.fatihsokmen.cvapp.home.viewholder.recommendation

import com.github.fatihsokmen.cvapp.home.data.model.RecommendationModel

interface RecommendationViewHolderContract {

    interface View {
        fun setStatement(statement: String)

        fun setWho(who: String)

        fun setWhoCompany(company: String)

        fun setWhoProfilePhotoUrl(url: String)
    }

    interface Presenter {
        fun setView(view: RecommendationViewHolderContract.View)

        fun bindData(data: RecommendationModel)
    }
}