package pa.tello.rafael.smud2024.data.content


import androidx.compose.runtime.Composable
import pa.tello.rafael.smud2024.data.Slide
import pa.tello.rafael.smud2024.presentation.ui.AboutMeSlide
import pa.tello.rafael.smud2024.presentation.ui.AboutSlide
import pa.tello.rafael.smud2024.presentation.ui.CitationSlide
import pa.tello.rafael.smud2024.presentation.ui.TitleSlide

object PresentationContent {
    @Composable
    fun getSlides(): List<Slide> {
        return listOf(
            Slide(
                state = getTitleState(),
                content = getTitleContent(),
                slide = {
                    TitleSlide(
                        slideContent = getTitleContent()
                    )
                }
            ),
            Slide(
                state = getCitationState(),
                content = getCitationContent(),
                slide = {
                    CitationSlide(
                        slideContent = getCitationContent()
                    )
                }
            ),
            Slide(
                state = getAboutMeState(),
                content = getAboutMeContent(),
                slide = {
                    AboutMeSlide(
                        slideContent = getAboutMeContent()
                    )
                }
            ),
            Slide(
                state = getAboutAppState(),
                content = getAboutAppContent(),
                slide = {
                    AboutSlide(
                        slideContent = getAboutAppContent()
                    )
                }
            )
        )
    }

}