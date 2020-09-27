package com.demo.imagesearch.di

import android.content.Context
import com.demo.imagesearch.network.ApiInterface
import com.demo.imagesearch.util.AUTH
import com.demo.imagesearch.util.BASE_URL
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideRetrofit(
        gsonConverter: GsonConverterFactory,
        httpClient: OkHttpClient,
        @Named("api_url") baseUrl: String
    ): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl).client(httpClient)
            .addConverterFactory(gsonConverter)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create(
            GsonBuilder()
                .create()
        )
    }

    @Singleton
    @Provides
    fun provideApiInterface(retrofit: Retrofit): ApiInterface {
        return buildApiClient(retrofit).create(
            ApiInterface::class.java)
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        context: Context
    ): OkHttpClient {
        val httpClient = OkHttpClient.Builder().apply {
            readTimeout(HTTP_TIMEOUT, TimeUnit.SECONDS)
            connectTimeout(HTTP_TIMEOUT, TimeUnit.SECONDS)
        }
        httpClient.addInterceptor { chain ->
            val ongoing = chain.request().newBuilder()
            ongoing.addHeader("Authorization", AUTH)
            val response = chain.proceed(ongoing.build())
            response
        }
        return httpClient.addNetworkInterceptor(loggingInterceptor).build()
    }

    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Singleton
    @Provides
    @Named("api_url")
    fun provideApiUrl(): String {
        return BASE_URL
    }

    private fun buildApiClient(retrofit: Retrofit): Retrofit {
        return retrofit.newBuilder().baseUrl(retrofit.baseUrl().toUrl().toString())
            .validateEagerly(true).build()
    }

    companion object {
        private const val HTTP_TIMEOUT = 40L
 }
}
