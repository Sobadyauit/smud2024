package pa.tello.rafael.smud2024

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pa.tello.rafael.smud2024.presentation.ui.PresentationScreen
import pa.tello.rafael.smud2024.presentation.ui.theme.Smud2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                Color.TRANSPARENT, Color.TRANSPARENT
            )
        )
        setContent {
            Smud2024Theme {
                PresentationScreen()
            }
        }
    }
}

