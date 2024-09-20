package com.example.banking.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.banking.R

sealed class BottomBarScreen(val route:String,val title:String,val icon:Int) {
    object Home: BottomBarScreen(route = "home", title = "Home", icon =  R.drawable.ic_home )
    object Wallet: BottomBarScreen(route = "wallet", title = "Wallet", icon =  R.drawable.ic_wallet )
    object Report: BottomBarScreen(route = "report", title = "Report", icon =  R.drawable.ic_report )
    object Profile: BottomBarScreen(route = "profile", title = "Profile", icon =  R.drawable.ic_profile )
}