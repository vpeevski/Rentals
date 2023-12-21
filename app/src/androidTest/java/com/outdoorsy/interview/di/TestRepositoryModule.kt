package com.outdoorsy.interview.di

import androidx.paging.PagingData
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.module.DispatchersModule
import com.outdoorsy.interview.module.IoDispatcher
import com.outdoorsy.interview.module.RepositoryModule
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.repository.IRentalRepository
import com.outdoorsy.interview.repository.RentalsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import io.mockk.spyk
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.test.TestCoroutineScheduler
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RepositoryModule::class]
)
object TestRepositoryModule {
    @Singleton
    @Provides
    fun provideRentalsRepository(outdoorsyApi: OutdoorsyApi): IRentalRepository<Flow<PagingData<Rental>>> {
        return RentalsRepository(outdoorsyApi)
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [DispatchersModule::class]
)
class TestScopes {
    @Singleton
    @Provides
    fun provideScheduler(): TestCoroutineScheduler = TestCoroutineScheduler()

    @Singleton
    @Provides
    @IoDispatcher
    fun provideIoDispatcher(
        scheduler: TestCoroutineScheduler
    ): CoroutineDispatcher = UnconfinedTestDispatcher(scheduler)

    @Singleton
    @Provides
    fun provideCoroutineScope(@IoDispatcher dispatcher: CoroutineDispatcher):
            TestScope = TestScope(dispatcher)
}