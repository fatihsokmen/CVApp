package com.github.fatihsokmen.cvapp.home.viewholder.section

import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.home.data.model.SectionModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import javax.inject.Inject

class SectionViewHolder @Inject constructor(
        itemView: View
) : BaseViewHolder<SectionModel>(itemView) {

    @BindView(R.id.title)
    lateinit var title: TextView

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun bindData(data: SectionModel) {
        title.text = data.title
    }
}