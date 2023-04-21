// Generated by Dagger (https://dagger.dev).
package com.nttdata.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata("com.nttdata.data.di.ApiEndPoint")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModuleDI_ProvideRestAdapterFactory implements Factory<Retrofit> {
  private final DataModuleDI module;

  private final Provider<String> apiEndPointProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public DataModuleDI_ProvideRestAdapterFactory(DataModuleDI module,
      Provider<String> apiEndPointProvider, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.apiEndPointProvider = apiEndPointProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRestAdapter(module, apiEndPointProvider.get(), okHttpClientProvider.get());
  }

  public static DataModuleDI_ProvideRestAdapterFactory create(DataModuleDI module,
      Provider<String> apiEndPointProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new DataModuleDI_ProvideRestAdapterFactory(module, apiEndPointProvider, okHttpClientProvider);
  }

  public static Retrofit provideRestAdapter(DataModuleDI instance, String apiEndPoint,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.provideRestAdapter(apiEndPoint, okHttpClient));
  }
}
