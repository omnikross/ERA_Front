package dev.senk0n.era_front.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.senk0n.era_front.ui.theme.ERA_FrontTheme

class ResetPassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ERA_FrontTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxHeight()
                            .padding(horizontal = 30.dp)
                            .padding(top = 200.dp, bottom = 40.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                        ) {
                            Text(
                                text = "Verify your identity",
                                style = MaterialTheme.typography.h4,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Column {
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .fillMaxWidth()
                                    .height(45.dp)
                            ) {
                                Text("SIGN IN TO A DIFFERENT ACCOUNT")
                            }
                        }
                    }
                }
            }
        }
    }
}