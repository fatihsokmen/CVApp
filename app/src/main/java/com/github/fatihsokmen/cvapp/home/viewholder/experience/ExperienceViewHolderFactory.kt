package com.github.fatihsokmen.cvapp.home.viewholder.experience


import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import dagger.Component

@Component(dependencies = [BaseComponent::class], modules = [ExperienceViewHolderModule::class])
@ViewHolderScope
interface ExperienceViewHolderFactory : BaseViewHolderFactory<ExperienceModel> {

    @Component.Builder
    interface Builder : BaseViewHolderFactory.Builder<ExperienceModel>
}