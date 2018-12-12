package com.github.fatihsokmen.cvapp.home.viewholder.summary

import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderLayoutModule
import dagger.Binds
import dagger.Module

@Module(includes = [BaseViewHolderLayoutModule::class])
abstract class SummaryViewHolderModule {

    @Binds
    @ViewHolderScope
    abstract fun bindViewHolder(impl: SummaryViewHolder): BaseViewHolder<SummaryModel>

    @Binds
    @ViewHolderScope
    abstract fun provideViewHolderPresenter(impl: SummaryViewHolderPresenter): SummaryViewHolderContract.Presenter
}