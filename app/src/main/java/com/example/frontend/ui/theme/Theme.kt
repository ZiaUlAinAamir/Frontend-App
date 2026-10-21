package com.example.frontend.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val CyberBlack = Color(0xFF0B0F19)
val CyberDarkSurface = Color(0xFF131C2E)
val CyberCardBg = Color(0xFF1A2642)
val CyberCardBorder = Color(0xFF2A3B66)

val NeonCyan = Color(0xFF00F2FE)
val ElectricViolet = Color(0xFF4FACFE)
val MatrixGreen = Color(0xFF00FF9D)
val NeonOrange = Color(0xFFFF9F43)
val NeonPink = Color(0xFFFF3366)

val TextPrimary = Color(0xFFF1F5F9)
val TextSecondary = Color(0xFF94A3B8)

private val CyberDarkColorScheme = darkColorScheme(
    primary = NeonCyan,
    onPrimary = CyberBlack,
    primaryContainer = Color(0xFF004D5A),
    onPrimaryContainer = NeonCyan,
    secondary = ElectricViolet,
    onSecondary = CyberBlack,
    secondaryContainer = Color(0xFF1B3A60),
    onSecondaryContainer = ElectricViolet,
    tertiary = MatrixGreen,
    background = CyberBlack,
    onBackground = TextPrimary,
    surface = CyberDarkSurface,
    onSurface = TextPrimary,
    surfaceVariant = CyberCardBg,
    onSurfaceVariant = TextSecondary,
    outline = CyberCardBorder
)

val CyberTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 30.sp,
        letterSpacing = 2.5.sp,
        color = TextPrimary
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        letterSpacing = 1.5.sp,
        color = TextPrimary
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 1.2.sp,
        color = NeonCyan
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = 0.5.sp,
        color = TextPrimary
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        letterSpacing = 0.5.sp,
        color = TextSecondary
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.SemiBold,
        fontSize = 13.sp,
        letterSpacing = 2.sp,
        color = MatrixGreen
    )
)

@Composable
fun CyberAcademyTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = CyberDarkColorScheme,
        typography = CyberTypography,
        content = content
    )
}
