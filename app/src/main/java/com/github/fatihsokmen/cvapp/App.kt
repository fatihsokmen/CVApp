package com.github.fatihsokmen.cvapp

import android.app.Application
import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.dependency.DaggerAppComponent

class App : Application() {

    lateinit var baseComponent: BaseComponent

    override fun onCreate() {
        super.onCreate()

        baseComponent = DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}
