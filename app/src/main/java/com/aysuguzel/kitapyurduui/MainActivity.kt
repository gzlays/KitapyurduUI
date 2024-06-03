package com.aysuguzel.kitapyurduui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrokenImage
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aysuguzel.kitapyurduui.ui.theme.Green
import com.aysuguzel.kitapyurduui.ui.theme.KitapYurduUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KitapYurduUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(modifier = Modifier
                        .padding(start=5.dp),
                        text = "Kitapyurdu",
                        fontSize = 31.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Green
                    )
                },

                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.wh_fca476ca7),
                        contentDescription = ""
                    )
                },
                actions = {

                    Icon(
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .size(45.dp),
                        imageVector = Icons.Rounded.AccountCircle,
                        contentDescription = null,
                        tint = colorResource(id = R.color.orange)
                    )
                })
        },


        bottomBar = {
            BottomNavigationBar()
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Sections()

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KitapYurduUITheme {
        HomeScreen()
    }
}