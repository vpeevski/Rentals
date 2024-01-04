package com.outdoorsy.interview.ui.rental.details

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import com.outdoorsy.interview.navigation.BackNavigationButton
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.MainViewModel
import com.outdoorsy.interview.ui.RentalDetailsScreenState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Composable
fun RentalDetailsScreen(
    mainViewModel: MainViewModel = viewModel(),
    rentalDetailsViewModel: RentalDetailsViewModel = viewModel(),
    appBarState: AppBarState,
    onBackPressed: () -> Unit = {}
) {
    val screen = appBarState.currentScreen as? RentalDetailsScreenState
    LaunchedEffect(key1 = screen) {
        println("RentalDetailsScreen, mainViewModel: $mainViewModel")
        screen?.buttonsFlow?.onEach { button ->
            when (button) {
                // ActionMenuItemType.Back -> onBackPressed()
                ActionMenuItemType.Login -> {
                    mainViewModel.showSnackBar(
                        "RentalDetails: Clicked on ${button.name}",
                        this
                    )
                }

                ActionMenuItemType.Favourites -> {
                    rentalDetailsViewModel.toggleFavorite()
                    screen.setFavIcon(if (rentalDetailsViewModel.isFavorite.value) Icons.Default.Favorite else Icons.Filled.FavoriteBorder)
                    mainViewModel.showSnackBar(
                        "RentalDetails: Clicked on ${button.name}",
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
