package com.outdoorsy.interview.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.outdoorsy.interview.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RentalsFragment : Fragment() {
    private val rentalsViewModel by viewModels<RentalsViewModel>()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


//        val rentals = emptyList<Any>()
        return ComposeView(requireContext()).apply {
            setContent {
                AppContent()
            }
        }
    }

    @Preview
    @Composable
    fun AppContent() {
        var filter by rememberSaveable { mutableStateOf("") }
        val rentals = rentalsViewModel.rentalsPager.collectAsLazyPagingItems()
        if (rentals.loadState.refresh is LoadState.Loading) {
            CircularProgressIndicator()
        } else {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Box(
                    modifier = Modifier.background(MaterialTheme.colorScheme.primary)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    TextField(value = filter,
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
                            filter = newText
                        })
                }

                LazyColumn(verticalArrangement = Arrangement.Center) {
                    items(
                        count = rentals.itemCount,
                        key = rentals.itemKey { it }
                    ) { rentalIndex ->
                        val rental = rentals[rentalIndex]
                        rental?.id?.let {
                            Card(
                                modifier = Modifier
                                    .background(MaterialTheme.colorScheme.primaryContainer)
                                    .fillMaxWidth()
                                    .padding(10.dp),
                                shape = RoundedCornerShape(10.dp),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 5.dp
                                )
                            ) {
                                Row(
                                    modifier = Modifier.padding(10.dp),
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
                                        modifier = Modifier.clip(RoundedCornerShape(5.dp))
                                            .width(80.dp).height(60.dp)
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
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}