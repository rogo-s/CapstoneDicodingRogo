package com.rogo.favorite.ui.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.rogo.core.domain.usecase.MovieUseCase
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class FavoriteViewModel @Inject constructor(movieUseCase: MovieUseCase): ViewModel() {
    val getFavorite = movieUseCase.getAllFavorite().asLiveData(Dispatchers.IO)
}