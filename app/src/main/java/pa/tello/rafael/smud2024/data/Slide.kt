package pa.tello.rafael.smud2024.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import pa.tello.rafael.smud2024.presentation.ui.theme.darkBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.typography

open class SlideContent(
    val title: String,
    val subtitle: String? = null,
    val topBarImage: Int? = null,
    val description: String? = null,
    val image: Int? = null,
    val imageDescription: String,
    val pageNr: Int
)

class SlideContentPager (
    title: String,
    subtitle: String? = null,
    topBarImage: Int? = null,
    description: String? = null,
    image: Int? = null,
    imageDescription: String,
    images: MutableList<Int>,
    pageNr: Int

): SlideContent(
    title = title,
    subtitle = subtitle,
    topBarImage = topBarImage,
    description = description,
    image = image,
    imageDescription = imageDescription,
    pageNr = pageNr
) {
    val images = images
}


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