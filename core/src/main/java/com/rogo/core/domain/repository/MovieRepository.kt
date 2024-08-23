package com.rogo.core.domain.repository

import com.rogo.core.data.source.NetworkBoundResource
import com.rogo.core.data.source.Resource
import com.rogo.core.data.source.local.LocalDataSource
import com.rogo.core.data.source.remote.RemoteDataSource
import com.rogo.core.data.source.remote.network.ApiResponse
import com.rogo.core.data.source.remote.response.MovieResponse
import com.rogo.core.domain.model.Movie
import com.rogo.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

interface MovieRepository {
    fun getMovieNowPlaying(): Flow<Resource<List<Movie>>>
    fun getMoviePopular(): Flow<Resource<List<Movie>>>
    fun getMovieTopRated(): Flow<Resource<List<Movie>>>
    suspend fun insertMovieToDB(movie: Movie)
    fun getAllFavoriteMovieFromDB(): Flow<List<Movie>>
    suspend fun deleteMovieFromDB(movie: Movie)
    fun getFavoriteStateMovieFromDB(id: Int): Flow<Boolean>
}

