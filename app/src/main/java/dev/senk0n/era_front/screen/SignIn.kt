package dev.senk0n.era_front.screen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import dev.senk0n.era_front.ui.theme.ERA_FrontTheme

class SignIn : ComponentActivity() {
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
                                text = "Sign in",
                                style = MaterialTheme.typography.h4,
                                fontWeight = FontWeight.Bold
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "New user?",
                                    style = MaterialTheme.typography.caption
                                )
                                val context = LocalContext.current
                                TextButton(
                                    onClick = { context.startActivity(Intent(context, SignUp::class.java)) }
                                ) {
                                    Text(
                                        text = "Create an account"
                                    )
                                }
                            }
//                            EmailTextField()
                            OutlinedTextField(
                                value = "",
                                onValueChange = { var text = it },
                                label = { Text("Email") },
                                modifier = Modifier.fillMaxWidth()
                            )
//                            PasswordTextField()
                            OutlinedTextField(
                                value = "",
                                onValueChange = { var text = it },
                                label = { Text("Password") },
                                modifier = Modifier.fillMaxWidth(),
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                            )
                            val context = LocalContext.current
                            TextButton(
                                onClick = { context.startActivity(Intent(context, ResetPassword::class.java)) }
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
//fun EmailTextField() {
//    val text by remember { mutableStateOf("") }
//
//    OutlinedTextField(
//        value = text,
//        onValueChange = { text = it },
//        label = { Text("Label") }
//    )
//}

//@Composable
//fun PasswordTextField() {
//    var password by rememberSaveable { mutableStateOf("") }
//
//    TextField(
//        value = password,
//        onValueChange = { password = it },
//        label = { Text("Enter password") },
//        visualTransformation = PasswordVisualTransformation(),
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
//    )
//}