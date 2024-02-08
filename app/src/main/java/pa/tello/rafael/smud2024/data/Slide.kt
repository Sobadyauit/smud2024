package pa.tello.rafael.smud2024.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import pa.tello.rafael.smud2024.presentation.ui.theme.darkBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.typography

data class SlideContent(
    val title: String,
    val subtitle: String? = null,
    val topBarImage: Int? = null,
    val description: String? = null,
    val image: Int? = null,
    val imageDescription: String,
    val pageNr: Int
)

data class SlideState(
    val backgroundColor: Color,
    val titleColor: Color = darkBlue,
    val titleFormat: TextStyle = typography.headlineLarge,
    val titleFormatCollapsed: TextStyle = typography.headlineMedium,
    val subtitleColor: Color = darkBlue,
    val descriptionColor: Color = darkBlue
)

data class Slide (
    val state: SlideState,
    val content: SlideContent,
    val slide: @Composable (() -> Unit)
)