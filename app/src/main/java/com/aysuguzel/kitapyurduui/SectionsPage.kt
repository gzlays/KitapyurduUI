package com.aysuguzel.kitapyurduui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aysuguzel.kitapyurduui.data.Sections

@Composable
fun Sections() {
    val sectionItems = listOf(
        Sections(
            section = "ilgi Görenler",
            all = "Tümü",
            tur=0,
            contentList = listOf(
                painterResource(id = R.drawable.soyleme),
                painterResource(id = R.drawable.soyleme),
                painterResource(id = R.drawable.soyleme),
                painterResource(id = R.drawable.soyleme),
                painterResource(id = R.drawable.soyleme),
                painterResource(id = R.drawable.soyleme),

            )
        ),
        Sections(
            section = "Çok Satanlar",
            all = "Tümü",
            tur=0,
            contentList = listOf(
                painterResource(id = R.drawable.a),
                painterResource(id = R.drawable.a),
                painterResource(id = R.drawable.a),
                painterResource(id = R.drawable.a),
                painterResource(id = R.drawable.a),
                painterResource(id = R.drawable.a),

            )
        ),
        Sections(
            section = "Yeni Çıkanlar",
            all = "Tümü",
            tur=0,
            contentList = listOf(
                painterResource(id = R.drawable.otomatik),
                painterResource(id = R.drawable.otomatik),
                painterResource(id = R.drawable.otomatik),
                painterResource(id = R.drawable.otomatik),
                painterResource(id = R.drawable.otomatik),
            )
        ),
        Sections(
            section = "Haftanın Yayınevi",
            all = "Tümü",
            tur=1,
            contentList = listOf(
                painterResource(id = R.drawable.ithaki),
                painterResource(id = R.drawable.ithaki),
                painterResource(id = R.drawable.ithaki),
                painterResource(id = R.drawable.ithaki),
                painterResource(id = R.drawable.ithaki),


            )
        ),
        Sections(
            section = "Yazarlar",
            all = "Tümü",
            tur=1,
            contentList = listOf(
                painterResource(id = R.drawable.fyrodor),
                painterResource(id = R.drawable.fyrodor),
                painterResource(id = R.drawable.fyrodor),
                painterResource(id = R.drawable.fyrodor),
                painterResource(id = R.drawable.fyrodor),
            )
        ),
        Sections(
            section = "Yayın evleri",
            all = "Tümü",
            tur=1,
            contentList = listOf(
                painterResource(id = R.drawable.yky),
                painterResource(id = R.drawable.yky),
                painterResource(id = R.drawable.yky),
                painterResource(id = R.drawable.yky),
                painterResource(id = R.drawable.yky),
            )
        )
    )

    LazyColumn {
        items(sectionItems) {

            Row(modifier = Modifier.padding(top = 8.dp)) {

                Text(
                    text = it.section,
                    modifier = Modifier.padding(start = 7.dp, bottom = 6.dp),
                    fontSize = 23.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.orange)
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = it.all,
                    modifier = Modifier
                        .padding(start = 7.dp, bottom = 6.dp, end = 7.dp)
                        .clickable {

                        },
                    fontSize = 20.sp,
                    color = colorResource(id = R.color.orange)

                )
            }
            BookItem(sections = it)
            Spacer(modifier = Modifier.padding(bottom = 33.dp))
        }
    }
}

@Composable
fun BookItem(
    sections: Sections
) {
    LazyRow(
        modifier = Modifier
            .background(color = colorResource(id = R.color.lightGray))
    ) {
        items(sections.contentList) {

            if(sections.tur==1 ){
                Image(
                    painter = it,
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                    ,modifier = Modifier
                        .size(158.dp)
                        .padding(10.dp)
                        .clip(CircleShape)
                        .border(5.dp, Color.White, CircleShape)
                        .clickable {
                        }
                )
            }

            else{
                Image(
                    painter = it,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(width = 100.dp, height = 170.dp)
                        .border(5.dp, color = Color.White)
                        .clickable {

                        }
                )
            }


        }
    }
}