package dev.senk0n.era_front.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BottomButton(text: String, onClick: () -> Unit = {}, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier
            .fillMaxWidth()
            .height(45.dp)
            .padding(horizontal = 30.dp)
    ) {
        Text(text)
    }
}

@Composable
fun BottomButtonWithIcon(icon: Icon, text: String, onClick: () -> Unit = {}, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier
            .fillMaxWidth()
            .height(45.dp)
            .padding(horizontal = 30.dp)
    ) {
//        Icon
        Text(text)
    }
}