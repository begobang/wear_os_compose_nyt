// Generated by Dagger (https://dagger.dev).
package com.nttdata.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("com.nttdata.data.di.ApiEndPoint")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModuleDI_ProvideApiEndPointFactory implements Factory<String> {
  private final DataModuleDI module;

  public DataModuleDI_ProvideApiEndPointFactory(DataModuleDI module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideApiEndPoint(module);
  }

  public static DataModuleDI_ProvideApiEndPointFactory create(DataModuleDI module) {
    return new DataModuleDI_ProvideApiEndPointFactory(module);
  }

  public static String provideApiEndPoint(DataModuleDI instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiEndPoint());
  }
}