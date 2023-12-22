package com.outdoorsy.interview.ui.rental.details

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.outdoorsy.interview.navigation.BackNavigationButton
import com.outdoorsy.interview.snackbar.showSnackBar
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.RentalDetailsScreenState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Composable
fun RentalDetailsScreen(
    appBarState: AppBarState,
    snackbarHostState: SnackbarHostState,
    rentalId: String?,
    onBackPressed: () -> Unit = {}
) {
    var favEnabled by remember { mutableStateOf(false) }
    val screen = appBarState.currentScreen as? RentalDetailsScreenState
    LaunchedEffect(key1 = screen) {
        screen?.buttonsFlow?.onEach { button ->
            when (button) {
                // ActionMenuItemType.Back -> onBackPressed()
                ActionMenuItemType.Login -> {
                    showSnackBar(
                        "RentalDetails: Clicked on ${button.name}",
                        snackbarHostState,
                        this
                    )
                }

                ActionMenuItemType.Favourites -> {
                    favEnabled = !favEnabled
                    screen.setFavIcon(if (favEnabled) Icons.Default.Favorite else Icons.Filled.FavoriteBorder)
                    showSnackBar(
                        "RentalDetails: Clicked on ${button.name}",
                        snackbarHostState,
                        this
                    )
                }

                else -> {}
            }
        }?.launchIn(this)
    }
    BackNavigationButton(appBarState, onBackPressed)

    rentalId?.let {
        Text(text = "Single rental details, id: $rentalId")
    }
}
