package com.github.fatihsokmen.cvapp.home.data.model

data class ProfileModel(
        val summary: SummaryModel,
        val experiences: List<ExperienceModel>,
        val skills: List<String>,
        val recommendations: List<RecommendationModel>
)