package com.bkarakoca.data.repository

import com.bkarakoca.data.api.GithubService
import com.bkarakoca.data.mapper.GithubRepoMapper
import com.bkarakoca.domain.repository.GithubRepository
import com.bkarakoca.domain.uimodel.GithubRepoListUIModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val githubService: GithubService,
    private val mapper: GithubRepoMapper
) : GithubRepository {

    override suspend fun fetchGithubRepositoryList(username: String): Flow<GithubRepoListUIModel> =
        flow {
            emit(mapper.map(githubService.fetchGithubRepositoryList(username)))
        }

}