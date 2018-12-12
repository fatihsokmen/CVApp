package com.github.fatihsokmen.cvapp.dependency

import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class,
        NetModule::class]
)
@Singleton
interface AppComponent : BaseComponent {

    @Component.Builder
    interface Builder : BaseComponent.Builder<AppComponent, Builder>
}
