package com.example.appdefilmes.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdefilmes.models.Movie

@Composable
fun MovieSection(
    title: String,
    movies: List<Movie>
) {

    Column(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {

        Text(
            text = title,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(movies) { movie ->
                MoviePoster(movie)
            }
        }
    }
}
