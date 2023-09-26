package id.co.buaja.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import id.co.buaja.domain.usecase.ExampleUseCase
import id.co.buaja.domain.usecase.ExampleUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {
    @Binds
    abstract fun bindsExampleUseCase(
        exampleUseCaseImpl: ExampleUseCaseImpl
    ): ExampleUseCase
}