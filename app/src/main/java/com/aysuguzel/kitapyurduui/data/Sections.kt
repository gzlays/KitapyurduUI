package com.aysuguzel.kitapyurduui.data

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter

data class Sections(
    val section:String,
    val all:String,
    val contentList: List<Painter>,
    val tur:Int
)
