// Generated by Dagger (https://dagger.dev).
package com.nttdata.data.di;

import com.nttdata.data.services.GetSectionsService;
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
public final class DataModuleDI_ProvideGetSectionsServiceFactory implements Factory<GetSectionsService> {
  private final DataModuleDI module;

  private final Provider<String> urlProvider;

  private final Provider<OkHttpClient> clientProvider;

  public DataModuleDI_ProvideGetSectionsServiceFactory(DataModuleDI module,
      Provider<String> urlProvider, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.urlProvider = urlProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public GetSectionsService get() {
    return provideGetSectionsService(module, urlProvider.get(), clientProvider.get());
  }

  public static DataModuleDI_ProvideGetSectionsServiceFactory create(DataModuleDI module,
      Provider<String> urlProvider, Provider<OkHttpClient> clientProvider) {
    return new DataModuleDI_ProvideGetSectionsServiceFactory(module, urlProvider, clientProvider);
  }

  public static GetSectionsService provideGetSectionsService(DataModuleDI instance, String url,
      OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetSectionsService(url, client));
  }
}
