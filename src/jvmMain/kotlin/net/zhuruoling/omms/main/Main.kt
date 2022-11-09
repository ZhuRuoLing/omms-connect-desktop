import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val logger = LoggerFactory.getLogger("Main")


@Composable
@Preview
fun App() {
    var count = 0
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            count++
            text = "$count"
        }) {
            Text(text)
        }
    }
}


fun main() = application {
    Window(onCloseRequest = {
        exitApplication()
    }, title = "OMMS Connect Desktop"
    ) {
        App()
    }
}
