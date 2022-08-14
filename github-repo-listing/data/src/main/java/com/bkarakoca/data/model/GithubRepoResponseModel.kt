package com.bkarakoca.data.model

data class GithubRepoResponseModel(
    val items: List<RepoItems>? = null
)

data class RepoItems(
    val name: String? = null,
    val owner: OwnerModel? = null,
    val size: Int? = null,
    val has_wiki: Boolean? = null
)

data class OwnerModel(
    val name: String? = null
)