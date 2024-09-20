package com.example.banking.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.banking.R
import com.example.banking.ui.theme.darkGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(){

    CenterAlignedTopAppBar(
        title = { Text(stringResource(id = R.string.home)) },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.White, titleContentColor = Color.Black),

        navigationIcon = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_nav),
                    contentDescription = "Localized description",
                    tint = Color.Black
                )
            }
        },
        actions = {
            IconButton(onClick = { /* Do something */ }) {

                Box(modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(darkGray))
            }
        }
    )
}