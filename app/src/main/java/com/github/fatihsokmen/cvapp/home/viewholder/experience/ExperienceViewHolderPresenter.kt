package com.github.fatihsokmen.cvapp.home.viewholder.experience

import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import javax.inject.Inject

class ExperienceViewHolderPresenter @Inject constructor() : ExperienceViewHolderContract.Presenter {

    private lateinit var view: ExperienceViewHolderContract.View

    override fun setView(view: ExperienceViewHolderContract.View) {
        this.view = view
    }

    override fun bindData(data: ExperienceModel) {
        view.setJobTitle(data.title)
        view.setCompany(data.company)
        view.setDates(data.dates)
        view.setCompanyLogoUrl(data.companyLogoUrl)
    }
}