package com.github.fatihsokmen.cvapp.home.viewholder.summary

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.Glide
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.home.data.model.SummaryModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import javax.inject.Inject

class SummaryViewHolder @Inject constructor(
        private val presenter: SummaryViewHolderContract.Presenter,
        itemView: View
) : BaseViewHolder<SummaryModel>(itemView), SummaryViewHolderContract.View {

    @BindView(R.id.name)
    lateinit var nameView: TextView
    @BindView(R.id.title)
    lateinit var titleView: TextView
    @BindView(R.id.location)
    lateinit var locationView: TextView
    @BindView(R.id.description)
    lateinit var descriptionView: TextView
    @BindView(R.id.profilePhoto)
    lateinit var profilePhotoView: ImageView


    init {
        presenter.setView(this)
        ButterKnife.bind(this, itemView)
    }

    override fun bindData(data: SummaryModel) {
        presenter.bindData(data)
    }

    override fun setName(name: String) {
        nameView.text = name
    }

    override fun setTitle(title: String) {
        titleView.text = title
    }

    override fun setLocation(location: String) {
        locationView.text = location
    }

    override fun setDescription(description: String) {
        descriptionView.text = description
    }

    override fun setProfilePhotoUrl(url: String) {
        Glide.with(profilePhotoView).load(url).into(profilePhotoView)
    }
}