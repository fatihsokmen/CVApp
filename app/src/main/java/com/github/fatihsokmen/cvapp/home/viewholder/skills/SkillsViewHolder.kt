package com.github.fatihsokmen.cvapp.home.viewholder.skills

import android.support.v4.content.ContextCompat
import android.support.v7.widget.AppCompatTextView
import android.view.View
import butterknife.BindView
import butterknife.ButterKnife
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.home.data.model.SkillsModel
import com.github.fatihsokmen.cvapp.home.viewholder.BaseViewHolder
import javax.inject.Inject
import android.text.SpannableStringBuilder


class SkillsViewHolder @Inject constructor(
        itemView: View
) : BaseViewHolder<SkillsModel>(itemView) {

//    private val backgroundColor: Int by lazy {
//        ContextCompat.getColor(itemView.context, R.color.chipBackground)
//    }

    @BindView(R.id.skills)
    lateinit var skills: AppCompatTextView

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun bindData(data: SkillsModel) {
        val builder = SpannableStringBuilder()
        data.skills.forEach { skill ->
//            val start = builder.length
            builder.append("\u2022 ").append(skill).append(" ")
//            val skillSpan = BackgroundColorSpan(backgroundColor)
//            builder.setSpan(skillSpan, start, builder.length - 1 , Spanned.SPAN_INCLUSIVE_INCLUSIVE)
            builder.append(" ")
        }
        skills.text = builder
    }
}