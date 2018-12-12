package com.github.fatihsokmen.cvapp.dependency


import android.app.Application
import android.content.Context

import com.github.fatihsokmen.cvapp.dependency.scheduler.Scheduler
import com.github.fatihsokmen.cvapp.dependency.resource.StringResources

import dagger.BindsInstance
import retrofit2.Retrofit

interface BaseComponent {

    fun applicationContext(): Context

    fun scheduler(): Scheduler

    fun retrofit(): Retrofit

    fun stringResources(): StringResources

    interface Builder<C : BaseComponent, B : Builder<C, B>> {

        @BindsInstance
        fun application(application: Application): B

        fun build(): C
    }
}
