package com.example.banking.ui.screens

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOut
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.banking.ui.components.AppButton
import com.example.banking.ui.components.AppTopBar
import com.example.banking.ui.components.CreditCard
import com.example.banking.ui.components.SectionButton
import com.example.banking.ui.components.Transactions
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun HomeScreen() {

    var status by remember {
        mutableStateOf(false)
    }
    val x= rememberCoroutineScope()
        Column(modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())) {
            AppTopBar()

            x.launch {
                delay(100L)
                status=true
            }
            AnimatedVisibility(visible = status, enter = slideInHorizontally(), exit = slideOutHorizontally()) {
                CreditCard()
            }

            SectionButton()
            Transactions()

        }
}

