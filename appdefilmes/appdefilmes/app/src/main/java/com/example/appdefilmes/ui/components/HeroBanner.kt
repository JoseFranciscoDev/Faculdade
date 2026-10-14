package com.example.appdefilmes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdefilmes.R
import com.example.appdefilmes.ui.theme.Green

@Composable
fun HeroBanner() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(330.dp)
    ) {

        Image(
            painter = painterResource(R.drawable.jujutsu),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {

            Text(
                text = "New season 3",
                color = Green,
                fontSize = 12.sp
            )

            Text(
                text = "Jujutsu Kaisen",
                color = Color.White,
                fontSize = 22.sp
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                InfoChip("Shounen")
                InfoChip("Action")
                InfoChip("Anime")
            }
        }
    }
}
