package com.example.contacts_app_with_kotlin.di

import com.example.contacts_app_with_kotlin.data.datasource.KisilerDataSource
import com.example.contacts_app_with_kotlin.data.repo.KisilerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideKisilerDataSource(): KisilerDataSource{
        return KisilerDataSource()
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds:KisilerDataSource): KisilerRepository{
        return KisilerRepository(kds)
    }

}