package com.bkarakoca.ui_repo_listing.scene.repolist

import com.bkarakoca.domain.uimodel.GithubRepoUIModel
import com.bkarakoca.core.base.BaseBindingAdapter
import com.bkarakoca.ui_repo_listing.R
import javax.inject.Inject

class AdapterRepoList @Inject constructor() : BaseBindingAdapter<GithubRepoUIModel>() {
    override fun getItemLayoutId(): Int = R.layout.item_github_repository
}