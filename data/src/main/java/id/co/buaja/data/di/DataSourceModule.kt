package id.co.buaja.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.co.buaja.data.source.ExampleDataSource
import id.co.buaja.data.source.ExampleDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract fun bindsExampleDataSource(
        exampleDataSourceImpl: ExampleDataSourceImpl
    ): ExampleDataSource
}