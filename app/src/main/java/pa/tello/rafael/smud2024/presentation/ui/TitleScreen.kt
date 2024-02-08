package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun TitleSlide(
    slideContent: SlideContent
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(lightBlue)
    ) {
        Row(
            Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = slideContent.image ?: R.drawable.smud_logo_liten),
                contentDescription = slideContent.imageDescription,
                modifier = Modifier
                    .size(400.dp)

            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }

        // Dette maa fjernes
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.subtitle ?: "",
                style = typography.headlineMedium,
                color = darkPink
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = slideContent.description ?: "",
                style = typography.bodySmall
            )
        }
        // Maa fjernes

    }
}

@Preview
@Composable
fun TitleSlidePreview() {
    Smud2024Theme {
        TitleSlide(slideContent = SlideContent(
            title = "SMUD 2024",
            subtitle = "The future of SMUD",
            description = "SMUD 2024 is a project that aims to create a new SMUD app for the year 2024",
            imageDescription = "Some description",
            image = R.drawable.smud_logo_man,
            pageNr = 0
        )
        )
    }
}