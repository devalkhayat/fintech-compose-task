package com.example.banking.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.banking.R

@Composable
fun Header(title:String,viewAll:Boolean){

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){

        if(viewAll){
            AppLabel16(caption = title,color= Color.Black,modifier = Modifier.weight(1f))
            AppLabel12(caption = stringResource(id = R.string.view_all),color=Color.Black)

        }else{
            AppLabel16(caption = title,color=Color.White,modifier = Modifier.weight(1f))
        }

    }


}