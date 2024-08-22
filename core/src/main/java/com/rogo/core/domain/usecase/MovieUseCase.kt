package com.rogo.core.domain.usecase

import com.bumptech.glide.load.engine.Resource
import com.rogo.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getNowMoviePlaying(): Flow<com.rogo.core.data.source.Resource<List<Movie>>>
    fun getMoviePopular(): Flow<com.rogo.core.data.source.Resource<List<Movie>>>
    fun getMovieTopRated(): Flow<com.rogo.core.data.source.Resource<List<Movie>>>
    suspend fun insert(movie: Movie)
    fun getAllFavorite(): Flow<List<Movie>>
    suspend fun delete(movie: Movie)
    fun getFavoriteState(id: Int): Flow<Boolean>
}