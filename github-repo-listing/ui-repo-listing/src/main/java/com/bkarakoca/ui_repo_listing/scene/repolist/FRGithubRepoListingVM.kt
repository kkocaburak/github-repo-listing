package com.bkarakoca.ui_repo_listing.scene.repolist

import androidx.lifecycle.MutableLiveData
import com.bkarakoca.domain.github.FetchGithubRepoListUseCase
import com.bkarakoca.domain.uimodel.GithubRepoListUIModel
import com.bkarakoca.core.base.BaseViewModel
import com.bkarakoca.core.extension.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

@HiltViewModel
class FRGithubRepoListingVM @Inject constructor(
    private val fetchGithubRepoListUseCase: FetchGithubRepoListUseCase
) : BaseViewModel() {

    val githubRepoListUIModel = MutableLiveData<GithubRepoListUIModel>()

    fun fetchRepoList(username: String) = launch {
        fetchGithubRepoListUseCase(
            FetchGithubRepoListUseCase.Params(username)
        ).onStart {
            // you can show loading here
        }.onCompletion {
            // you can hide loading here
        }.collect {
            githubRepoListUIModel.value = it
        }
    }

}