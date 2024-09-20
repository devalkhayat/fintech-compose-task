package com.example.banking.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.banking.R

// Set of Material typography styles to start with
val fonts= FontFamily(
    Font(R.font.sfpro_regular,weight = FontWeight.Normal),
            Font(R.font.sfpro_meduim, weight = FontWeight.Medium),
            Font(R.font.sfpro_semibold,weight = FontWeight.SemiBold),
            Font(R.font.sfpro_bold,weight = FontWeight.Bold)
)




val Typography = Typography(



    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.5.sp
    ),



)