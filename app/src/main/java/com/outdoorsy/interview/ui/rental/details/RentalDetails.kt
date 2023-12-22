package com.outdoorsy.interview.ui.rental.details

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import com.outdoorsy.interview.navigation.BackNavigationButton
import com.outdoorsy.interview.snackbar.showSnackBar
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.RentalDetailsScreenState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Composable
fun RentalDetailsScreen(
    rentalDetailsViewModel: RentalDetailsViewModel = viewModel(),
    appBarState: AppBarState,
    snackbarHostState: SnackbarHostState,
    onBackPressed: () -> Unit = {}
) {
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
                    rentalDetailsViewModel.toggleFavorite()
                    screen.setFavIcon(if (rentalDetailsViewModel.isFavorite.value) Icons.Default.Favorite else Icons.Filled.FavoriteBorder)
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

    rentalDetailsViewModel.rentalId?.let {
        Text(text = "Single rental details, id: ${rentalDetailsViewModel.rentalId}")
    }
}
