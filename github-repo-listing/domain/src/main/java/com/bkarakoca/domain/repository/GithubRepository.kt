package com.bkarakoca.domain.repository

import com.bkarakoca.domain.uimodel.GithubRepoListUIModel
import kotlinx.coroutines.flow.Flow

interface GithubRepository {
    suspend fun fetchGithubRepositoryList(username: String): Flow<GithubRepoListUIModel>
}