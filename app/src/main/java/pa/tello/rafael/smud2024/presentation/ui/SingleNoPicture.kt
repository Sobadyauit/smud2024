package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme
import pa.tello.rafael.smud2024.presentation.ui.theme.darkBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink
import pa.tello.rafael.smud2024.presentation.ui.theme.lightBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.typography

@Composable
fun SingleSlideNoPicture(
    slideContent: SlideContent,
) {
    val backgroundColor = lightBlue
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(color = backgroundColor)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
                .background(color = Color.White, RoundedCornerShape(24.dp))
        ) {
            Column(
                modifier = Modifier.padding(32.dp)
            ) {
                Text(
                    text = slideContent.description ?: "",
                    style = typography.labelLarge,
                    color = darkBlue,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = slideContent.subtitle ?: "",
                    style = typography.bodyMedium,
                    color = darkPink,
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth()
                )
            }

        }

    }
}

@Preview
@Composable
fun PreviewSingleSlideNoPicture() {
    Smud2024Theme {
        SingleSlideNoPicture(
            slideContent = SlideContent(
                title = "How do you learn?",
                subtitle = "Learning is a process",
                description = "By doing, by writing, by drawing, by reflecting, by sharing, by discussing, by collaborating..., by being you.",
                image = R.drawable.smud_logo_liten,
                imageDescription = "Picture of the author of this presentation",
                pageNr = 1
            )
        )
    }
}