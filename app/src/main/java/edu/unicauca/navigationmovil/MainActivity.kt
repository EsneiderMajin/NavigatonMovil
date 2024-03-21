package edu.unicauca.navigationmovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.unicauca.navigationmovil.ui.theme.NavigationMovilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationMovilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                    //ScreenButton("Android")
                }
            }
        }
    }
}

@Composable
fun ScreenButton(data: ScreenData,
                 onCLickButton: () -> Unit = {},
                 modifier: Modifier = Modifier) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.background(color = data.color)){
        Text(
            text = data.text,
            modifier = modifier
        )
        Spacer (modifier = Modifier.height(8.dp))
        Button(onCLickButton) {
            Row(verticalAlignment = Alignment.CenterVertically){
                Icon(imageVector = data.icon, contentDescription = "")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = data.textButton)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationMovilTheme {
    val data = ScreenData("Sample Screen",
        "Next",
        Icons.Default.AccountBox,
        Color.Gray)
        ScreenButton(data = data)
    }
}