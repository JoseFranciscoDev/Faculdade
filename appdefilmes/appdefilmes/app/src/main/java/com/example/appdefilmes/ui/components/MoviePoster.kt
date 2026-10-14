package com.example.appdefilmes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdefilmes.models.Movie

@Composable
fun MoviePoster(movie: Movie) {

    Column(
        modifier = Modifier.width(95.dp)
    ) {

        Image(
            painter = painterResource(movie.image),
            contentDescription = movie.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = movie.name,
            color = Color.White,
            fontSize = 11.sp,
            maxLines = 1
        )
    }
}
