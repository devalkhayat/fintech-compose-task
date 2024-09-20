package com.example.banking.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banking.R
import com.example.banking.ui.theme.blue
import com.example.banking.ui.theme.drakBlue
import com.example.banking.ui.theme.fonts

@Composable
fun CreditCard(background:Color= blue, modifier: Modifier=Modifier, amountBackground:Color= drakBlue, amountFontSize: TextUnit=22.sp, cardNumberFontSize: TextUnit=30.sp) {

    Box(modifier = Modifier

        .padding(8.dp)) {
        Box(
            modifier = modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .fillMaxWidth()
                .height(230.dp)
                .background(background)

        ) {

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(22.dp)) {
                Amount(amountBackground,amountFontSize)
                Spacer(modifier = Modifier.height(30.dp))
                CardNumberSection(amountFontSize)
                Spacer(modifier = Modifier.height(40.dp))
                CardHolderSection()


            }

        }
    }
}

@Composable
fun Amount(background: Color,fontSize:TextUnit){
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

        AppLabel(caption = stringResource(id = R.string.amount_number), color = Color.White,fontSize=fontSize,modifier = Modifier.weight(3f))

        Box(modifier = Modifier
            .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
            .width(50.dp)
            .height(30.dp)
            .background(color = background))


    }
}

@Composable
fun CardNumberSection(fz: TextUnit){

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {

        CardNumberLabel(fontSize=fz)
        CardNumberLabel(fontSize=fz)
        CardNumberLabel(fontSize=fz)
        CardNumberLabel("3344",fontSize=fz)
    }
}
@Composable
fun CardNumberLabel(code:String="****",fontSize:TextUnit){
    AppLabel(caption = code, color = Color.White,fontSize=fontSize,modifier = Modifier.padding(4.dp))

}



@Composable
fun CardHolderSection(){

    Column() {
        AppLabel12(caption = stringResource(id = R.string.name), color = Color.White)
        Row( modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
            CardHolderLabel()
            ExpireDateLabel()
        }
    }

}
@Composable
fun CardHolderLabel(){
    AppLabel14(caption = stringResource(id = R.string.my_name), color = Color.White)
}
@Composable
fun ExpireDateLabel(){
    AppLabel12(caption = "12/16", color = Color.White)
}


@Preview(showSystemUi = true)
@Composable
fun Pre()= CreditCard()
