package com.example.appdefilmes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.appdefilmes.ui.screens.MainScreen
import com.example.appdefilmes.ui.theme.AppDeFilmesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDeFilmesTheme {
                MainScreen()
            }
        }
    }
}
