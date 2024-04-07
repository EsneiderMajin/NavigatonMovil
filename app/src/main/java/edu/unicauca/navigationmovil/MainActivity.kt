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

/**
 * A composable function that displays a button on the screen.
 *
 * @param data The data for the screen, which includes the color, text, and icon for the button.
 * @param onClickButton A lambda function that defines what happens when the button is clicked. By default, it does nothing.
 * @param modifier A Modifier that can be used to adjust the layout or other properties of the composable.
 */
@Composable
fun ScreenButton(
    data: ScreenData,
    onClickButton: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    // A column is used to arrange its children vertically.
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.background(color = data.color)
    ) {
        // Display the text from the data.
        Text(
            text = data.text,
            modifier = modifier
        )
        // Provide some spacing.
        Spacer(modifier = Modifier.height(8.dp))
        // Create a button that triggers the onClickButton lambda when clicked.
        Button(onClickButton) {
            // Arrange the icon and text horizontally in the button.
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Display the icon from the data.
                Icon(imageVector = data.icon, contentDescription = "")
                // Provide some spacing.
                Spacer(modifier = Modifier.width(8.dp))
                // Display the button text from the data.
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