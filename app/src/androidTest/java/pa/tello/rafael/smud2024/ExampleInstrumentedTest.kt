package pa.tello.rafael.smud2024

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeLeft
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import pa.tello.rafael.smud2024.data.content.getLearningNewContent
import pa.tello.rafael.smud2024.data.content.getTitleContent
import pa.tello.rafael.smud2024.data.content.getTitleState
import pa.tello.rafael.smud2024.presentation.ui.TitleScreen

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun exampleTestEspressoAndCompose() {
        ActivityScenario.launch(MainActivity::class.java)
        composeTestRule.onNode(hasText(getTitleContent().title))
            .assertExists()
        composeTestRule.onNode(hasText(getTitleContent().subtitle!!))
            .assertExists()
            .performTouchInput { swipeLeft() }
        composeTestRule.onNode(hasText(getLearningNewContent().title))
            .assertExists()
    }

    @Test
    fun exampleTestOnlyCompose() {
        composeTestRule.setContent {
            TitleScreen(
                slideContent = getTitleContent(),
                slideState = getTitleState()
            )
        }
        composeTestRule.onNode(hasText(getTitleContent().description!!))
            .assertExists()
    }
}