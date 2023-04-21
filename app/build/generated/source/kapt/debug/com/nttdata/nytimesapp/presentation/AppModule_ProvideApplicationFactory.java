package com.nttdata.nytimesapp.presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApplicationFactory implements Factory<App> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public App get() {
    return provideApplication(module);
  }

  public static AppModule_ProvideApplicationFactory create(AppModule module) {
    return new AppModule_ProvideApplicationFactory(module);
  }

  public static App provideApplication(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideApplication());
  }
}
