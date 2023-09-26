package id.co.buaja.domain.repository

import id.co.buaja.domain.model.Example

interface ExampleRepository {
    fun getList(): List<Example>
}