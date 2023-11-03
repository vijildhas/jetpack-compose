package com.learning.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learning.compose.ui.theme.ComposeTheme

//private var nameList: ArrayList<String> = arrayListOf("John", "Michale", "Andrew", "Danna")

class DynamicContent : ComponentActivity() {


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel = MainViewModel()) {
    val newNameStateContent = viewModel.textFieldState.observeAsState("")


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingMessage(newNameStateContent.value) { newName ->
            viewModel.onTextChanged(newName)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreetingMessage(
    textFieldValue: String,
    textFieldUpdate: (newName: String) -> Unit
) {
    TextField(value = textFieldValue, onValueChange = textFieldUpdate)

    Button(onClick = {}) {
        Text(text = textFieldValue)
    }
}

@Composable
fun GreetingName(name: String) {
    Text(
        text = "Hello $name",
        style = MaterialTheme.typography.headlineSmall
    )
}


@ExperimentalMaterial3Api
@Composable
fun DynamicData() {

}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun DynamicContentPreview() {
    ComposeTheme {
        MainScreen()
    }
}



