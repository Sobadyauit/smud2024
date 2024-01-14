package pa.tello.rafael.smud2024.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import pa.tello.rafael.smud2024.presentation.ui.theme.darkPink

class PresentationViewModel: ViewModel() {
    val statusBarColor = mutableStateOf(darkPink)
}