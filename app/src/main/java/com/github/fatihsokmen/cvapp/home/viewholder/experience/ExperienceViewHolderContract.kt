package com.github.fatihsokmen.cvapp.home.viewholder.experience

import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel

interface ExperienceViewHolderContract {

    interface View {
        fun setJobTitle(jobTitle: String)

        fun setCompany(company: String)

        fun setDates(dates: String)

        fun setCompanyLogoUrl(url: String)
    }

    interface Presenter {
        fun setView(view: ExperienceViewHolderContract.View)

        fun bindData(data: ExperienceModel)
    }
}