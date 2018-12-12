package com.github.fatihsokmen.cvapp.home.viewholder.section


import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.SectionModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import dagger.Component

@Component(dependencies = [BaseComponent::class], modules = [SectionViewHolderModule::class])
@ViewHolderScope
interface SectionViewHolderFactory : BaseViewHolderFactory<SectionModel> {

    @Component.Builder
    interface Builder : BaseViewHolderFactory.Builder<SectionModel>
}