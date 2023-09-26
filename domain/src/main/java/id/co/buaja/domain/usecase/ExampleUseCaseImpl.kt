package id.co.buaja.domain.usecase

import id.co.buaja.domain.model.Example
import id.co.buaja.domain.repository.ExampleRepository
import javax.inject.Inject

class ExampleUseCaseImpl @Inject constructor(
    private val exampleRepository: ExampleRepository
): ExampleUseCase {
    override fun getList(): List<Example> {
        return exampleRepository.getList()
    }
}