package com.example.banking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.banking.ui.components.MainAppBottomBar
import com.example.banking.ui.navigation.BottomNavGraph
import com.example.banking.ui.theme.BankingTheme
import com.example.banking.ui.theme.darkGray

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {
            BankingTheme {

                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),

                    bottomBar = { MainAppBottomBar(navController) },
                    containerColor = darkGray
                ) { innerPadding ->

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        BottomNavGraph(navHostController = navController)

                    }


                }
            }
        }
    }
}
