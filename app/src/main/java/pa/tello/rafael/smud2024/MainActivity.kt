package pa.tello.rafael.smud2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pa.tello.rafael.smud2024.presentation.ui.PresentationScreen
import pa.tello.rafael.smud2024.presentation.ui.Smud2024Theme
import pa.tello.rafael.smud2024.presentation.viewmodel.PresentationViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationScreen()
        }
    }
}

