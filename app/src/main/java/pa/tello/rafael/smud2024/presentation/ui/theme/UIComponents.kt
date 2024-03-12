package pa.tello.rafael.smud2024.presentation.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.data.SlideState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    state: SlideState,
    content: SlideContent
    ) {
    LargeTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = state.backgroundColor,
            titleContentColor = state.titleColor
        ),
        title = {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp, bottom = 0.dp, start = 0.dp, end = 0.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier
                    .wrapContentWidth(Alignment.Start)) {
                    Text(
                        text = content.title,
                        style = if (isCollapsed.value) state.titleFormatCollapsed  else state.titleFormat
                    )
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarWithIcon(
    state: SlideState,
    content: SlideContent,
) {
    LargeTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = state.backgroundColor,
            titleContentColor = state.titleColor
        ),
        title = {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp, bottom = 0.dp, start = 0.dp, end = 0.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier
                    .wrapContentWidth(Alignment.Start)
                    .weight(0.8f)
                ) {
                    Text(
                        text = content.title,
                        style = if (isCollapsed.value) state.titleFormatCollapsed  else state.titleFormat
                    )
                }
                Image(
                    painter = painterResource(id = content.topBarImage!!),
                    contentDescription = content.imageDescription,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(start = 0.dp, top = 0.dp, end = 16.dp, bottom = 0.dp)
                )
            }
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallerTopBar(
    state: SlideState,
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = state.backgroundColor,
        ),
        title = {}
    )
}