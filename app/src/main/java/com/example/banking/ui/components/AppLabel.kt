package com.example.banking.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.banking.ui.theme.fonts

@Composable
fun AppLabel(caption:String="unnamed",color:Color=Color.Black,fontSize:TextUnit,lineHeight :TextUnit= 0.sp,modifier: Modifier=Modifier){
    Text(text = caption,
        color= color,
        fontSize = fontSize,
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        lineHeight = lineHeight,
        modifier = modifier)
}

@Composable
fun AppLabel8(caption:String="unnamed",color:Color=Color.Black,lineHeight :TextUnit= 0.sp,modifier: Modifier=Modifier){
    Text(text = caption,
        color= color,
        fontSize = 8.sp,
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        lineHeight = lineHeight,
        modifier = modifier)
}

@Composable
fun AppLabel12(caption:String="unnamed",color:Color=Color.Black,lineHeight :TextUnit= 0.sp,modifier: Modifier=Modifier){
    Text(text = caption,
        color= color,
        fontSize = 12.sp,
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        lineHeight = lineHeight,
        modifier = modifier)
}

@Composable
fun AppLabel14(caption:String="unnamed",color:Color=Color.Black,lineHeight :TextUnit= 0.sp,modifier: Modifier=Modifier){
    Text(text = caption,
        color= color,
        fontSize = 14.sp,
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        lineHeight = lineHeight,
        modifier = modifier)
}

@Composable
fun AppLabel16(caption:String="unnamed",color:Color=Color.Black,lineHeight :TextUnit= 0.sp,modifier: Modifier=Modifier){
    Text(text = caption,
        color= color,
        fontSize = 16.sp,
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        lineHeight = lineHeight,
        modifier = modifier)
}

@Composable
fun AppLabel18(caption:String="unnamed",color:Color=Color.Black,lineHeight :TextUnit= 0.sp,modifier: Modifier=Modifier){
    Text(text = caption,
        color= color,
        fontSize = 18.sp,
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        lineHeight = lineHeight,
        modifier = modifier)
}