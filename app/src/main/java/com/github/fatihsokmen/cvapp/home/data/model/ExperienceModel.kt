package com.github.fatihsokmen.cvapp.home.data.model

data class ExperienceModel(
        val title: String,
        val company: String,
        val dates: String,
        val companyLogoUrl: String
) : ItemModel {

    override val type: Int
        get() = ItemModel.EXPERIENCE
}