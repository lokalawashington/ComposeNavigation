package com.joelkanyi.composenavigation_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

                NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
                    composable(route = Screen.HomeScreen.route) {
                        HomeScreen(navController = navController)
                    }
                    composable(route = Screen.DetailsScreen.route) {
                        DetailsScreen(navController = navController)
                    }
                    composable(route = Screen.RatingScreen.route) {
                        RatingScreen(navController = navController)
                    }


                }
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        Button(
            onClick = {
                navController.navigate(Screen.DetailsScreen.route)
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Go to Details Screen")

        }
    }
}

@Composable
fun DetailsScreen(navController: NavController) {
    TopAppBar(
        title = { Text(text = "Details", style = TextStyle(color = Color.White, fontSize = 32.sp)) },
        actions = {
            IconButton(onClick = { /* Define your action here */ }) {
                Icon(Icons.Filled.Search, contentDescription = null)
            }
        }
    )
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp)
    ) {
        Button(onClick = {
            navController.navigate(Screen.RatingScreen.route)
        }) {
            Text(text = "Rate Us")
        }
    }
}


@Composable
fun RatingScreen(navController: NavController) {
    TopAppBar(
        title = { Text(text = "Ratings", style = TextStyle(color = Color.White, fontSize = 32.sp)) },
        actions = {
            IconButton(onClick = {

            }) {
                Icon(Icons.Filled.Search, contentDescription = null)
            }
        }
    )
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp)
    ) {
        Text(text = "Rate")
    }
}