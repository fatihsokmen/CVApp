package com.github.fatihsokmen.cvapp.home.data

import com.flextrade.jfixture.FixtureAnnotations
import com.flextrade.jfixture.JFixture
import com.flextrade.jfixture.annotations.Fixture
import com.github.fatihsokmen.cvapp.home.data.dto.ProfileDto
import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import io.reactivex.Single
import org.junit.Assert.assertEquals
import org.junit.Test

import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito.`when` as whenever

import org.mockito.MockitoAnnotations

class ProfileApiInteractorTest {

    @Mock
    lateinit var mockService: ProfileService
    @Mock
    lateinit var mockMapper: ProfileDtoToModelMapper

    @Fixture
    lateinit var fixtProfile: ProfileDto
    @Fixture
    @JvmSuppressWildcards
    lateinit var fixtProfileItems: List<ItemModel>

    private lateinit var sut: ProfileApiInteractor

    private val fixture = JFixture()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        fixture.customise().useSubType(ItemModel::class.java, ExperienceModel::class.java)
        FixtureAnnotations.initFixtures(this, fixture)
        sut = ProfileApiInteractor(mockService, mockMapper)
    }

    @Test
    fun getProfile() {
        whenever(mockService.getProfile()).thenReturn(Single.just(fixtProfile))
        whenever(mockMapper.map(fixtProfile)).thenReturn(fixtProfileItems)

        val actual = sut.getProfile().test()

        actual.assertTerminated()
        assertEquals(actual.values().first(), fixtProfileItems)
    }
}