package com.bkarakoca.data.api

import com.bkarakoca.data.model.GithubRepoResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    @GET("/search/repositories")
    suspend fun fetchGithubRepositoryList(
        @Query("q") username: String
    ): GithubRepoResponseModel

}