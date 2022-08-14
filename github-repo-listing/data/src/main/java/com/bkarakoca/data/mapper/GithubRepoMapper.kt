package com.bkarakoca.data.mapper

import com.bkarakoca.core.util.ResourceProvider
import com.bkarakoca.data.R
import com.bkarakoca.data.model.GithubRepoResponseModel
import com.bkarakoca.domain.uimodel.GithubRepoListUIModel
import com.bkarakoca.domain.uimodel.GithubRepoUIModel
import javax.inject.Inject

class GithubRepoMapper @Inject constructor(
    private val resProvider: ResourceProvider
) {
    fun map(responseModel: GithubRepoResponseModel): GithubRepoListUIModel {
        return GithubRepoListUIModel(
            repositoryList = responseModel.items?.let { repoList ->
                repoList.map {
                    GithubRepoUIModel(
                        username = resProvider.getString(
                            R.string.owner_name,
                            it.owner?.login ?: ""
                        ),
                        repositoryName = it.name,
                        repositoryCount = resProvider.getString(
                            R.string.repository_size,
                            it.size ?: 0
                        ),
                        hasWiki = it.has_wiki
                    )
                }
            } ?: listOf()

        )
    }
}