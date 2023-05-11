package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier){
    Column(

    ){
        Row (
            Modifier.weight(1f),
        )
        {
            Column(
                Modifier
                    .weight(1f)
                    .background(Green)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center
            )
            {
                FirstQuadrant()

            }

            Column(
                Modifier
                    .weight(1f)
                    .background(Yellow)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center


            )
            {
                SecondQuadrant()

            }
        }
        Row (
            Modifier.weight(1f),

        )
        {
            Column(
                Modifier
                    .weight(1f)
                    .background(Cyan)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center


            )
            {
                ThirdQuadrant()


            }

            Column(
                Modifier
                    .weight(1f)
                    .background(LightGray)
                    .fillMaxSize(),

            )
            {
                FourthQuadrant()
            }


        }
    }


}

@Composable
fun FirstQuadrant(modifier: Modifier=Modifier){
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.first_quadrant_composable),
            fontWeight = Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = stringResource(R.string.first_quadrant_description),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun SecondQuadrant(modifier: Modifier=Modifier){
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.second_quadrant_composable),
            fontWeight = Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = stringResource(R.string.second_quadrant_description),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ThirdQuadrant(modifier: Modifier=Modifier){
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.third_quadrant_composable),
            fontWeight = Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = stringResource(R.string.third_quadrant_description),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun FourthQuadrant(modifier: Modifier=Modifier){
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.fourth_quadrant_composable),
            fontWeight = Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = stringResource(R.string.fourth_quadrant_description),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()


    }
}