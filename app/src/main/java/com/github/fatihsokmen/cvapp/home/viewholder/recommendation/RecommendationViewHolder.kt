package com.github.fatihsokmen.cvapp.home.viewholder.recommendation

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.Glide
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.home.data.model.RecommendationModel
import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import javax.inject.Inject

class RecommendationViewHolder @Inject constructor(
        private val presenter: RecommendationViewHolderContract.Presenter,
        itemView: View
) : BaseViewHolder<RecommendationModel>(itemView), RecommendationViewHolderContract.View {

    @BindView(R.id.statement)
    lateinit var statementView: TextView
    @BindView(R.id.who)
    lateinit var whoView: TextView
    @BindView(R.id.whoCompany)
    lateinit var whoCompanyView: TextView
    @BindView(R.id.whoProfilePhoto)
    lateinit var profilePhotoView: ImageView

    init {
        presenter.setView(this)
        ButterKnife.bind(this, itemView)
    }

    override fun bindData(data: RecommendationModel) {
        presenter.bindData(data)
    }

    override fun setStatement(statement: String) {
        statementView.text = statement
    }

    override fun setWho(who: String) {
        whoView.text = who
    }

    override fun setWhoCompany(company: String) {
        whoCompanyView.text = company
    }

    override fun setWhoProfilePhotoUrl(url: String) {
        Glide.with(profilePhotoView).load(url).into(profilePhotoView)
    }
}