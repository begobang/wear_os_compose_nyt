package com.nttdata.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0017H\u0007J\u001a\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020!H\u0007J\u001a\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010$\u001a\u00020%H\u0007J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0007J\b\u0010*\u001a\u00020\u0004H\u0007J\u001a\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0014H\u0007\u00a8\u0006/"}, d2 = {"Lcom/nttdata/data/di/DataModuleDI;", "", "()V", "provideApiEndPoint", "", "provideCoreDataNetworkProvider", "Lcom/rocket/android/core/data/network/di/CoreDataNetworkProvider;", "context", "Landroid/content/Context;", "provideCrashLogger", "Lcom/rocket/core/crashreporting/logger/CrashLogger;", "provider", "provideGetArchiveRepository", "Lcom/nttdata/domain/archive/GetArchiveRepository;", "remoteDataSource", "Lcom/nttdata/data/remoteDataSource/GetArchiveRemoteDataSource;", "provideGetArchiveService", "Lcom/nttdata/data/services/GetArchiveService;", "url", "client", "Lokhttp3/OkHttpClient;", "provideGetFilmPicksRepository", "Lcom/nttdata/domain/films/GetFilmPicksRepository;", "Lcom/nttdata/data/remoteDataSource/GetFilmPicksRemoteDataSource;", "provideGetFilmPicksService", "Lcom/nttdata/data/services/GetFilmPicksService;", "provideGetLiveNewsRepository", "Lcom/nttdata/domain/liveNews/GetLiveNewsRepository;", "Lcom/nttdata/data/remoteDataSource/GetLiveNewsRemoteDataSource;", "provideGetLiveNewsService", "Lcom/nttdata/data/services/GetLiveNewsService;", "provideGetSectionsRepository", "Lcom/nttdata/domain/sections/GetSectionsRepository;", "Lcom/nttdata/data/remoteDataSource/GetSectionsRemoteDataSource;", "provideGetSectionsService", "Lcom/nttdata/data/services/GetSectionsService;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "loggingInterceptor", "queryInterceptor", "Lcom/nttdata/data/di/QueryInterceptor;", "providePrivateKey", "provideRestAdapter", "Lretrofit2/Retrofit;", "apiEndPoint", "okHttpClient", "data_debug"})
@dagger.Module
public final class DataModuleDI {
    
    public DataModuleDI() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.data.services.GetSectionsService provideGetSectionsService(@org.jetbrains.annotations.NotNull
    @ApiEndPoint
    java.lang.String url, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.data.services.GetLiveNewsService provideGetLiveNewsService(@org.jetbrains.annotations.NotNull
    @ApiEndPoint
    java.lang.String url, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.data.services.GetArchiveService provideGetArchiveService(@org.jetbrains.annotations.NotNull
    @ApiEndPoint
    java.lang.String url, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.data.services.GetFilmPicksService provideGetFilmPicksService(@org.jetbrains.annotations.NotNull
    @ApiEndPoint
    java.lang.String url, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.domain.sections.GetSectionsRepository provideGetSectionsRepository(@org.jetbrains.annotations.NotNull
    com.nttdata.data.remoteDataSource.GetSectionsRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.domain.liveNews.GetLiveNewsRepository provideGetLiveNewsRepository(@org.jetbrains.annotations.NotNull
    com.nttdata.data.remoteDataSource.GetLiveNewsRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.domain.archive.GetArchiveRepository provideGetArchiveRepository(@org.jetbrains.annotations.NotNull
    com.nttdata.data.remoteDataSource.GetArchiveRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nttdata.domain.films.GetFilmPicksRepository provideGetFilmPicksRepository(@org.jetbrains.annotations.NotNull
    com.nttdata.data.remoteDataSource.GetFilmPicksRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.rocket.core.crashreporting.logger.CrashLogger provideCrashLogger(@org.jetbrains.annotations.NotNull
    com.rocket.android.core.data.network.di.CoreDataNetworkProvider provider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.rocket.android.core.data.network.di.CoreDataNetworkProvider provideCoreDataNetworkProvider(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @PrivateKey
    @dagger.Provides
    public final java.lang.String providePrivateKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @ApiEndPoint
    @dagger.Provides
    public final java.lang.String provideApiEndPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull
    com.nttdata.data.di.QueryInterceptor queryInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final retrofit2.Retrofit provideRestAdapter(@org.jetbrains.annotations.NotNull
    @ApiEndPoint
    java.lang.String apiEndPoint, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}