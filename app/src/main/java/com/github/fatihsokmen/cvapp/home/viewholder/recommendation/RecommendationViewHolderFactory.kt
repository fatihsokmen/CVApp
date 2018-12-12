package com.github.fatihsokmen.cvapp.home.viewholder.recommendation


import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.RecommendationModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import dagger.Component

@Component(dependencies = [BaseComponent::class], modules = [RecommendationViewHolderModule::class])
@ViewHolderScope
interface RecommendationViewHolderFactory : BaseViewHolderFactory<RecommendationModel> {

    @Component.Builder
    interface Builder : BaseViewHolderFactory.Builder<RecommendationModel>
}