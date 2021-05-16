package dev.senk0n.era_front.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
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
                            .padding(top = 270.dp, bottom = 40.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
//                            modifier = Modifier.padding(top = 270.dp)
                        ) {
                            Text(
                                text = "Sign in",
                                style = MaterialTheme.typography.h3
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "New user?",
                                    style = MaterialTheme.typography.caption
                                )
                                TextButton(
                                    onClick = {}
                                ) {
                                    Text(
                                        text = "Create an account"
                                    )
                                }
                            }
//                            SimpleOutlinedTextField(value = "example@mail.com")
                            OutlinedTextField(
                                value = "example@mail.com",
                                onValueChange = { var text = it },
                                label = { Text("Email") },
                                modifier = Modifier.fillMaxWidth()
                            )
                            OutlinedTextField(
                                value = "",
                                onValueChange = { var text = it },
                                label = { Text("Password") },
                                modifier = Modifier.fillMaxWidth()
                            )
                            TextButton(
                                onClick = {}
                            ) {
                                Text(
                                    text = "Reset your password"
                                )
                            }
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
                                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.onSurface, contentColor = MaterialTheme.colors.surface)
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

//@Composable
//fun SimpleOutlinedTextField() {
//    var text by remember { mutableStateOf("") }
//
//    OutlinedTextField(
//        value = text,
//        onValueChange = { text = it },
//        label = { Text("Label") }
//    )
//}