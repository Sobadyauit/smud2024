package pa.tello.rafael.smud2024.data

import androidx.compose.runtime.Composable

data class SlideContent(
    val title: String,
    val subtitle: String? = null,
    val description: String? = null,
    val image: Int,
    val imageDescription: String,
    val pageNr: Int
)

data class Slide (
    val slide: @Composable (() -> Unit)
)