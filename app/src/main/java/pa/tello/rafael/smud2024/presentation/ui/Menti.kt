package pa.tello.rafael.smud2024.presentation.ui

import android.annotation.SuppressLint
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebView.setWebContentsDebuggingEnabled
import android.webkit.WebViewClient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import pa.tello.rafael.smud2024.data.SlideContent
import pa.tello.rafael.smud2024.presentation.ui.theme.lightBlue


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun MentiSlide(
    slideContent: SlideContent
) {
    val backgroundColor = lightBlue
    val context = LocalContext.current
    val webView = remember {
        WebView(context).apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
            setWebContentsDebuggingEnabled(true)
        }
    }
    val url = slideContent.description
    Column(
        Modifier
            .fillMaxSize()
            .padding(2.dp)
            .background(backgroundColor)
    ) {

    AndroidView(
        factory = { webView},

        update = { view ->
            view.loadUrl(url!!)
        }
    )



    }
}



