package uz.qmgroup.pharmadealers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import uz.qmgroup.pharmadealers.screens.app.AppScreen
import uz.qmgroup.pharmadealers.ui.theme.PharmaDealersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PharmaDealersTheme(darkTheme = false) {
                // A surface container using the 'background' color from the theme
                AppScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}