package com.rogo.favorite.di

import android.content.Context
import com.rogo.favorite.ui.favorite.FavoriteFragment
import com.rogo.dicodingcapstone.di.FavoriteModule
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [FavoriteModule::class])
interface FavoriteComponent {
    fun inject(activity: FavoriteFragment)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(favoriteModule: FavoriteModule): Builder
        fun build(): FavoriteComponent
    }
}