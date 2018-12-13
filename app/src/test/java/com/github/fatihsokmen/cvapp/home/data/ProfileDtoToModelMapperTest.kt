package com.github.fatihsokmen.cvapp.home.data

import com.flextrade.jfixture.FixtureAnnotations
import com.flextrade.jfixture.JFixture
import com.flextrade.jfixture.annotations.Fixture
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.dependency.resource.StringResources
import com.github.fatihsokmen.cvapp.home.data.dto.ProfileDto
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import com.github.fatihsokmen.cvapp.home.data.model.SectionModel
import org.hamcrest.collection.IsCollectionWithSize.hasSize
import org.hamcrest.core.IsCollectionContaining.hasItems
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when` as whenever
import org.mockito.MockitoAnnotations

class ProfileDtoToModelMapperTest {

    @Mock
    lateinit var mockResources: StringResources

    @Fixture
    lateinit var fixtDto: ProfileDto

    private lateinit var sut: ProfileDtoToModelMapper

    private val fixture = JFixture()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        FixtureAnnotations.initFixtures(this, fixture)
        sut = ProfileDtoToModelMapper(mockResources)
    }

    @Test
    fun map() {
        val fixtSection = fixture.create(String::class.java)
        Mockito.`when`(mockResources.getString(R.string.section_experiences)).thenReturn(fixtSection)
        val fixtSkills = fixture.create(String::class.java)
        whenever(mockResources.getString(R.string.section_skills)).thenReturn(fixtSkills)
        val fixtRecommendation = fixture.create(String::class.java)
        whenever(mockResources.getString(R.string.section_recommendations)).thenReturn(fixtRecommendation)

        val actual = sut.map(fixtDto)

        assertThat(actual, hasSize(11))
        assertThat(
            actual, hasItems(
                SectionModel(fixtSection) as ItemModel,
                SectionModel(fixtSkills) as ItemModel,
                SectionModel(fixtRecommendation) as ItemModel
            )
        )
    }
}