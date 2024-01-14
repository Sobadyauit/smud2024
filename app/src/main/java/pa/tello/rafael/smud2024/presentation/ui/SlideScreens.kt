package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink
import pa.tello.rafael.smud2024.presentation.ui.theme.typography


@Composable
fun ContentSlide(
    slideContent: SlideContent
) {
    val backgroundColor = Color.White
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = backgroundColor)
    ) {
        Text(
            text = slideContent.title,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = slideContent.description ?: "",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = slideContent.pageNr.toString(),
            style = MaterialTheme.typography.bodySmall
        )

    }
}

@Composable
fun AboutMeSlide(
    slideContent: SlideContent
) {
    val backgroundColor = Color.White
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(backgroundColor)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = slideContent.title,
                style = typography.headlineLarge,
                color = darkPink
            )

        }
        Row(
            Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = slideContent.image),
                contentDescription = slideContent.imageDescription,
                modifier = Modifier.size(400.dp)
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
fun PreviewAboutMeSlide() {
    Smud2024Theme {
        AboutMeSlide(
            slideContent = SlideContent(
                title = "About Me",
                description = "RAT",
                image = R.drawable.rat_smud,
                imageDescription = "Picture of the author of this presentation",
                pageNr = 1
            )
        )
    }
}