package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme
import pa.tello.rafael.smud2024.presentation.ui.theme.lightPink

@Composable
fun SingleSlideWithPicture(
    slideContent: SlideContent,
) {
    val backgroundColor = lightPink
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(color = backgroundColor)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = slideContent.image ?: R.drawable.smud_logo_liten),
            contentDescription = slideContent.imageDescription,
            modifier = Modifier
                .size(360.dp)
                .clip(shape = CircleShape)
                .border(3.dp, lightPink, CircleShape)
        )
    }
}

@Preview
@Composable
fun PreviewSingleSlideWithPicture() {
    Smud2024Theme {
        SingleSlideWithPicture(
            slideContent = SlideContent(
                title = "How do you learn?",
                description = "By doing, by reading, by watching, by listening, by teaching, by talking, by writing, by drawing, by playing, by experimenting, by failing, by succeeding, by reflecting, by sharing, by discussing, by collaborating..., by being you.",
                image = R.drawable.smud_logo_liten,
                imageDescription = "Picture of the author of this presentation",
                pageNr = 1
            )
        )
    }
}