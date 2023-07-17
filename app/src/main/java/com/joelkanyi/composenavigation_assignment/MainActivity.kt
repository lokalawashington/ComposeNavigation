package com.joelkanyi.composenavigation_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joelkanyi.composenavigation_assignment.ui.theme.ComposeNavigationAssignmentTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationAssignmentTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "homeScreen" ){
                    composable(route = "homeScreen") {
                        DetailsScreen(navController = navController)
                    }

                }


                Box (
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Column {
                        Text(text = "Go to Home Screen")
                        Button(onClick = {
                            navController.navigate("ratingScreen")
                        }) {
                        }
                    }

                }

            }
        }
    }
}