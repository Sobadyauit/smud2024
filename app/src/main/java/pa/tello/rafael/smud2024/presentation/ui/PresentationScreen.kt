package pa.tello.rafael.smud2024.presentation.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.data.content.PresentationContent
import pa.tello.rafael.smud2024.data.content.getTitleState
import pa.tello.rafael.smud2024.presentation.ui.theme.TopBar
import pa.tello.rafael.smud2024.presentation.ui.theme.TopBarWithIcon
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink
import pa.tello.rafael.smud2024.presentation.ui.theme.lightPink

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PresentationScreen() {
    val slides = PresentationContent.getSlides()
    val pagerState = rememberPagerState(pageCount = { slides.size })
    var slideState by remember { mutableStateOf(getTitleState()) }
    Scaffold(
        topBar = {
            if (slides[pagerState.currentPage].content.topBarImage != null) {
                TopBarWithIcon(state = slideState, content = slides[pagerState.currentPage].content)
            } else {
                TopBar(state = slideState, content = slides[pagerState.currentPage].content)
            }
        },
        bottomBar = {
            BottomAppBar(
                containerColor = slideState.backgroundColor,
                modifier = Modifier.height(32.dp)
            ) {
                Row(
                    Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically)
                        .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
                ) {
                repeat(pagerState.pageCount) { iteration ->
                    val color =
                        if (pagerState.currentPage == iteration) darkPink else lightPink
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(8.dp)
                    )
                    slideState = slides[pagerState.currentPage].state
                }
            }
            }
        },
        content = { contentPadding ->
            Column(
                Modifier
                    .padding(
                        top = with(LocalDensity.current) { contentPadding.calculateTopPadding() }
                    )
            ) {


            Box{

                HorizontalPager(state = pagerState) { page ->
                    Column {
                        slides[page].let { slide ->
                            slide.slide()
                        }
                    }
                }


            }

        }
            Spacer(modifier = Modifier.height(32.dp))
        }

    )
}