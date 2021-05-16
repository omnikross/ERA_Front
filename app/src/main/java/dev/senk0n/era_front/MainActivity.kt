package dev.senk0n.era_front

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import dev.senk0n.era_front.screen.ResetPassword
import dev.senk0n.era_front.screen.SignIn
import dev.senk0n.era_front.screen.SignUp
import dev.senk0n.era_front.screen.WelcomeScreen
import dev.senk0n.era_front.ui.theme.ERA_FrontTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ERA_FrontTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
                val context = LocalContext.current
                Column() {
                    Button( onClick = { context.startActivity(Intent(context, WelcomeScreen::class.java)) } ) {Text( text = "WelcomeScreen") }
                    Button( onClick = { context.startActivity(Intent(context, SignIn::class.java)) } ) {Text( text = "SignIn") }
                    Button( onClick = { context.startActivity(Intent(context, SignUp::class.java)) } ) {Text( text = "SignUp") }
                    Button( onClick = { context.startActivity(Intent(context, ResetPassword::class.java)) } ) { Text(text = "ResetPassword") }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ERA_FrontTheme {
        Greeting("Android")
    }
}