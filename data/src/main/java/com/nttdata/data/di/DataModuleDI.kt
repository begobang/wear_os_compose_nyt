package com.nttdata.data.di

import android.content.Context
import com.nttdata.data.remoteDataSource.GetArchiveRemoteDataSource
import com.nttdata.data.remoteDataSource.GetFilmPicksRemoteDataSource
import com.nttdata.data.remoteDataSource.GetLiveNewsRemoteDataSource
import com.nttdata.data.remoteDataSource.GetSectionsRemoteDataSource
import com.nttdata.data.repositoryImpl.GetArchiveRepositoryImpl
import com.nttdata.data.repositoryImpl.GetFilmPicksRepositoryImpl
import com.nttdata.data.repositoryImpl.GetLiveNewsRepositoryImpl
import com.nttdata.data.repositoryImpl.GetSectionsRepositoryImpl
import com.nttdata.data.services.GetArchiveService
import com.nttdata.data.services.GetFilmPicksService
import com.nttdata.data.services.GetLiveNewsService
import com.nttdata.data.services.GetSectionsService
import com.nttdata.domain.archive.GetArchiveRepository
import com.nttdata.domain.films.GetFilmPicksRepository
import com.nttdata.domain.liveNews.GetLiveNewsRepository
import com.nttdata.domain.sections.GetSectionsRepository

import com.rocket.android.core.data.network.di.CoreDataNetworkProvider
import com.rocket.core.crashreporting.logger.CrashLogger
import com.rocket.core.data.network.commons.di.createApiClient
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModuleDI {

    @Provides
    @Singleton
    fun provideGetSectionsService(
        @ApiEndPoint url: String,
        client: OkHttpClient
    ): GetSectionsService {
        return createApiClient(
            okHttpClient = client,
            baseUrl = url,
            converterFactory = GsonConverterFactory.create()
        )
    }

    @Provides
    @Singleton
    fun provideGetLiveNewsService(
        @ApiEndPoint url: String,
        client: OkHttpClient
    ): GetLiveNewsService {
        return createApiClient(
            okHttpClient = client,
            baseUrl = url,
            converterFactory = GsonConverterFactory.create()
        )
    }

    @Provides
    @Singleton
    fun provideGetArchiveService(
        @ApiEndPoint url: String,
        client: OkHttpClient
    ): GetArchiveService {
        return createApiClient(
            okHttpClient = client,
            baseUrl = url,
            converterFactory = GsonConverterFactory.create()
        )
    }

    @Provides
    @Singleton
    fun provideGetFilmPicksService(
        @ApiEndPoint url: String,
        client: OkHttpClient
    ): GetFilmPicksService {
        return createApiClient(
            okHttpClient = client,
            baseUrl = url,
            converterFactory = GsonConverterFactory.create()
        )
    }

    @Provides
    @Singleton
    fun provideGetSectionsRepository(
        remoteDataSource: GetSectionsRemoteDataSource
    ): GetSectionsRepository = GetSectionsRepositoryImpl(remoteDataSource)

    @Provides
    @Singleton
    fun provideGetLiveNewsRepository(
        remoteDataSource: GetLiveNewsRemoteDataSource
    ): GetLiveNewsRepository = GetLiveNewsRepositoryImpl(remoteDataSource)

    @Provides
    @Singleton
    fun provideGetArchiveRepository(
        remoteDataSource: GetArchiveRemoteDataSource
    ): GetArchiveRepository = GetArchiveRepositoryImpl(remoteDataSource)

    @Provides
    @Singleton
    fun provideGetFilmPicksRepository(
        remoteDataSource: GetFilmPicksRemoteDataSource
    ): GetFilmPicksRepository = GetFilmPicksRepositoryImpl(remoteDataSource)


    @Provides
    @Singleton
    fun provideCrashLogger(provider: CoreDataNetworkProvider): CrashLogger {
        return provider.crashLogger
    }

    @Provides
    @Singleton
    fun provideCoreDataNetworkProvider(@ApplicationContext context: Context): CoreDataNetworkProvider {
        return CoreDataNetworkProvider.getInstance(context)
    }

    @Provides
    @PrivateKey
    fun providePrivateKey(): String = "JUWk8OVbixl7KBn5AsGj08GSFN48kbQC"

    @Provides
    @ApiEndPoint
    fun provideApiEndPoint(): String = "https://api.nytimes.com/svc/"

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        queryInterceptor: QueryInterceptor
    ): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .addInterceptor(queryInterceptor)
        .build()

    @Provides
    fun provideRestAdapter(@ApiEndPoint apiEndPoint: String, okHttpClient: OkHttpClient): Retrofit {
        val moshi: Moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
        return Retrofit.Builder()
            .baseUrl(apiEndPoint)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpClient)
            .build()
    }
}

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class PrivateKey

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiEndPoint