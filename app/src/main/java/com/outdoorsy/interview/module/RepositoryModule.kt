package com.outdoorsy.interview.module

import androidx.paging.PagingData
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.repository.IRentalRepository
import com.outdoorsy.interview.repository.RentalsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRentalsRepository(outdoorsyApi: OutdoorsyApi): IRentalRepository<Flow<PagingData<Rental>>> {
        return RentalsRepository(outdoorsyApi)
    }
}

@InstallIn(SingletonComponent::class)
@Module
object DispatchersModule {

    @Singleton
    @Provides
    @IoDispatcher
    fun provideIoDispatcher() = Dispatchers.IO

}

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class IoDispatcher