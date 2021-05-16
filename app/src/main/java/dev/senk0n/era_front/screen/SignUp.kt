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

class SignUp : ComponentActivity() {
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
                                text = "Create an account",
                                style = MaterialTheme.typography.h4,
                                fontWeight = FontWeight.Bold
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Already have an account?",
                                    style = MaterialTheme.typography.caption
                                )
                                TextButton(
                                    onClick = {}
                                ) {
                                    Text(
                                        text = "Sign in"
                                    )
                                }
                            }
                            OutlinedTextField(
                                value = "",
                                onValueChange = { var text = it },
                                label = { Text("Email or Phone") },
                                modifier = Modifier.fillMaxWidth()
                            )
                            Row {
                                OutlinedTextField(
                                    value = "",
                                    onValueChange = { var text = it },
                                    label = { Text("First name") },
                                    modifier = Modifier.weight(1F)
                                        .padding(end = 10.dp)
                                )
                                OutlinedTextField(
                                    value = "",
                                    onValueChange = { var text = it },
                                    label = { Text("Last name") },
                                    modifier = Modifier.weight(1F)
                                )
                            }
                            OutlinedTextField(
                                value = "",
                                onValueChange = { var text = it },
                                label = { Text("Password") },
                                modifier = Modifier.fillMaxWidth(),
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                            )
                            OutlinedTextField(
                                value = "",
                                onValueChange = { var text = it },
                                label = { Text("Re-enter password") },
                                modifier = Modifier.fillMaxWidth(),
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
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
                                Text("CONTINUE")
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(45.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = MaterialTheme.colors.onSurface,
                                    contentColor = MaterialTheme.colors.surface
                                )
                            ) {
                                Text("CONTINUE WITH GOOGLE")
                            }
                        }
                    }
                }
            }
        }
    }
}