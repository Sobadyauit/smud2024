package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.R
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme
import pa.tello.rafael.smud2024.presentation.ui.theme.lightBlue
import pa.tello.rafael.smud2024.presentation.ui.theme.lightPink
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
    val backgroundColor = lightBlue
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(backgroundColor)
    ) {
        Row(
            Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = slideContent.image ?: R.drawable.smud_logo_liten),
                contentDescription = slideContent.imageDescription,
                colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) }),
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(2.dp, lightPink, CircleShape)
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