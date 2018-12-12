package com.github.fatihsokmen.cvapp.home

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import butterknife.BindView
import butterknife.ButterKnife
import com.github.fatihsokmen.cvapp.App
import com.github.fatihsokmen.cvapp.R
import com.github.fatihsokmen.cvapp.dependency.BaseComponent
import com.github.fatihsokmen.cvapp.home.adapter.ProfileAdapter
import com.github.fatihsokmen.cvapp.home.data.model.ItemModel
import com.github.fatihsokmen.cvapp.home.data.model.ProfileModel
import com.github.fatihsokmen.cvapp.home.data.model.SectionModel
import com.github.fatihsokmen.cvapp.home.data.model.SkillsModel
import javax.inject.Inject

class HomeFragment : Fragment(), HomeFragmentContract.View {

    @BindView(R.id.profile)
    lateinit var profile: RecyclerView
    @BindView(R.id.progress)
    lateinit var progress: ProgressBar

    @Inject
    lateinit var adapter: ProfileAdapter
    @Inject
    lateinit var presenter: HomeFragmentContract.Presenter

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        ButterKnife.bind(this, view)

        inject(getBaseComponent(), this).inject(this)

        profile.adapter = adapter

        presenter.init()

        return view
    }

    override fun bindData(data: List<ItemModel>) {
        adapter.bindData(data)
    }

    override fun showProgress(show: Boolean) {
        progress.visibility = if (show) View.VISIBLE else View.GONE
    }

    override fun showMessage(message: String) {
        view?.let { view ->
            Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
        }
    }

    override fun showError(message: String) {
        view?.let { view ->
            val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
            snackBar.view.background = ContextCompat.getDrawable(view.context, R.color.colorAccent)
            snackBar.show()
        }
    }

    override fun onDestroyView() {
        presenter.clearSubscriptions()
        super.onDestroyView()
    }

    private fun getBaseComponent(): BaseComponent {
        return (activity?.application as App).baseComponent
    }

    companion object Injector {
        fun inject(
                baseComponent: BaseComponent,
                view: HomeFragmentContract.View
        ): HomeFragmentComponent {
            return DaggerHomeFragmentComponent
                    .builder()
                    .baseComponent(baseComponent)
                    .homeFragmentModule(HomeFragmentModule(view))
                    .build()

        }

    }
}