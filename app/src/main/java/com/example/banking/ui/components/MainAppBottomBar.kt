package com.example.banking.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.banking.ui.navigation.BottomBarScreen
import com.example.banking.ui.theme.blue
import com.example.banking.ui.theme.gray4

@Composable
fun MainAppBottomBar(navController: NavHostController) {

    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Wallet,
        BottomBarScreen.Report,
        BottomBarScreen.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(backgroundColor = Color.White) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }

    /*NavigationBar (containerColor = Color.White, modifier = Modifier.height(65.dp)) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }*/

}

@Composable
fun RowScope.AddItem(screen: BottomBarScreen, currentDestination:NavDestination?, navController: NavHostController){

    val isSelected=currentDestination?.hierarchy?.any { it.route==screen.route }==true

    BottomNavigationItem(
        //label = { Text(text = screen.title)},
        icon = { Icon(painter = painterResource(id = screen.icon), contentDescription = screen.title, tint = if(isSelected) blue else gray4)},
        onClick = {
            navController.navigate(screen.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop=true
            }

        },
        selected = isSelected,
        selectedContentColor = blue,
        unselectedContentColor = gray4,
        alwaysShowLabel = false)


    /*NavigationBarItem(
        //label = { Text(text = screen.title)},
        icon = { Icon(painter = painterResource(id = screen.icon), contentDescription = screen.title)},
        onClick = {navController.navigate(screen.route)},
        selected = isSelected,
        colors = NavigationBarItemDefaults.colors(selectedIconColor = Color.White, unselectedIconColor = gray4, indicatorColor = blue),
        alwaysShowLabel = false)*/


}