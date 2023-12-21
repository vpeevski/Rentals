package com.outdoorsy.interview.ui

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable

@Composable
fun ActionsMenu(items: List<ActionMenuItem>) {
    items.forEach { action ->
        MenuItem(action)
    }
}

@Composable
fun MenuItem(item: ActionMenuItem) {
    if (item.icon != null) {
        IconButton(onClick = item.onClick ?: {}) {
            Icon(
                imageVector = item.icon!!,
                contentDescription = item.contentDescription
            )
        }
    }
}