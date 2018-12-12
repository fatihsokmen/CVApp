package com.github.fatihsokmen.cvapp.home.viewholder.summary


import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import dagger.Component

@Component(dependencies = [BaseComponent::class], modules = [SummaryViewHolderModule::class])
@ViewHolderScope
interface SummaryViewHolderFactory : BaseViewHolderFactory<SummaryModel> {

    @Component.Builder
    interface Builder : BaseViewHolderFactory.Builder<SummaryModel>
}