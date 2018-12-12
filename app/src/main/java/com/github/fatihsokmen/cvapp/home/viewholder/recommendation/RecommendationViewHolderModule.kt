package com.github.fatihsokmen.cvapp.home.viewholder.recommendation

import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.RecommendationModel
import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderLayoutModule
import dagger.Binds
import dagger.Module

@Module(includes = [BaseViewHolderLayoutModule::class])
abstract class RecommendationViewHolderModule {

    @Binds
    @ViewHolderScope
    abstract fun bindViewHolder(impl: RecommendationViewHolder): BaseViewHolder<RecommendationModel>

    @Binds
    @ViewHolderScope
    abstract fun provideViewHolderPresenter(impl: RecommendationViewHolderPresenter): RecommendationViewHolderContract.Presenter
}