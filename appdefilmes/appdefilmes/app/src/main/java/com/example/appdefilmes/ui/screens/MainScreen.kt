package com.example.appdefilmes.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appdefilmes.sample_data.discoverMovies
import com.example.appdefilmes.sample_data.lastWatched
import com.example.appdefilmes.sample_data.myList
import com.example.appdefilmes.ui.components.HeroBanner
import com.example.appdefilmes.ui.components.MovieSection
import com.example.appdefilmes.ui.theme.Background

@Composable
fun MainScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .verticalScroll(rememberScrollState())
    ) {

        HeroBanner()

        MovieSection(
            title = "Discover",
            movies = discoverMovies
        )

        MovieSection(
            title = "Last watched",
            movies = lastWatched
        )

        MovieSection(
            title = "My list",
            movies = myList
        )

        Spacer(modifier = Modifier.height(20.dp))
    }
}
