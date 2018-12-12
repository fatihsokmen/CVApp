package com.github.fatihsokmen.cvapp.home.data.model

data class SectionModel(
        val title: String
) : ItemModel {

    override val type: Int
        get() = ItemModel.SECTION
}