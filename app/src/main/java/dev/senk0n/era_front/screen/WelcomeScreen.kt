package dev.senk0n.era_front.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.senk0n.era_front.ui.theme.ERA_FrontTheme

class WelcomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ERA_FrontTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "ERA",
                            style = MaterialTheme.typography.h1,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                                .padding(top = 270.dp)
                        )
                        BottomButton(text = "GET STARTED", modifier = Modifier.padding(bottom = 60.dp))
                    }

                }
            }
        }
    }
}

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