package id.co.buaja.presentations

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import id.co.buaja.domain.model.Example
import id.co.buaja.domain.usecase.ExampleUseCase
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(
    private val exampleUseCase: ExampleUseCase,
): ViewModel() {

    fun getList(): List<Example> {
        return exampleUseCase.getList()
    }
}