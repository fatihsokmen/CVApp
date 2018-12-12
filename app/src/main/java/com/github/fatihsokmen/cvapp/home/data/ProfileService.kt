package com.github.fatihsokmen.cvapp.home.data

import com.github.fatihsokmen.cvapp.home.data.dto.ProfileDto
import io.reactivex.Single
import retrofit2.http.GET


interface ProfileService {

    @GET(value = "66816372375a17b7f0be55248798398d/raw/3cf3c70938ee03b1cb2b2a93dfc86d55297ba639/p.json")
    fun getProfile(): Single<ProfileDto>
}