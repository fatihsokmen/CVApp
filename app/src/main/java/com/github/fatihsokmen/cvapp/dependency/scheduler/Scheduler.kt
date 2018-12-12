package com.github.fatihsokmen.cvapp.dependency.scheduler

interface Scheduler {

    fun io(): io.reactivex.Scheduler

    fun main(): io.reactivex.Scheduler
}