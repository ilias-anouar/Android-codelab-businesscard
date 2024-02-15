package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card() {
    val image = painterResource(R.drawable.android_logo)
    Surface (Modifier,
        color = Color(0xFF3ddc84)
        ) {
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column (verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column {
                        Surface(color = Color.Red) {
                            Image(
                                painter = image,
                                contentDescription = "android logo",
                                modifier = Modifier
                                    .align(alignment = Alignment.CenterHorizontally)
                                    .size(150.dp)
                            )
                        }
                    }
                    Column {
                        Text(
                            text = stringResource(R.string.name),
                            textAlign = TextAlign.Center,
                            fontSize = 50.sp,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }
                    Column {
                        Text(
                            text = stringResource(R.string.label),
                            textAlign = TextAlign.Center,
                            fontSize = 25.sp,
                            color = Color.Red,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }
                }
            }
            Spacer(Modifier.size(150.dp))
            Column (
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Contact()
            }
        }
    }
}

@Composable
private fun Contact() {
    val myAppIcons = Icons.Rounded
    Column (
        Modifier.padding(bottom = 20.dp),
        verticalArrangement = Arrangement.Center,

    ) {
        Row {
            Column (Modifier.padding(
                 10.dp
            )) {
                Icon(imageVector = myAppIcons.Call,
                    contentDescription = "account icon",
                    tint = Color.Black
                )
            }
            Column (Modifier.padding(
                10.dp
            )) {
                Text(
                    text = stringResource(R.string.number)
                )
            }
        }
        Row {
            Column (Modifier.padding(
                10.dp
            )) {
                Icon(imageVector = myAppIcons.AccountCircle,
                    contentDescription = "account icon",
                    tint = Color.Black
                    )
            }
            Column (Modifier.padding(
                10.dp
            )) {
                Text(
                    text = stringResource(R.string.account)
                )
            }
        }
        Row {
            Column (Modifier.padding(
                10.dp
            )) {
                Icon(
                    imageVector = myAppIcons.Email,
                    contentDescription = "account icon",
                    tint = Color.Black
                )
            }
            Column (Modifier.padding(
                10.dp
            )) {
                Text(text = stringResource(R.string.email)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Card()
    }
}