package com.outdoorsy.interview.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.outdoorsy.interview.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopActionsBar(
    appBarState: AppBarState,
    modifier: Modifier = Modifier
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            if (appBarState.title.isNotEmpty()) Text(text = appBarState.title)
        },
        navigationIcon = {
            appBarState.navigationAction?.let {
                MenuItem(it)
            }
        },
        actions = {
            val items = appBarState.actions
            if (items.isNotEmpty()) {
                ActionsMenu(items)
            }
        },
        scrollBehavior = scrollBehavior,
    )
}