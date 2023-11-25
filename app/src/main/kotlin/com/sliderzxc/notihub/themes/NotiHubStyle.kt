package com.sliderzxc.notihub.themes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

object NotiHubStyle {
    val colors: NotiHubColors
        @Composable
        get() = LocalNotiHubColors.current
}

val LocalNotiHubColors = staticCompositionLocalOf<NotiHubColors> {
    error("No colors provided")
}