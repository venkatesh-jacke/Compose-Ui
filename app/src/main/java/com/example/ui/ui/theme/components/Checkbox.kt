package com.example.ui.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import  androidx.compose.material3.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Checkbox() {
    // State to remember the checked state of the checkbox
    val checked = remember { mutableStateOf(false) }

    // Check if the system is in dark mode
    val isDarkMode = isSystemInDarkTheme()

    // Column composable to arrange checkbox and text vertically
   Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        // Checkbox composable with dynamically set colors based on the system theme
        Checkbox(
            checked = checked.value,
            onCheckedChange = { isChecked -> checked.value = isChecked },
            colors = CheckboxDefaults.colors(
                checkedColor = if (isDarkMode) Color.White else Color.Black,
            )
        )

        // Text displaying the status of the checkbox
        Text("Custom checkbox is ${if (checked.value) "checked" else "unchecked"}")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CheckboxPreview() {
    Checkbox()
}