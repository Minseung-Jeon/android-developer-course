package com.example.lemonade

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}



@Composable
fun LemonadeApp(modifier: Modifier = Modifier) {
    var pageNum by remember { mutableStateOf(1) }
    var tap by remember { mutableStateOf(1) }

    val imageResource = when (pageNum) {
        1 -> R.drawable.lemon_tree
        3+tap -> R.drawable.lemon_drink
        4+tap -> R.drawable.lemon_restart
        else -> R.drawable.lemon_squeeze

    }

    val imageDescription = when (pageNum) {
        1 -> R.string.lemon_tree_description
        3+tap -> R.string.lemon_drink_description
        4+tap -> R.string.lemon_glass_description
        else -> R.string.lemon_squeeze_description

    }



    val followingText = when (pageNum) {
        1 -> R.string.lemon_tree_tap

        3+tap -> R.string.lemon_drink_tap
        4+tap -> R.string.lemon_glass_tap
        else -> R.string.lemon_squeeze_tap
    }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(stringResource(R.string.app_name))
    }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            shape = RoundedCornerShape(30.dp),
            onClick = { pageNum ++ }

        ) {
            Image(painter = painterResource(imageResource), contentDescription = stringResource(imageDescription))
            if (pageNum == 1) {
                tap = (2..4).random()
            }
            else if (pageNum > 4+tap) {
                pageNum = 1
            }

        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(stringResource(followingText), fontSize = 18.sp)
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        LemonadeApp()
    }
}