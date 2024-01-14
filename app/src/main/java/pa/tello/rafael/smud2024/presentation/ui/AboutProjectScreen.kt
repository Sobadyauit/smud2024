package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
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
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink
import pa.tello.rafael.smud2024.presentation.ui.theme.lightBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.typography

@Composable
fun AboutSlide(
    slideContent: SlideContent
) {
    val backgroundColor = lightBlue
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
                    style = typography.headlineMedium,
                    color = darkPink
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
        Row(
            Modifier
                .padding(16.dp),
        ) {
            Column {
                Text(
                    text = slideContent.description ?: "",
                    style = typography.bodyMedium
                )
                Text(
                    text = slideContent.pageNr.toString(),
                    style = MaterialTheme.typography.bodySmall
                )
            }

        }


    }
}

@Preview
@Composable
fun PreviewAboutSlide() {
    Smud2024Theme {
        AboutSlide(
            slideContent = SlideContent(
                title = "About this project",
                description = "A lot about this project and i should write even more",
                image = R.drawable.smud_logo_liten,
                imageDescription = "Smud logo",
                pageNr = 1
            )
        )
    }
}