package com.github.fatihsokmen.cvapp.home.data

import com.github.fatihsokmen.cvapp.home.data.dto.ProfileDto
import io.reactivex.Single
import retrofit2.http.GET


interface ProfileService {

    @GET(value = "28447918c157e033aafdaa32763275a4/raw/f9ad14ed798dd5851c3172341ec229f7761dc002/cv.json")
    fun getProfile(): Single<ProfileDto>
}