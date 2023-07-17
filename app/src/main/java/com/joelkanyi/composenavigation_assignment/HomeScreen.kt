package com.joelkanyi.composenavigation_assignment

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun  HomeScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "detailsScreen" ){
        composable(route = "detailsScreen") {
            DetailsScreen(navController = navController)
        }

    }

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column {
            Text(text = "Go to Details Screen")
            Button(onClick = {
                navController.navigate("ratingScreen")
            }) {
            }
        }

    }

}