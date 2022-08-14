package com.bkarakoca.data.mapper

import com.bkarakoca.data.model.GithubRepoResponseModel
import com.bkarakoca.domain.uimodel.GithubRepoListUIModel
import com.bkarakoca.domain.uimodel.GithubRepoUIModel
import javax.inject.Inject

class GithubRepoMapper @Inject constructor() {
    fun map(responseModel: GithubRepoResponseModel): GithubRepoListUIModel {
        return GithubRepoListUIModel(
            repositoryList = responseModel.items?.let { repoList ->
                repoList.map {
                    GithubRepoUIModel(
                        username = it.owner?.name,
                        repositoryName = it.name,
                        repositoryCount = "Repository size = ${it.size}",
                        hasWiki = it.has_wiki
                    )
                }
            } ?: listOf()

        )
    }
}