package com.bkarakoca.domain.uimodel

import com.bkarakoca.core.base.ListAdapterItem

data class GithubRepoListUIModel(
    val repositoryList: List<GithubRepoUIModel>
)

data class GithubRepoUIModel(
    val username: String?,
    val repositoryName: String?,
    val repositoryCount: String?,
    val hasWiki: Boolean? = false
) : ListAdapterItem