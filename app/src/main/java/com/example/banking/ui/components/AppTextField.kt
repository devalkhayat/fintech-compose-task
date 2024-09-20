package com.example.banking.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.example.banking.R
import com.example.banking.ui.theme.gray2
import kotlin.math.max

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTextField(hint:String, maxLines:Int=1, modifier: Modifier=Modifier, hintColor: Color= gray2, textColor: Color=Color.Black, data:String, action:(String)->Unit){

    val colors = TextFieldDefaults.textFieldColors(
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        containerColor = Color.Transparent,
    )


    TextField(
        modifier =modifier,
        value = data,
        label = null,
        colors = colors,
        textStyle = TextStyle(color = textColor),
        maxLines = maxLines,
        placeholder = {

            AppLabel12(caption = hint,color= hintColor)

        },
        onValueChange = {
            action(it)
        })
}