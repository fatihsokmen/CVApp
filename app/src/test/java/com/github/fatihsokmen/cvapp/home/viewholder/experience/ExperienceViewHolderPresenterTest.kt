package com.github.fatihsokmen.cvapp.home.viewholder.experience

import com.flextrade.jfixture.FixtureAnnotations
import com.flextrade.jfixture.annotations.Fixture
import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import org.junit.Before
import org.junit.Test

import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class ExperienceViewHolderPresenterTest {

    @Mock
    lateinit var mockView: ExperienceViewHolderContract.View

    @Fixture
    lateinit var fixtData: ExperienceModel

    private val sut = ExperienceViewHolderPresenter()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        FixtureAnnotations.initFixtures(this)
        sut.setView(mockView)
    }


    @Test
    fun bindData() {
        sut.bindData(fixtData)

        verify(mockView).setJobTitle(fixtData.title)
        verify(mockView).setCompany(fixtData.company)
        verify(mockView).setDates(fixtData.dates)
        verify(mockView).setCompanyLogoUrl(fixtData.companyLogoUrl)
    }
}