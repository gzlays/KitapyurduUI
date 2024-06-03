package com.aysuguzel.kitapyurduui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Discount
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.HeartBroken
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aysuguzel.kitapyurduui.data.BottomNavigation
import com.aysuguzel.kitapyurduui.ui.theme.Orange

val items = listOf(

    BottomNavigation(
        title = "Ana Sayfa",
        icon = Icons.Rounded.Home
    ),

    BottomNavigation(
        title = "kampanyalar",
        icon = Icons.Rounded.Discount
    ),
    BottomNavigation(
        title = "Ara",
        icon = Icons.Rounded.Search
    ),
    BottomNavigation(
        title = "Favoriler",
        icon = Icons.Rounded.Favorite
    ),
    BottomNavigation(
        title = "Sepetim",
        icon = Icons.Rounded.ShoppingCart
    ),

    )


@Preview
@Composable
fun BottomNavigationBar() {
    var selectedIndex by remember { mutableIntStateOf(0) }
    NavigationBar {
        Row(
            modifier = Modifier
                .background(colorResource(id = R.color.bottom))

        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == selectedIndex,
                    onClick = {
                        selectedIndex = index
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                        )

                    },
                    label = {
                        Text(
                            text = item.title,
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.outline
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Orange
                    )
                )
            }
        }
    }

}