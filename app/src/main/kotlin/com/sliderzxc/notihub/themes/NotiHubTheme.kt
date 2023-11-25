package com.sliderzxc.notihub.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun NotiHubTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when (darkTheme) {
        true -> baseDarkPalette
        false -> baseLightPalette
    }
    CompositionLocalProvider(
        LocalNotiHubColors provides colors,
        content = content
    )
}