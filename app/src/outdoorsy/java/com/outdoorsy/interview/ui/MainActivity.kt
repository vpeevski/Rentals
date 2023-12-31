package com.outdoorsy.interview.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDismissState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.outdoorsy.interview.R
import com.outdoorsy.interview.api.ErrorCode
import com.outdoorsy.interview.ui.theme.OutdoorsyTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val rentalsViewModel by viewModels<RentalsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main_activity_layout)
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.main_fragment_container, RentalsFragment())
//            .commit()
        setContent {
            OutdoorsyTheme(dynamicColor = false) {
                AppContent_Broken()
            }
        }
    }

    @OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun AppContent() {
        val coroutineScope = rememberCoroutineScope()
        val collectedItems = rentalsViewModel.rentalsResult.collectAsLazyPagingItems()
        Column(
            modifier = Modifier.fillMaxSize()
                .background(MaterialTheme.colorScheme.surface),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier.shadow(2.dp).background(MaterialTheme.colorScheme.primary)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center,
            ) {
                TextField(value = rentalsViewModel.filter.collectAsState().value,
                    modifier = Modifier.padding(20.dp).fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            Icons.Outlined.Search,
                            contentDescription = "Search for rentals"
                        )
                    },
                    trailingIcon = {
                        Icon(
                            Icons.Filled.Mic,
                            contentDescription = "Search for rentals"
                        )
                    },
                    onValueChange = { newText ->
                        rentalsViewModel.filter.value = newText
                    })
            }

            when (collectedItems.loadState.refresh) {
                is LoadState.Loading -> LoadingState {
                    CircularProgressIndicator()
                }

                is LoadState.Error -> {
                    LoadingState {
                        (collectedItems.loadState.refresh as LoadState.Error).error.message?.let {
                            Text(
                                text = it
                            )
                            Button(onClick = {
                                coroutineScope.launch {
                                    collectedItems.refresh()
                                }
                            }) {
                                Text(text = "Retry")
                            }
                        }
                    }
                }

                else -> LazyColumn(
                    Modifier.fillMaxHeight().weight(1f),
                    verticalArrangement = Arrangement.Top
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
                                Card(
                                    onClick = {
                                    },
                                    modifier = Modifier
                                        .background(MaterialTheme.colorScheme.surface)
                                        .fillMaxWidth()
                                        .wrapContentHeight(align = Alignment.CenterVertically)
                                        .padding(10.dp),
                                    shape = RoundedCornerShape(10.dp),
                                    elevation = CardDefaults.cardElevation(
                                        defaultElevation = 5.dp
                                    )
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .padding(10.dp)
                                            .fillMaxHeight(),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        AsyncImage(
                                            model = ImageRequest.Builder(LocalContext.current)
                                                .data(rental.primaryImageUrl)
                                                .crossfade(true)
                                                .build(),
                                            placeholder = painterResource(R.drawable.ic_launcher_background),
                                            contentDescription = stringResource(R.string.app_name),
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(5.dp))
                                                .width(80.dp)
                                                .height(60.dp)
                                        )
                                        rental?.attributes?.name?.let {
                                            Text(
                                                text = it,
                                                modifier = Modifier.padding(20.dp),
                                                color = MaterialTheme.colorScheme.primary,
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
                        }
                    } else {
                        item {
                            Text(
                                text = ErrorCode.NotFount.message
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun LoadingState(
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit
    ) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}