package com.github.fatihsokmen.cvapp.home

import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.scope.FragmentViewScope
import dagger.Component

@Component(
        dependencies = [BaseComponent::class],
        modules = [HomeFragmentModule::class]
)
@FragmentViewScope
interface HomeFragmentComponent {

    fun inject(fragment: HomeFragment)
}