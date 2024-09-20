package com.example.banking.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banking.R
import com.example.banking.ui.theme.fonts
import com.example.banking.ui.theme.gray4

@Composable
fun AppCurrenciesDropDown(){

    val list= listOf("$ USD","LE","SAR","€ Euro")
    val isExpandend = remember {
        mutableStateOf(false)
    }
    val currentValue = remember {
        mutableStateOf(list[0])
    }

    Row(modifier = Modifier.clickable { isExpandend.value = !isExpandend.value }, verticalAlignment = Alignment.CenterVertically) {
        Text(text = currentValue.value,fontSize = 14.sp, fontFamily = fonts, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.width(8.dp))
        Icon(painter = painterResource(id = R.drawable.ic_arrow_down), contentDescription = "drop", tint = gray4 )
        Spacer(modifier = Modifier.width(8.dp))
        DropdownMenu(
            expanded = isExpandend.value,
            onDismissRequest = { isExpandend.value = false }) {
            list.forEach {
                DropdownMenuItem(onClick = {
                    currentValue.value = it
                    isExpandend.value = false
                }) {
                    Text(text = it,fontSize = 14.sp, fontFamily = fonts, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}