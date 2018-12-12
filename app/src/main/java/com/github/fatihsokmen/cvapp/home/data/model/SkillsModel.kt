package com.github.fatihsokmen.cvapp.home.data.model

data class SkillsModel(
        val skills: List<String>
) : ItemModel {

    override val type: Int
        get() = ItemModel.SKILLS
}