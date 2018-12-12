package com.github.fatihsokmen.cvapp.home.viewholder.experience

import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderLayoutModule
import dagger.Binds
import dagger.Module

@Module(includes = [BaseViewHolderLayoutModule::class])
abstract class ExperienceViewHolderModule {

    @Binds
    @ViewHolderScope
    abstract fun bindViewHolder(impl: ExperienceViewHolder): BaseViewHolder<ExperienceModel>

    @Binds
    @ViewHolderScope
    abstract fun provideViewHolderPresenter(impl: ExperienceViewHolderPresenter): ExperienceViewHolderContract.Presenter
}