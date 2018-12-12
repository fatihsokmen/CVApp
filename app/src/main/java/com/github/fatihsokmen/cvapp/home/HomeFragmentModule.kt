package com.github.fatihsokmen.cvapp.home

import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.FragmentViewScope
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import com.github.fatihsokmen.cvapp.home.data.ProfileService
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderLayoutModule
import com.github.fatihsokmen.cvapp.home.viewholder.experience.DaggerExperienceViewHolderFactory
import com.github.fatihsokmen.cvapp.home.viewholder.recommendation.DaggerRecommendationViewHolderFactory
import com.github.fatihsokmen.cvapp.home.viewholder.section.DaggerSectionViewHolderFactory
import com.github.fatihsokmen.cvapp.home.viewholder.skills.DaggerSkillsViewHolderFactory
import com.github.fatihsokmen.cvapp.home.viewholder.summary.DaggerSummaryViewHolderFactory
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntKey
import dagger.multibindings.IntoMap
import retrofit2.Retrofit
import javax.inject.Inject

@Module
class HomeFragmentModule @Inject constructor(
        private val view: HomeFragmentContract.View
) {

    @Provides
    @FragmentViewScope
    fun provideView(): HomeFragmentContract.View = view

    @Provides
    @FragmentViewScope
    fun provideApiService(retrofit: Retrofit): ProfileService =
            retrofit.create(ProfileService::class.java)

    @Provides
    @FragmentViewScope
    fun provideFragmentPresenter(presenter: HomeFragmentPresenter): HomeFragmentContract.Presenter =
            presenter

    @Module
    companion object {

        @JvmStatic
        @IntoMap
        @IntKey(ItemModel.SUMMARY)
        @FragmentViewScope
        @Provides
        fun provideSummaryViewHolderFactory(baseComponent: BaseComponent): BaseViewHolderFactory.Builder<ItemModel> {
            return DaggerSummaryViewHolderFactory
                    .builder()
                    .baseComponent(baseComponent)
                    .layoutModule(BaseViewHolderLayoutModule(R.layout.view_summary_item)) as BaseViewHolderFactory.Builder<ItemModel>
        }

        @JvmStatic
        @IntoMap
        @IntKey(ItemModel.EXPERIENCE)
        @FragmentViewScope
        @Provides
        fun provideExperienceViewHolderFactory(baseComponent: BaseComponent): BaseViewHolderFactory.Builder<ItemModel> {
            return DaggerExperienceViewHolderFactory
                    .builder()
                    .baseComponent(baseComponent)
                    .layoutModule(BaseViewHolderLayoutModule(R.layout.view_experience_item)) as BaseViewHolderFactory.Builder<ItemModel>
        }

        @JvmStatic
        @IntoMap
        @IntKey(ItemModel.SECTION)
        @FragmentViewScope
        @Provides
        fun provideSectionViewHolderFactory(baseComponent: BaseComponent): BaseViewHolderFactory.Builder<ItemModel> {
            return DaggerSectionViewHolderFactory
                    .builder()
                    .baseComponent(baseComponent)
                    .layoutModule(BaseViewHolderLayoutModule(R.layout.view_section_item)) as BaseViewHolderFactory.Builder<ItemModel>
        }

        @JvmStatic
        @IntoMap
        @IntKey(ItemModel.SKILLS)
        @FragmentViewScope
        @Provides
        fun provideSkillsViewHolderFactory(baseComponent: BaseComponent): BaseViewHolderFactory.Builder<ItemModel> {
            return DaggerSkillsViewHolderFactory
                    .builder()
                    .baseComponent(baseComponent)
                    .layoutModule(BaseViewHolderLayoutModule(R.layout.view_skills_item)) as BaseViewHolderFactory.Builder<ItemModel>
        }

        @JvmStatic
        @IntoMap
        @IntKey(ItemModel.RECOMMENDATION)
        @FragmentViewScope
        @Provides
        fun provideRecommendationViewHolderFactory(baseComponent: BaseComponent): BaseViewHolderFactory.Builder<ItemModel> {
            return DaggerRecommendationViewHolderFactory
                    .builder()
                    .baseComponent(baseComponent)
                    .layoutModule(BaseViewHolderLayoutModule(R.layout.view_recommendation_item)) as BaseViewHolderFactory.Builder<ItemModel>
        }
    }


}