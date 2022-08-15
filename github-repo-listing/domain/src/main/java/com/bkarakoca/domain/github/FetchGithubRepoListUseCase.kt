package com.bkarakoca.domain.github

import com.bkarakoca.domain.repository.GithubRepository
import javax.inject.Inject

class FetchGithubRepoListUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {

    data class Params(
        val username: String
    )

    suspend operator fun invoke(params: Params) =
        githubRepository.fetchGithubRepositoryList(params.username)

}