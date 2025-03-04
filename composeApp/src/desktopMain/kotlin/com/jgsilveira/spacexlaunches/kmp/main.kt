package com.jgsilveira.spacexlaunches.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SpaceX Launches",
    ) {
        App()
    }
}