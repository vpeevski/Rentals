package com.outdoorsy.interview

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.paging.PagingData
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.outdoorsy.interview.rentals.RentAttributes
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.ui.rentals.RetryMessage
import com.outdoorsy.interview.ui.rentals.SearchRentalsResult
import com.outdoorsy.interview.ui.rentals.SearchRow
import kotlinx.coroutines.flow.MutableStateFlow
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class RentalsScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testSearchRow() {
        composeTestRule.setContent {
            SearchRow()
        }
        composeTestRule.onNodeWithTag("SearchIcon", useUnmergedTree = true)
            .assertExists()
        composeTestRule.onNodeWithTag("MicIcon", useUnmergedTree = true).assertExists()

        composeTestRule.onNodeWithTag("SearchTextField").assertExists()
        // composeTestRule.onNodeWithTag("SearchTextField").performTextInput("Sample text")
    }

    @Test
    fun testRetryMessage() {
        composeTestRule.setContent {
            RetryMessage("Test Error message")
        }

        // Verify the presence of error message and retry button
        composeTestRule.onNodeWithText("Test Error message").assertExists()
        composeTestRule.onNodeWithText("Retry").assertExists()
    }

    @Test
    fun testSearchRentalsResult() {
        val mockPagingData = MutableStateFlow(
            PagingData.from(
                listOf(
                    Rental("1", RentAttributes("Rental Name 1"), "Image URL 1"),
                    Rental("2", RentAttributes("Rental Name 2"), "Image URL 2")
                )
            )
        )
        composeTestRule.setContent {
            SearchRentalsResult(rentalsPaging = mockPagingData)
        }

        // Verify the presence of UI elements in each item (you may need to adapt based on your UI structure)
        composeTestRule.onNodeWithText("Rental Name 1").assertExists()
        composeTestRule.onNodeWithText("Rental Name 2").assertExists()
    }

    @Test
    fun testDeleteRental() {
        var doDeleteCalled = false;
        val mockPagingData = MutableStateFlow(
            PagingData.from(
                listOf(
                    Rental("1", RentAttributes("Rental Name 1"), "Image URL 1"),
                    Rental("2", RentAttributes("Rental Name 2"), "Image URL 2")
                )
            )
        )
        composeTestRule.setContent {
            SearchRentalsResult(
                rentalsPaging = mockPagingData,
                onRemoveRental = {
                    doDeleteCalled = true
                })
        }

        composeTestRule.onNodeWithText("Rental Name 1").performTouchInput {
            swipeRight(startX = 0f, endX = 5000f, durationMillis = 200)
        }
        composeTestRule.waitForIdle()
        assert(doDeleteCalled)
    }
}
