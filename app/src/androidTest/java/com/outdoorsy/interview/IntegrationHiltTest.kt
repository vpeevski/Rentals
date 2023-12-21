package com.outdoorsy.interview

import android.content.Context
import androidx.compose.ui.test.TestContext
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.paging.PagingData
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.module.IoDispatcher
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.repository.IRentalRepository
import com.outdoorsy.interview.repository.RentalsRepository
import com.outdoorsy.interview.ui.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject

@HiltAndroidTest
//@RunWith(AndroidJUnit4::class)
class IntegrationHiltTest {

    @get:Rule(order = 0)
    var hiltAndroidRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Inject
    lateinit var rentalsRepository: IRentalRepository<Flow<PagingData<Rental>>>

    @Inject
    lateinit var outdoorsyApi: OutdoorsyApi

    @Inject
    @IoDispatcher
    lateinit var ioDispatcher: CoroutineDispatcher

    @Inject
    lateinit var scope: TestScope

    val context: Context = InstrumentationRegistry.getInstrumentation().targetContext

    // TODO Move this in separate tests class for navigation testing
    // private lateinit var navController: TestNavHostController


    @Before
    fun init() = runTest() {
        hiltAndroidRule.inject()
        // coEvery { outdoorsyApi.fetchRentals(capture(slot())) } returns UserResponseStub
//        coEvery { rentalsRepository.fetchRentals("") } returns MutableStateFlow(
//            PagingData.from(UserResponseStub.data)
//        ).asStateFlow()
        // TODO Move this in separate tests class for navigation testing
//        composeTestRule.setContent {
//            navController = TestNavHostController(LocalContext.current)
//            navController.navigatorProvider.addNavigator(ComposeNavigator())
//            OutdoorsyNavHost(navController = navController)
//        }
    }

    @After
    fun clear() {
//        scope.runTest {
//            userRepo.clear()
//        }
        scope.cancel()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun checkTest() = runTest(ioDispatcher) {
        assert(outdoorsyApi != null)
        assert(rentalsRepository != null)
        advanceUntilIdle()
        composeTestRule.onNodeWithText("Rental Name 1").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rental Name 2").assertIsDisplayed()
    }

//    @OptIn(ExperimentalCoroutinesApi::class)
//    @Test
//    fun checkTestSame() = runTest(ioDispatcher) {
//        assert(outdoorsyApi != null)
//        assert(rentalsRepository != null)
//        advanceUntilIdle()
//        composeTestRule.onNodeWithText("Rental Name 1").assertIsDisplayed()
//        composeTestRule.onNodeWithText("Rental Name 2").assertIsDisplayed()
//    }
}