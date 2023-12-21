package com.outdoorsy.interview.di

import com.outdoorsy.interview.RentalsResponsePage1Stub
import com.outdoorsy.interview.RentalsResponsePage2Stub
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.module.RemoteApiModule
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import io.mockk.coEvery
import io.mockk.spyk
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RemoteApiModule::class]
)
object TestRemoteApiModule {
    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient {
//        val mockHttpClient = mockk<OkHttpClient>()
//        val mockResponse  = mockk<Response>()
//        coEvery { mockResponse.isSuccessful } returns true
//        coEvery { mockResponse.body } returns ResponseBody.create(
//            "application/json; charset=utf-8".toMediaType(),
//            RentalsResponseJson
//            )
//        coEvery { mockHttpClient.newCall(any()).execute() } returns mockResponse
//
//        return mockHttpClient
        return spyk()
    }

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): OutdoorsyApi {
        val outdoorsyApi = spyk<OutdoorsyApi>()
        coEvery { outdoorsyApi.fetchRentals(any(), 6, 0) } returns RentalsResponsePage1Stub
        coEvery { outdoorsyApi.fetchRentals(any(), 6, 7) } returns RentalsResponsePage2Stub
        return outdoorsyApi
    }

    @Provides
    @Singleton
    fun provideRetrofit(httpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl("http://test")
            .build()
}