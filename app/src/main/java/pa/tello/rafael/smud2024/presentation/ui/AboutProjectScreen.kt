package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme
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