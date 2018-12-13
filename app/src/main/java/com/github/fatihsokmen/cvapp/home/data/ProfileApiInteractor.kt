package com.github.fatihsokmen.cvapp.home.data

import com.github.fatihsokmen.cvapp.home.data.model.*
import io.reactivex.Single
import javax.inject.Inject

class ProfileApiInteractor @Inject constructor(
    private val profileService: ProfileService,
    private val dtoToModelMapper: ProfileDtoToModelMapper
) {

    /**
     * Get profile JSON and map profile Dto object to screen model objects
     */
    fun getProfile(): Single<List<ItemModel>> =
        profileService.getProfile().map { profileDto ->
            dtoToModelMapper.map(profileDto)
        }
}