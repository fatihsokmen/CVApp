package com.github.fatihsokmen.cvapp.home.viewholder.recommendation

import com.flextrade.jfixture.FixtureAnnotations
import com.flextrade.jfixture.annotations.Fixture
import com.github.fatihsokmen.cvapp.home.data.model.RecommendationModel
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class RecommendationViewHolderPresenterTest {

    @Mock
    lateinit var mockView: RecommendationViewHolderContract.View

    @Fixture
    lateinit var fixtData: RecommendationModel

    private val sut = RecommendationViewHolderPresenter()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        FixtureAnnotations.initFixtures(this)
        sut.setView(mockView)
    }


    @Test
    fun bindData() {
        sut.bindData(fixtData)

        verify(mockView).setStatement(fixtData.statement)
        verify(mockView).setWho(fixtData.who)
        verify(mockView).setWhoCompany(fixtData.whoCompany)
        verify(mockView).setWhoProfilePhotoUrl(fixtData.whoPhotoUrl)
    }
}