package com.github.fatihsokmen.cvapp.home.viewholder.skills


import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.SkillsModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderFactory
import dagger.Component

@Component(dependencies = [BaseComponent::class], modules = [SkillsViewHolderModule::class])
@ViewHolderScope
interface SkillsViewHolderFactory : BaseViewHolderFactory<SkillsModel> {

    @Component.Builder
    interface Builder : BaseViewHolderFactory.Builder<SkillsModel>
}