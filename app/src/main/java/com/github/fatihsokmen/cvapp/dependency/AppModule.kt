package com.github.fatihsokmen.cvapp.dependency


import android.app.Application
import android.content.Context
import com.github.fatihsokmen.cvapp.dependency.scheduler.Scheduler
import com.github.fatihsokmen.cvapp.dependency.resource.StringResources
import com.github.fatihsokmen.cvapp.dependency.resource.StringResourcesImpl
import com.github.fatihsokmen.cvapp.dependency.scheduler.SchedulerImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindApplication(impl: Application): Context

    @Binds
    @Singleton
    abstract fun bindScheduler(impl: SchedulerImpl): Scheduler

    @Binds
    @Singleton
    abstract fun bindStringResources(impl: StringResourcesImpl): StringResources


}
