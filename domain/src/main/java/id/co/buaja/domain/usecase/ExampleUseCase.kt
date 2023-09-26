package id.co.buaja.domain.usecase

import id.co.buaja.domain.model.Example

interface ExampleUseCase {
    fun getList(): List<Example>
}