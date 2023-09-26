package id.co.buaja.presentations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import id.co.buaja.presentations.theme.HiltExampleTheme

@AndroidEntryPoint
class ExampleActivity : ComponentActivity() {
    private val exampleViewModel: ExampleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiltExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExampleScreen(viewModel = exampleViewModel)
                }
            }
        }
    }
}

@Composable
fun ExampleScreen(
    viewModel: ExampleViewModel
) {
    LazyColumn(
        content = {
            items(viewModel.getList()) {
                Text(text = it.name)
            }
        }
    )
}