package pa.tello.rafael.smud2024.data.content

import androidx.compose.ui.graphics.Color
import pa.tello.rafael.smud2024.data.SlideState
import pa.tello.rafael.smud2024.data.TopBarType
import pa.tello.rafael.smud2024.presentation.ui.theme.darkBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink
import pa.tello.rafael.smud2024.presentation.ui.theme.lightBeige
import pa.tello.rafael.smud2024.presentation.ui.theme.lightBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.lightPink
import pa.tello.rafael.smud2024.presentation.ui.theme.typography


fun getTitleState(): SlideState = SlideState(
    backgroundColor = lightBlue,
    titleColor = darkBlue,
    subtitleColor = darkPink,
    descriptionColor = Color.White
)

fun getLearningNewState(): SlideState = SlideState(
    backgroundColor = lightPink,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White,
    topBarType = TopBarType.LARGE_WITH_ICON
)

fun getStartLineState(): SlideState = SlideState(
    backgroundColor = lightBeige,
    titleColor = darkBlue,
    subtitleColor = darkBlue,
    descriptionColor = Color.Black,
    topBarType = TopBarType.SMALL_NO_ICON
)

fun getNoFreeLunchState(): SlideState = SlideState(
    backgroundColor = lightBlue,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White
)

fun getMentiState(): SlideState = SlideState(
    backgroundColor = lightBlue,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White
)

fun getExcusesState(): SlideState = SlideState(
    backgroundColor = lightBeige,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White,
    topBarType = TopBarType.SMALL_NO_ICON
)

fun getIHaveLearnedState(): SlideState = SlideState(
    backgroundColor = lightBlue,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White
)

fun getSuggestionState(): SlideState = SlideState(
    backgroundColor = lightBlue,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White,
    topBarType = TopBarType.SMALL_NO_ICON
)

fun getFinishState(): SlideState = SlideState(
    backgroundColor = darkPink,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White,
    topBarType = TopBarType.SMALL_NO_ICON
)



