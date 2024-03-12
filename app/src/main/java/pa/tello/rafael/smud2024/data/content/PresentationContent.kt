package pa.tello.rafael.smud2024.data.content


import androidx.compose.runtime.Composable
import pa.tello.rafael.smud2024.data.Slide
import pa.tello.rafael.smud2024.presentation.ui.SingleSlideNoPicture
import pa.tello.rafael.smud2024.presentation.ui.SingleSlideWithPicture
import pa.tello.rafael.smud2024.presentation.ui.TitleSlide
import pa.tello.rafael.smud2024.presentation.ui.VerticalPagerScreen

object PresentationContent {
    @Composable
    fun getSlides(): List<Slide> {
        return listOf(
            Slide(
                state = getTitleState(),
                content = getTitleContent(),
                slide = {
                    TitleSlide(
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
            ),
            Slide(
                state = getNoFreeLunchState(),
                content = getNoFreeLunchContent(),
                slide = {
                    SingleSlideNoPicture(
                        slideContent = getNoFreeLunchContent()
                    )
                }
            ),
            Slide(
                state = getExcusesState(),
                content = getExcusesContent(),
                slide = {
                    VerticalPagerScreen(
                        slideContent = getExcusesContent(),
                        slideState = getExcusesState()
                    )
                }
            ),
            Slide(
                state = getIHaveLearnedState(),
                content = getIHaveLearnedContent(),
                slide = {
                    SingleSlideNoPicture(
                        slideContent = getIHaveLearnedContent()
                    )
                }
            ),
            Slide(
                state = getSuggestionState(),
                content = getSuggestionContent(),
                slide = {
                    VerticalPagerScreen(
                        slideContent = getSuggestionContent(),
                        slideState = getSuggestionState()
                    )
                }
            ),
            Slide(
                state = getFinishState(),
                content = getFinishContent(),
                slide = {
                    VerticalPagerScreen(
                        slideContent = getFinishContent(),
                        slideState = getFinishState()
                    )
                }
            )
        )
    }

}