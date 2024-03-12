package pa.tello.rafael.smud2024.data.content


import androidx.compose.runtime.Composable
import pa.tello.rafael.smud2024.data.Slide
import pa.tello.rafael.smud2024.presentation.ui.SingleSlideWithPicture
import pa.tello.rafael.smud2024.presentation.ui.TitleScreen
import pa.tello.rafael.smud2024.presentation.ui.VerticalPagerScreen

object PresentationContent {
    @Composable
    fun getSlides(): List<Slide> {
        return listOf(
            Slide(
                state = getTitleState(),
                content = getTitleContent(),
                slide = {
                    TitleScreen(
                        slideContent = getTitleContent(),
                        slideState = getTitleState()
                    )
                }
            ),
            Slide(
                state = getLearningNewState(),
                content = getLearningNewContent(),
                slide = {
                    SingleSlideWithPicture(
                        slideContent = getLearningNewContent()
                    )
                }
            ),
            Slide(
                state = getStartLineState(),
                content = getStartLineContent(),
                slide = {
                    VerticalPagerScreen(
                        slideContent = getStartLineContent(),
                        slideState = getStartLineState()
                    )
                }
            )
        )
    }

}