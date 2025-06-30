package com.example.droidchat.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

const val SPLASH_ROUTE = "splash"
const val SIGN_IN_ROUTE = "singIn"
const val SIGN_Up_ROUTE = "signUp"

@Composable
fun ChatNavHost(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SPLASH_ROUTE) {
        composable(SPLASH_ROUTE){

        }
        composable(SIGN_IN_ROUTE){

        }
        composable(SIGN_Up_ROUTE){

        }
    }
}