package com.github.fatihsokmen.cvapp.home.viewholder.section

import com.github.fatihsokmen.cvapp.dependency.scope.ViewHolderScope
import com.github.fatihsokmen.cvapp.home.data.model.SectionModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolderLayoutModule
import dagger.Binds
import dagger.Module

@Module(includes = [BaseViewHolderLayoutModule::class])
abstract class SectionViewHolderModule {

    @Binds
    @ViewHolderScope
    abstract fun bindViewHolder(impl: SectionViewHolder): BaseViewHolder<SectionModel>
}