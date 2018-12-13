package com.github.fatihsokmen.cvapp.home.data

import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.dependency.resource.StringResources
import com.github.fatihsokmen.cvapp.home.data.dto.ProfileDto
import com.github.fatihsokmen.cvapp.home.data.model.*
import javax.inject.Inject

class ProfileDtoToModelMapper @Inject constructor(
    private val stringResources: StringResources
) {

    fun map(profileDto: ProfileDto): List<ItemModel> =
        mutableListOf<ItemModel>().apply {
            add(
                SummaryModel(
                    profileDto.summary.name,
                    profileDto.summary.title,
                    profileDto.summary.location,
                    profileDto.summary.description,
                    profileDto.summary.profilePhotoUrl
                )
            )
            add(SectionModel(stringResources.getString(R.string.section_experiences)))
            addAll(profileDto.experiences.map { dto ->
                ExperienceModel(
                    dto.title, dto.company, dto.dates, dto.companyLogoUrl
                )
            })
            add(SectionModel(stringResources.getString(R.string.section_skills)))
            add(SkillsModel(profileDto.skills))
            add(SectionModel(stringResources.getString(R.string.section_recommendations)))
            addAll(profileDto.recommendations.map { dto ->
                RecommendationModel(
                    dto.statement, dto.who, dto.whoCompany, dto.whoPhotoUrl
                )
            })
        }
}
