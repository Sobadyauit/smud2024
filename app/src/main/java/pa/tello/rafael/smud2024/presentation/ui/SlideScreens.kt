package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import pa.tello.rafael.smud2024.data.SlideContent

@Composable
fun TitleSlide(
    slideContent: SlideContent,
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(lightBlue)
    ) {
        Text(
            text = slideContent.title,
            style = MaterialTheme.typography.headlineLarge,
            color = darkBlue
        )
        Spacer(modifier = Modifier.height(4.dp))
        Image(
            painter = painterResource(id = slideContent.image),
            contentDescription = slideContent.imageDescription,
            modifier = Modifier
                .fillMaxSize(0.8F)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = slideContent.subtitle ?: "",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = slideContent.description ?: "",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}




@Composable
fun ContentSlide(
    slideContent: SlideContent,
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
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
        Image(
            painter = painterResource(id = slideContent.image),
            contentDescription = slideContent.imageDescription,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = slideContent.pageNr.toString(),
            style = MaterialTheme.typography.bodySmall
        )

    }
}

@Composable
fun AboutSlide(
    slideContent: SlideContent,
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
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
        Image(
            painter = painterResource(id = slideContent.image),
            contentDescription = slideContent.imageDescription,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = slideContent.pageNr.toString(),
            style = MaterialTheme.typography.bodySmall
        )

    }
}