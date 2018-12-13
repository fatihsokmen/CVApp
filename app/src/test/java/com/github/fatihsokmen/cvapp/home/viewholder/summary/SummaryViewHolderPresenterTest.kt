package com.github.fatihsokmen.cvapp.home.viewholder.summary

import com.flextrade.jfixture.FixtureAnnotations
import com.flextrade.jfixture.annotations.Fixture
import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class SummaryViewHolderPresenterTest {

    @Mock
    lateinit var mockView: SummaryViewHolderContract.View

    @Fixture
    lateinit var fixtData: SummaryModel

    private val sut = SummaryViewHolderPresenter()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        FixtureAnnotations.initFixtures(this)
        sut.setView(mockView)
    }


    @Test
    fun bindData() {
        sut.bindData(fixtData)

        verify(mockView).setName(fixtData.name)
        verify(mockView).setTitle(fixtData.title)
        verify(mockView).setLocation(fixtData.location)
        verify(mockView).setDescription(fixtData.description)
        verify(mockView).setProfilePhotoUrl(fixtData.profilePhotoUrl)
    }
}