package com.outdoorsy.interview.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.paging.compose.collectAsLazyPagingItems
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RentalsFragment : Fragment() {
    private val rentalsViewModel by viewModels<RentalsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        val rentals = emptyList<Any>()
        return ComposeView(requireContext()).apply {
            setContent {
                val rentals = rentalsViewModel.rentalsPager.collectAsLazyPagingItems()
//                Card(
//                    colors = CardDefaults.cardColors(
//                        containerColor = MaterialTheme.colorScheme.primary,
//                    ),
//                    modifier = Modifier
//                        .height(50.dp)
//                        .padding(16.dp)
//
//                ) { }
                LazyColumn(verticalArrangement = Arrangement.Center) {
                    items(rentals.itemCount) { rental ->
                        Text(text = "Hello")
                    }
                }
            }
        }
    }
}