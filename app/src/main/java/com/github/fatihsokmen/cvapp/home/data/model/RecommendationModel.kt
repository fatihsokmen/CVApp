package com.github.fatihsokmen.cvapp.home.data.model

data class RecommendationModel(
        val statement: String,
        val who: String,
        val whoCompany: String,
        val whoPhotoUrl: String
) : ItemModel {

    override val type: Int
        get() = ItemModel.RECOMMENDATION
}