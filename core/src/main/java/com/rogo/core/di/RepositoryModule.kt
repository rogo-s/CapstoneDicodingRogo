package com.rogo.core.di

import com.rogo.core.data.source.repository.MovieRepositoryImpl
import com.rogo.core.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository

}