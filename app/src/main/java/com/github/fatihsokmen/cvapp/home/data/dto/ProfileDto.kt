package com.github.fatihsokmen.cvapp.home.data.dto

import com.squareup.moshi.Json

data class ProfileDto(
    @field:Json(name = "summary") val summary: SummaryDto,
    @field:Json(name = "skills") val skills: List<String>,
    @field:Json(name = "experiences") val experiences: List<ExperienceDto>,
    @field:Json(name = "recommendations") val recommendations: List<RecommendationDto>
)

data class SummaryDto(
    @field:Json(name = "name") val name: String,
    @field:Json(name = "title") val title: String,
    @field:Json(name = "location") val location: String,
    @field:Json(name = "description") val description: String,
    @field:Json(name = "profilePhotoUrl") val profilePhotoUrl: String
)

data class ExperienceDto(
    @field:Json(name = "title") val title: String,
    @field:Json(name = "company") val company: String,
    @field:Json(name = "dates") val dates: String,
    @field:Json(name = "companyLogoUrl") val companyLogoUrl: String
)

data class RecommendationDto(
    @field:Json(name = "statement") val statement: String,
    @field:Json(name = "who") val who: String,
    @field:Json(name = "whoCompany") val whoCompany: String,
    @field:Json(name = "whoPhotoUrl") val whoPhotoUrl: String
)