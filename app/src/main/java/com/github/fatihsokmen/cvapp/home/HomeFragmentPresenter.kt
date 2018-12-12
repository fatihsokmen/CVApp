package com.github.fatihsokmen.cvapp.home

import com.github.fatihsokmen.cvapp.dependency.scheduler.Scheduler
import com.github.fatihsokmen.cvapp.home.data.ProfileApiInteractor
import io.reactivex.disposables.CompositeDisposable

import javax.inject.Inject

class HomeFragmentPresenter @Inject constructor(
        private val view: HomeFragmentContract.View,
        private val apiInteractor: ProfileApiInteractor,
        private val scheduler: Scheduler
) : HomeFragmentContract.Presenter {

    private val subscriptions = CompositeDisposable()

    override fun init() {
        view.showProgress(true)
        subscriptions.clear()
        subscriptions.add(
                apiInteractor.getProfile()
                        .subscribeOn(scheduler.io())
                        .observeOn(scheduler.main())
                        .subscribe({
                            view.showProgress(false)
                            view.bindData(it)
                        }, {
                            view.showProgress(false)
                            view.showError(it.message ?: "Unknown error")
                        })
        )
    }

    override fun clearSubscriptions() {
        subscriptions.clear()
    }
}
