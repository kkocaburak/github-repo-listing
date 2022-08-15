package com.bkarakoca.githubrepolisting.internal.injection.module

import com.bkarakoca.data.api.GithubService
import com.bkarakoca.data.mapper.GithubRepoMapper
import com.bkarakoca.data.repository.GithubRepositoryImpl
import com.bkarakoca.domain.repository.GithubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GithubModule {

    @Provides
    @Singleton
    fun provideGithubService(retrofit: Retrofit): GithubService =
        retrofit.create(GithubService::class.java)

    @Provides
    @Singleton
    fun provideGithubRepository(
        githubService: GithubService,
        mapper: GithubRepoMapper
    ): GithubRepository = GithubRepositoryImpl(githubService, mapper)
}