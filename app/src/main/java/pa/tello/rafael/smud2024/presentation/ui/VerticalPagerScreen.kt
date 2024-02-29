package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import pa.tello.rafael.smud2024.data.SlideContentPager
import pa.tello.rafael.smud2024.data.SlideState
import kotlin.math.absoluteValue


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPagerScreen(
    slideContent: SlideContentPager,
    slideState: SlideState
) {
    val backgroundColor = slideState.backgroundColor
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(color = backgroundColor)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        val pagerState = rememberPagerState(pageCount = {
            slideContent.images.size
        })
        VerticalPager(
            state = pagerState,
            Modifier.background(color = backgroundColor)
        ) { page ->
            Card(
                Modifier
                    .size(400.dp)
                    .graphicsLayer {
                        // Calculate the absolute offset for the current page from the
                        // scroll position. We use the absolute value which allows us to mirror
                        // any effects for both directions
                        val pageOffset = (
                                (pagerState.currentPage - page) + pagerState
                                    .currentPageOffsetFraction
                                ).absoluteValue

                        // We animate the alpha, between 50% and 100%
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
                    .background(color = backgroundColor)
            ) {
                Image(
                    painter = painterResource(id = slideContent.images[page]),
                    contentDescription = "Pager",
                    modifier = Modifier
                        .size(360.dp)
                        //.padding(all = 16.dp)
                        .background(color = backgroundColor)
                )
            }
        }
    }
}

