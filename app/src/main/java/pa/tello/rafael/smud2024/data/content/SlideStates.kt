package pa.tello.rafael.smud2024.data.content

import androidx.compose.ui.graphics.Color
import pa.tello.rafael.smud2024.data.SlideState
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
    descriptionColor = Color.White
)

fun getStartLineState(): SlideState = SlideState(
    backgroundColor = lightBeige,
    titleColor = darkBlue,
    subtitleColor = darkBlue,
    descriptionColor = Color.Black
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
    descriptionColor = Color.White
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
    descriptionColor = Color.White
)

fun getFinishState(): SlideState = SlideState(
    backgroundColor = darkPink,
    titleColor = darkBlue,
    titleFormat = typography.headlineMedium,
    subtitleColor = darkPink,
    descriptionColor = Color.White
)



