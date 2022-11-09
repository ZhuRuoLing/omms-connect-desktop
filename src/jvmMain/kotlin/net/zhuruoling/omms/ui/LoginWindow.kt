package net.zhuruoling.omms.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.window.ApplicationScope
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("LoginWindow")

@Composable
@Preview
fun loginWindow(scope: ApplicationScope) {
    var count = 0
    var text by remember { mutableStateOf("wdnmd") }

    MaterialTheme {
        Row {
            Button(onClick = {
                count++
                logger.info("wdnmd: $count")
                text = "$count"
            }) {
                Text(text)
            }
            Button(onClick = {
                scope.exitApplication()
                logger.info("Bye.")
            }) {
                Text("Bye")
            }
        }

    }
}

fun loginWindowMain() = application {
    Window(
        onCloseRequest = {
            exitApplication()
        }, title = "OMMS Connect Desktop"
    ) {
        loginWindow(this@application)
    }
}
