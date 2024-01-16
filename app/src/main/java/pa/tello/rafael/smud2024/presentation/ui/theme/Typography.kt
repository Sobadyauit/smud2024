package pa.tello.rafael.smud2024.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import pa.tello.rafael.smud2024.R

val typography = Typography(
    headlineLarge = TextStyle(
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily(Font(R.font.sparebank1_regular))

    ),
    headlineMedium = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily(Font(R.font.sparebank1_medium))
    ),
    bodyLarge = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal
    ),
    bodyMedium = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
)


