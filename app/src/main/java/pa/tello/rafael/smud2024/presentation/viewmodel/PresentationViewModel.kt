package pa.tello.rafael.smud2024.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PresentationViewModel: ViewModel() {
    var navigateToNextScreen by mutableStateOf(false)

    private set

    fun onButtonClicked() {
        navigateToNextScreen = true
    }

    fun onNavigationComplete() {
        navigateToNextScreen = false
    }


}