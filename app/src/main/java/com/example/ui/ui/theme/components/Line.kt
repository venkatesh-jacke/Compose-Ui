package com.example.ui.ui.theme.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

    @Composable
    fun Line() {
        val isDarkMode = isSystemInDarkTheme()
        Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Divider(
                thickness = 1.dp,
                color = if(isDarkMode) Color.White else Color.Black,
                modifier = Modifier
                    .fillMaxWidth()

            )
        }
    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LinePreview() {
    Line()
}