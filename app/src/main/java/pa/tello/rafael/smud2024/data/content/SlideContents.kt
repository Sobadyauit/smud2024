package pa.tello.rafael.smud2024.data.content

import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.data.SlideContentPager

internal fun getTitleContent() = SlideContent(
    title = "Smud 2024",
    subtitle = "The future of Smud",
    description = "Smud Tech 2024 is a project that aims to create a new SMUD app for the year 2024",
    image = R.drawable.smud_logo_man,
    imageDescription = "man raising a hand with the SMUD logo",
    pageNr = 0
)

internal fun getLearningNewContent() = SlideContent(
    title = "Hvordan å lære nye ting?",
    description = "Vi lærer ved å gjøre",
    topBarImage = R.drawable.smud_logo_liten,
    imageDescription = "Woman with armed crossed and a laptop",
    image = R.drawable.laere_nye_ting,
    pageNr = 1
)

internal fun getStartLineContent() = SlideContentPager(
    title = "Ved startstreken",
    description = "Hvordan starter vi?",
    image = R.drawable.renovation,
    images = mutableListOf(
        R.drawable.star_rocket,
        R.drawable.boring_dispair,
    ),
    imageDescription = "Picture of a start line",
    pageNr = 1
)

internal fun getNoFreeLunchContent() = SlideContent(
    title = "",
    subtitle = "Bortsett fra her i Smud \uD83E\uDD29 \n",
    description = "Ingen gratis lunsj",
    imageDescription = "",
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
