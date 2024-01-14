package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme
import pa.tello.rafael.smud2024.presentation.ui.theme.darkBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink
import pa.tello.rafael.smud2024.presentation.ui.theme.lightPink
import pa.tello.rafael.smud2024.presentation.ui.theme.typography

@Composable
fun CitationSlide(
    slideContent: SlideContent,
) {
    val backgroundColor = lightPink
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(color = backgroundColor)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.Start)
            ) {
                Text(
                    text = slideContent.title,
                    style = typography.headlineLarge,
                    color = darkBlue
                )
            }

            Image(
                painter = painterResource(id = slideContent.image),
                contentDescription = slideContent.imageDescription,
                modifier = Modifier
                    .size(100.dp)
                    .weight(0.5f)
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
                .background(color = darkPink, RoundedCornerShape(8.dp))
        ) {
            Text(
                text = slideContent.description ?: "",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(20.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = slideContent.pageNr.toString(),
            style = MaterialTheme.typography.bodySmall
        )

    }
}

@Preview
@Composable
fun PreviewCitationSlide() {
    Smud2024Theme {
        CitationSlide(
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