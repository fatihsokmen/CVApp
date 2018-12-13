package com.github.fatihsokmen.cvapp

import com.github.fatihsokmen.cvapp.dependency.scheduler.Scheduler
import io.reactivex.schedulers.Schedulers


class TestScheduler : Scheduler {

    override fun io(): io.reactivex.Scheduler {
        return Schedulers.trampoline()
    }

    override fun main(): io.reactivex.Scheduler {
        return Schedulers.trampoline()
    }
}


