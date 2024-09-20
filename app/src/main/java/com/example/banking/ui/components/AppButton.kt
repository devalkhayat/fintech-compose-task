package com.example.banking.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banking.ui.theme.blue
import com.example.banking.ui.theme.fonts

@Composable
fun AppButton(title:String,action:()->Unit){
    Button(modifier = Modifier
        .fillMaxWidth()
        .height(48.dp),onClick = {
        action()
    }, shape = RoundedCornerShape(20.dp),colors = ButtonDefaults.buttonColors(containerColor = blue) ) {
        Text(text = title,fontSize = 12.sp, fontFamily = fonts, fontWeight = FontWeight.Bold, color = Color.White)
    }
}