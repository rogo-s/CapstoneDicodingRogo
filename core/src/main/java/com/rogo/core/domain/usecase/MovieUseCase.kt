package com.rogo.core.domain.usecase

import com.rogo.core.data.source.Resource
import com.rogo.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getNowMoviePlaying(): Flow<Resource<List<Movie>>>
    fun getMoviePopular(): Flow<Resource<List<Movie>>>
    fun getMovieTopRated(): Flow<Resource<List<Movie>>>
    suspend fun insert(movie: Movie)
    fun getAllFavorite(): Flow<List<Movie>>
    suspend fun delete(movie: Movie)
    fun getFavoriteState(id: Int): Flow<Boolean>
}