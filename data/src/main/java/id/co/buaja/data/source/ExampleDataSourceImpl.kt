package id.co.buaja.data.source

import javax.inject.Inject

class ExampleDataSourceImpl @Inject constructor(): ExampleDataSource {
    override fun getList(): List<String> {
        return listOf(
            "saya", "kamu"
        )
    }
}