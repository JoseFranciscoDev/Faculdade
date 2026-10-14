package com.example.appdefilmes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.appdefilmes.ui.theme.ChipBackground

@Composable
fun InfoChip(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .background(
                ChipBackground,
                RoundedCornerShape(50)
            )
            .padding(horizontal = 10.dp, vertical = 4.dp),
        color = Color.White
    )
}
