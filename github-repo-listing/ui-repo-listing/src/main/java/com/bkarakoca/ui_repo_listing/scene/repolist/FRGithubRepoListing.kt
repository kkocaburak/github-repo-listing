package com.bkarakoca.ui_repo_listing.scene.repolist

import androidx.fragment.app.viewModels
import com.bkarakoca.core.base.BaseFragment
import com.bkarakoca.core.extension.observe
import com.bkarakoca.ui_repo_listing.R
import com.bkarakoca.ui_repo_listing.databinding.FragmentGithubRepoListingBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FRGithubRepoListing : BaseFragment<FRGithubRepoListingVM, FragmentGithubRepoListingBinding>() {

    override val layoutId: Int get() = R.layout.fragment_github_repo_listing

    override val viewModel: FRGithubRepoListingVM by viewModels()

    @Inject
    lateinit var adapterRepoList: AdapterRepoList

    override fun initialize() {
        binder.repoListingRecyclerview.adapter = adapterRepoList
    }

    override fun setListeners() {
        binder.repoListingButtonSubmit.setOnClickListener {
            viewModel.fetchRepoList(binder.repoListingEditTextUsername.text.toString())
        }
    }

    override fun setReceivers() {
        observe(viewModel.githubRepoListUIModel) {
            adapterRepoList.submitList(it.repositoryList)
        }
    }
}