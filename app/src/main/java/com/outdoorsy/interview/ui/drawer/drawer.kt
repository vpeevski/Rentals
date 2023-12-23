package com.outdoorsy.interview.ui.drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.outdoorsy.interview.ui.ActionMenuItem

@Composable
fun drawerHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp)
    ) {
        Text(text = "Actions", fontSize = 48.sp)
    }
}

@Composable
fun drawerBody(
    items: List<ActionMenuItem> = emptyList(),
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (ActionMenuItem) -> Unit = {}
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(items) { item ->
            showMenuItem(item, itemTextStyle)
        }
    }
}

@Composable
fun showMenuItem(
    item: ActionMenuItem,
    textStyle: TextStyle
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { item.onClick?.invoke() }
        .padding(16.dp)
    ) {
        item.icon?.let {
            Icon(imageVector = it, contentDescription = item.contentDescription)
            Spacer(modifier = Modifier.width(16.dp))
        }
        Text(
            text = item.title,
            style = textStyle,
            modifier = Modifier.weight(1f)
        )
    }
}
