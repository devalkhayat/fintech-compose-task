package com.example.banking.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banking.R
import com.example.banking.ui.theme.fonts
import com.example.banking.ui.theme.gray2
import com.example.banking.ui.theme.gray3

@Composable
fun SectionButton(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp), horizontalArrangement = Arrangement.SpaceEvenly,) {
        BigButton(stringResource(id = R.string.transfer),R.drawable.ic_transfer)
        BigButton(stringResource(id = R.string.payments),R.drawable.ic_payment)
        BigButton(stringResource(id = R.string.add_card),R.drawable.ic_add_card)
        BigButton(stringResource(id = R.string.more),R.drawable.ic_more)
    }
}

@Composable
fun BigButton(title:String,icon:Int) {

    Box(modifier = Modifier.padding(5.dp)) {
        Box(
            modifier = Modifier
                .width(76.dp)
                .height(76.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.White)
                .clickable {

                }
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = "transfer",
                    tint = gray3,
                    modifier = Modifier.size(33.dp,33.dp)
                )
                Spacer(modifier = Modifier.height(3.dp))
                Title(text = title)
            }

        }
    }
}

@Composable
fun Title(text:String){
    AppLabel12(caption = text,color= gray2,modifier = Modifier.padding(4.dp))
}

@Preview(showSystemUi = true, backgroundColor = 0XFFE5EBF2)
@Composable
fun Prev()=SectionButton()
