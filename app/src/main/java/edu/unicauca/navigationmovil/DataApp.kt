package edu.unicauca.navigationmovil

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

class DataApp {
    companion object{
        fun getScreensData():List<ScreenData>{
            return listOf(
                ScreenData(
                    text = "Screen 1",
                    textButton="textButton",
                    icon = Icons.Default.AccountCircle,
                    color = Color.Gray
            ),
                ScreenData(
                    text = "Screen 2",
                    textButton="Next",
                    icon = Icons.Default.ArrowForward,
                    color = Color.Yellow
                ),
                ScreenData(
                    text = "Screen 3",
                    textButton="Home",
                    icon = Icons.Default.Home,
                    color = Color.Blue
                )
            )
        }
        }
    }

data class ScreenData (
    val text: String,
    val textButton: String,
    val icon: ImageVector,
    val color: Color
){

}
