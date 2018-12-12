package com.github.fatihsokmen.cvapp.home.data.model

interface ItemModel {

    val type: Int

    companion object {
        const val SECTION = 0
        const val SUMMARY = 1
        const val EXPERIENCE = 2
        const val SKILLS = 3
        const val RECOMMENDATION = 4
    }
}