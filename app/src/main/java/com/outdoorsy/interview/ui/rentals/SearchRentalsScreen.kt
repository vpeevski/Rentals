package com.outdoorsy.interview.ui.rentals

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DismissValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SwipeToDismiss
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDismissState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.outdoorsy.interview.R
import com.outdoorsy.interview.api.ErrorCode
import com.outdoorsy.interview.navigation.BackNavigationButton
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.MainViewModel
import com.outdoorsy.interview.ui.ShowFullSizeCentered
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.jetbrains.annotations.VisibleForTesting

//@Preview
@Composable
fun SearchRentals(
    mainViewModel: MainViewModel = viewModel(LocalContext.current as ComponentActivity),
    appBarState: AppBarState,
    filter: String = "",
    onFilterChanged: (String) -> Unit = {},
    onRentalClick: (String) -> Unit = {},
    pagingRentals: Flow<PagingData<Rental>> = MutableStateFlow(PagingData.from(emptyList())),
    onRemoveRental: (Rental) -> Unit = {},
    onBackPressed: () -> Unit = {},
    onSettingsPressed: () -> Unit = {}
) {
    val screen = appBarState.currentScreen
    LaunchedEffect(key1 = screen) {
        screen?.buttonsFlow?.onEach { button ->
            when (button) {
                // ActionMenuItemType.Back -> onBackPressed()
                ActionMenuItemType.Login -> {
                    mainViewModel.showSnackBar(
                        "SearchRentals: Clicked on ${button.name}",
                        this
                    )
                }

                ActionMenuItemType.Settings -> {
                    onSettingsPressed()
                    mainViewModel.showSnackBar(
                        "SearchRentals: Clicked on ${button.name}",
                        this
                    )
                }

                else -> {}
            }
        }?.launchIn(this)
    }
    BackNavigationButton(appBarState, onBackPressed)
    Column(modifier = Modifier.fillMaxSize()) {
        SearchRow(filter, onFilterChanged = onFilterChanged)
        val collectedItems = pagingRentals.collectAsLazyPagingItems()
        when (collectedItems.loadState.refresh) {
            is LoadState.Loading -> ShowFullSizeCentered {
                CircularProgressIndicator(modifier = Modifier.testTag("SearchSpinner"))
            }

            is LoadState.Error -> ShowFullSizeCentered {
                RetryMessage(
                    (collectedItems.loadState.refresh as LoadState.Error).error.message
                ) { collectedItems.refresh() }
            }

            else -> SearchRentalsResult(
                pagingRentals,
                onRentalClick,
                onRemoveRental
            )
        }
    }
}

@Composable
fun SearchRow(filter: String = "", onFilterChanged: (String) -> Unit = {}) {
    Box(
        modifier = Modifier.background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        TextField(value = filter,
            modifier = Modifier.padding(20.dp).fillMaxWidth().testTag("SearchTextField"),
            leadingIcon = {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = "Search for rentals",
                    modifier = Modifier.testTag("SearchIcon")
                )
            },
            trailingIcon = {
                Icon(
                    Icons.Filled.Mic,
                    contentDescription = "Search for rentals",
                    modifier = Modifier.testTag("MicIcon")
                )
            },
            onValueChange = { newText: String ->
                onFilterChanged(newText)
                //  rentalsViewModel.filter.value = newText
            })
    }
}

@Composable
fun RetryMessage(
    errorMessage: String? = "",
    doRefresh: () -> Unit = {},
) {
    val coroutineScope = rememberCoroutineScope()
//    (collectedItems.loadState.refresh as LoadState.Error).error.message?.let {
    Text(
        text = errorMessage ?: ""
    )
    Button(onClick = {
        coroutineScope.launch {
            doRefresh()
        }
    }) {
        Text(text = "Retry")
//        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@VisibleForTesting
@Composable
fun SearchRentalsResult(
    rentalsPaging: Flow<PagingData<Rental>> = MutableStateFlow(PagingData.from(emptyList())),
    onRentalClick: (String) -> Unit = {},
    onRemoveRental: (Rental) -> Unit = {}
) {
    val collectedItems = rentalsPaging.collectAsLazyPagingItems()
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
    ) {
        if (collectedItems.itemCount > 0) {
            items(
                count = collectedItems.itemCount,
                key = collectedItems.itemKey { it }
            ) { rentalIndex ->
                val rental = collectedItems[rentalIndex]
                rental?.id?.let {
                    var showing by rememberSaveable { mutableStateOf(true) }
                    val dismissState = rememberDismissState(
                        confirmValueChange = {
                            if (it == DismissValue.DismissedToEnd) {
                                showing = false
                                true
                            } else false
                        }
                    )
                    dismissState
                    SwipeToDismiss(
                        state = dismissState,
                        background = {
                            val color by animateColorAsState(
                                when (dismissState.targetValue) {
                                    DismissValue.Default -> MaterialTheme.colorScheme.surface
                                    DismissValue.DismissedToEnd -> MaterialTheme.colorScheme.secondaryContainer
                                    DismissValue.DismissedToStart -> MaterialTheme.colorScheme.errorContainer
                                }
                            )
                            Box(Modifier.fillMaxSize().background(color))
                        },
                        dismissContent = {
                            Card(
                                modifier = Modifier
                                    .background(MaterialTheme.colorScheme.surface)
                                    .fillMaxWidth()
                                    .wrapContentHeight(align = Alignment.CenterVertically)
                                    .padding(10.dp)
                                    .clickable { onRentalClick(rental.id) },
                                shape = RoundedCornerShape(10.dp),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 5.dp
                                )
                            ) {
                                Row(
                                    modifier = Modifier.padding(10.dp)
                                        .fillMaxHeight(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    rental.primaryImageUrl?.let {
                                        AsyncImage(
                                            model =
                                            ImageRequest.Builder(
                                                LocalContext.current
                                            )
                                                .data(rental.primaryImageUrl)
                                                .crossfade(true)
                                                .build(),
                                            placeholder = painterResource(R.drawable.ic_launcher_background),
                                            contentDescription = stringResource(R.string.app_name),
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier.clip(
                                                RoundedCornerShape(5.dp)
                                            )
                                                .width(80.dp).height(60.dp)
                                        )
                                    }
                                    rental?.attributes?.name?.let {
                                        Text(
                                            text = it,
                                            modifier = Modifier.padding(20.dp),
                                            color = MaterialTheme.colorScheme.inversePrimary,
                                            fontWeight = FontWeight.Bold,
                                            style = TextStyle(
                                                fontSize = 16.sp,
                                                shadow = Shadow(
                                                    color = MaterialTheme.colorScheme.secondary,
                                                    offset = Offset(1f, 2f),
                                                    blurRadius = 1f
                                                )
//
                                            )
                                        )
                                    }
//                                    }
                                }
                            }
                        }
                    )

                    LaunchedEffect(showing) {
                        if (!showing) {
                            onRemoveRental(rental)
                        }
                    }
                    if (!showing) {
                        Toast.makeText(
                            LocalContext.current,
                            "Rental removed",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        } else {
            item {
                Box(
                    modifier = Modifier.fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(
                        text = ErrorCode.NotFount.message
                    )
                }
            }
        }
    }
}