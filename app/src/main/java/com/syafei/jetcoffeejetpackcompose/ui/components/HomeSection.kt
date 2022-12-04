package com.syafei.jetcoffeejetpackcompose.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/*Kunci untuk membuat slot-based layout adalah dengan menggunakan
 function type @Composable () -> Unit pada parameter. */

@Composable
fun HomeSection(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        SectionText(title, modifier)
        content()
    }


}