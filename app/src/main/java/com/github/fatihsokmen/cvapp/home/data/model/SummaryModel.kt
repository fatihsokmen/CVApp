package com.github.fatihsokmen.cvapp.home.data.model

data class SummaryModel(
        val name: String,
        val title: String,
        val location: String,
        val description: String,
        val profilePhotoUrl: String
) : ItemModel {

    override val type: Int
        get() = ItemModel.SUMMARY
}