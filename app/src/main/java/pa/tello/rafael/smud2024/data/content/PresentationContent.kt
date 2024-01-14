package pa.tello.rafael.smud2024.data.content


import androidx.compose.runtime.Composable
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.Slide
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.AboutMeSlide
import pa.tello.rafael.smud2024.presentation.ui.AboutSlide
import pa.tello.rafael.smud2024.presentation.ui.CitationSlide
import pa.tello.rafael.smud2024.presentation.ui.TitleSlide

object PresentationContent {
    @Composable
    fun getSlides(): List<Slide> {
        return listOf(
            Slide(
                slide = {
                    TitleSlide(
                        slideContent = SlideContent(
                            title = "SMUD 2024",
                            subtitle = "The future of SMUD",
                            description = "SMUD 2024 is a project that aims to create a new SMUD app for the year 2024",
                            image = R.drawable.smud_logo_man,
                            imageDescription = "man raising a hand with the SMUD logo",
                            pageNr = 0
                        )
                    )
                }
            ),
            Slide(
                slide = {
                    CitationSlide(
                        slideContent = SlideContent(
                            title = "Hvordan lærer vi?",
                            description = "Vi lærer ved å gjøre",
                            image = R.drawable.smud_logo_liten,
                            imageDescription = "smud logo",
                            pageNr = 1
                        )
                    )
                }
            ),
            Slide(
                slide = {
                    AboutMeSlide(
                        slideContent = SlideContent(
                            title = "Om meg",
                            description = "RAT",
                            image = R.drawable.rat_smud,
                            imageDescription = "Picture of the author of this presentation",
                            pageNr = 1
                        )
                    )
                }
            ),
            Slide(
                slide = {
                    AboutSlide(
                        slideContent = SlideContent(
                            title = "Om meg",
                            description = "RAT",
                            image = R.drawable.smud_logo_liten,
                            imageDescription = "Picture of the author of this presentation",
                            pageNr = 1
                        )
                    )
                }
            )
        )
    }

}