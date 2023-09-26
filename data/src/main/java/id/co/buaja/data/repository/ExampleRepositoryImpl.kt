package id.co.buaja.data.repository

import id.co.buaja.data.source.ExampleDataSource
import id.co.buaja.domain.model.Example
import id.co.buaja.domain.repository.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val exampleDataSource: ExampleDataSource
): ExampleRepository {
    override fun getList(): List<Example> {
        return exampleDataSource.getList()
            .map {
                Example(
                    name = it
                )
            }
    }
}