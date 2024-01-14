package pa.tello.rafael.smud2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pa.tello.rafael.smud2024.presentation.ui.PresentationScreen
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smud2024Theme {
                PresentationScreen()
            }
        }
    }
}

