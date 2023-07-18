package com.joelkanyi.composenavigation_assignment

sealed class Screen(val route : String){
    object HomeScreen : Screen("homescreen")
    object DetailsScreen : Screen("detailsscreen")
    object RatingScreen : Screen("ratingscreen")
}
