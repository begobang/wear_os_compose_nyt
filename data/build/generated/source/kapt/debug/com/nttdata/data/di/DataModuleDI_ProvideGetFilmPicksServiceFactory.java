// Generated by Dagger (https://dagger.dev).
package com.nttdata.data.di;

import com.nttdata.data.services.GetFilmPicksService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.nttdata.data.di.ApiEndPoint")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModuleDI_ProvideGetFilmPicksServiceFactory implements Factory<GetFilmPicksService> {
  private final DataModuleDI module;

  private final Provider<String> urlProvider;

  private final Provider<OkHttpClient> clientProvider;

  public DataModuleDI_ProvideGetFilmPicksServiceFactory(DataModuleDI module,
      Provider<String> urlProvider, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.urlProvider = urlProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public GetFilmPicksService get() {
    return provideGetFilmPicksService(module, urlProvider.get(), clientProvider.get());
  }

  public static DataModuleDI_ProvideGetFilmPicksServiceFactory create(DataModuleDI module,
      Provider<String> urlProvider, Provider<OkHttpClient> clientProvider) {
    return new DataModuleDI_ProvideGetFilmPicksServiceFactory(module, urlProvider, clientProvider);
  }

  public static GetFilmPicksService provideGetFilmPicksService(DataModuleDI instance, String url,
      OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetFilmPicksService(url, client));
  }
}