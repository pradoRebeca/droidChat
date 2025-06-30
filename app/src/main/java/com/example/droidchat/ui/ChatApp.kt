package com.example.droidchat.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ChatApp(){
    Scaffold(
        bottomBar = {
            //vazio
        }
    ){ paddingValues ->
      Box(
          modifier = Modifier
              .padding(paddingValues)
              .fillMaxSize()
      ) {

      }
    }
}