package id.co.buaja.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.co.buaja.data.repository.ExampleRepositoryImpl
import id.co.buaja.domain.repository.ExampleRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun providesRepository(
        exampleRepositoryImpl: ExampleRepositoryImpl
    ): ExampleRepository
}