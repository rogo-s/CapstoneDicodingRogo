package com.rogo.dicodingcapstone.di

import com.rogo.core.domain.usecase.MovieUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FavoriteModule {
    fun movieUseCase(): MovieUseCase
}