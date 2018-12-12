package com.github.fatihsokmen.cvapp.home.viewholder.experience

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.Glide
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.home.data.model.ExperienceModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import javax.inject.Inject

class ExperienceViewHolder @Inject constructor(
        private val presenter: ExperienceViewHolderContract.Presenter,
        itemView: View
) : BaseViewHolder<ExperienceModel>(itemView), ExperienceViewHolderContract.View {

    @BindView(R.id.job_title)
    lateinit var jobTitleView: TextView
    @BindView(R.id.company)
    lateinit var companyView: TextView
    @BindView(R.id.dates)
    lateinit var datesView: TextView
    @BindView(R.id.companyLogo)
    lateinit var companyLogoView: ImageView


    init {
        presenter.setView(this)
        ButterKnife.bind(this, itemView)
    }

    override fun bindData(data: ExperienceModel) {
        presenter.bindData(data)
    }


    override fun setJobTitle(jobTitle: String) {
        jobTitleView.text = jobTitle
    }

    override fun setCompany(company: String) {
        companyView.text = company
    }

    override fun setDates(dates: String) {
        datesView.text = dates
    }

    override fun setCompanyLogoUrl(url: String) {
        Glide.with(companyLogoView).load(url).into(companyLogoView)
    }
}