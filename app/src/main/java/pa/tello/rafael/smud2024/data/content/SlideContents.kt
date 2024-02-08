package pa.tello.rafael.smud2024.data.content

import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent

internal fun getTitleContent() = SlideContent(
    title = "Smud 2024",
    subtitle = "The future of Smud",
    description = "Smud Tech 2024 is a project that aims to create a new SMUD app for the year 2024",
    image = R.drawable.smud_logo_man,
    imageDescription = "man raising a hand with the SMUD logo",
    pageNr = 0
)

internal fun getCitationContent() = SlideContent(
    title = "Hvordan lærer vi?",
    description = "Vi lærer ved å gjøre",
    topBarImage = R.drawable.smud_logo_liten,
    imageDescription = "smud logo",
    pageNr = 1
)

internal fun getAboutMeContent() = SlideContent(
    title = "Om meg",
    description = "RAT",
    image = R.drawable.rat_smud,
    imageDescription = "Picture of the author of this presentation",
    pageNr = 1
)

internal fun getAboutAppContent() = SlideContent(
    title = "Om Prosjektet og SMUD 2024",
    description = "Dette prosjektet finnes på github",
    topBarImage = R.drawable.smud_logo_liten,
    imageDescription = "smud logo",
    pageNr = 1
)
