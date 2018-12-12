package com.github.fatihsokmen.cvapp.home.viewholder.skills

import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.SkillsModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderLayoutModule
import dagger.Binds
import dagger.Module

@Module(includes = [BaseViewHolderLayoutModule::class])
abstract class SkillsViewHolderModule {

    @Binds
    @ViewHolderScope
    abstract fun bindViewHolder(impl: SkillsViewHolder): BaseViewHolder<SkillsModel>
}