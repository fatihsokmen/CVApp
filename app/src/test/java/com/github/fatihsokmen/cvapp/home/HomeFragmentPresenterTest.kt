package com.github.fatihsokmen.cvapp.home

import com.flextrade.jfixture.FixtureAnnotations
import com.flextrade.jfixture.JFixture
import com.flextrade.jfixture.annotations.Fixture
import com.github.fatihsokmen.cvapp.TestScheduler
import com.github.fatihsokmen.cvapp.home.data.ProfileApiInteractor
import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import io.reactivex.Single
import org.junit.Test

import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.Mockito.`when` as whenever
import org.mockito.MockitoAnnotations
import java.lang.IllegalArgumentException

class HomeFragmentPresenterTest {

    @Mock
    lateinit var mockView: HomeFragmentContract.View
    @Mock
    lateinit var mockInteractor: ProfileApiInteractor

    @Fixture
    @JvmSuppressWildcards
    lateinit var fixtProfileItems: List<ItemModel>

    private lateinit var sut: HomeFragmentPresenter

    private val fixture = JFixture()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        fixture.customise().useSubType(ItemModel::class.java, ExperienceModel::class.java)
        FixtureAnnotations.initFixtures(this, fixture)
        sut = HomeFragmentPresenter(mockView, mockInteractor, TestScheduler())
    }

    @Test
    fun init() {
        whenever(mockInteractor.getProfile()).thenReturn(Single.just(fixtProfileItems))

        sut.init()

        verify(mockView).showProgress(true)
        verify(mockView).showProgress(false)
        verify(mockView).bindData(fixtProfileItems)
    }

    @Test
    fun initWhenError() {
        val fixtError = fixture.create(String::class.java)
        whenever(mockInteractor.getProfile()).thenReturn(Single.error(IllegalArgumentException(fixtError)))

        sut.init()

        verify(mockView).showProgress(true)
        verify(mockView).showProgress(false)
        verify(mockView).showError(fixtError)
    }
}