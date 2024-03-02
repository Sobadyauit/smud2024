package pa.tello.rafael.smud2024.data.content

import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.data.SlideContentPager

internal fun getTitleContent() = SlideContent(
    title = "Jeg vil bli gitarist",
    subtitle = "Men det handler ikke om musikk",
    description = "",
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

internal fun getMentiContent() = SlideContent(
    title = "Menti",
    subtitle = "Mentimeter.com",
    description = "Bruk koden 123456",
    imageDescription = "Menti logo",
    pageNr = 1
)

internal fun getExcusesContent() = SlideContentPager(
    title = "",
    description = "",
    imageDescription = "",
    images = mutableListOf(
        R.drawable.e1_no_time,
        R.drawable.digital_minimalism,
        R.drawable.e2_ok_now,
        R.drawable.e3_no_error,
        R.drawable.e4_too_old,
        R.drawable.langrend
    ),
    pageNr = 1
)

internal fun getIHaveLearnedContent() = SlideContent(
    title = "",
    subtitle = "",
    description = "Jeg har lært noe nytt... Hva så?",
    imageDescription = "",
    pageNr = 1
)

internal fun getSuggestionContent() = SlideContentPager(
    title = "",
    description = "",
    imageDescription = "",
    images = mutableListOf(
        R.drawable.s1_participate,
        R.drawable.s2_new_tasks,
        R.drawable.s3_cooperate,
        R.drawable.s4_refresh,
        R.drawable.strikkepinner_alene,
        R.drawable.strikkepinner_bruk
    ),
    pageNr = 1
)

internal fun getFinishContent() = SlideContentPager(
    title = "",
    subtitle = "",
    description = "",
    images = mutableListOf(
        R.drawable.f1_finish,
        R.drawable.f2_finish,
    ),
    imageDescription = "",
    pageNr = 1
)
