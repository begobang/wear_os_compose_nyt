// Generated by Dagger (https://dagger.dev).
package com.nttdata.data.remoteDataSource;

import com.nttdata.data.services.GetArchiveService;
import com.rocket.core.crashreporting.logger.CrashLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetArchiveRemoteDataSource_Factory implements Factory<GetArchiveRemoteDataSource> {
  private final Provider<GetArchiveService> serviceProvider;

  private final Provider<CrashLogger> crashLoggerProvider;

  public GetArchiveRemoteDataSource_Factory(Provider<GetArchiveService> serviceProvider,
      Provider<CrashLogger> crashLoggerProvider) {
    this.serviceProvider = serviceProvider;
    this.crashLoggerProvider = crashLoggerProvider;
  }

  @Override
  public GetArchiveRemoteDataSource get() {
    return newInstance(serviceProvider.get(), crashLoggerProvider.get());
  }

  public static GetArchiveRemoteDataSource_Factory create(
      Provider<GetArchiveService> serviceProvider, Provider<CrashLogger> crashLoggerProvider) {
    return new GetArchiveRemoteDataSource_Factory(serviceProvider, crashLoggerProvider);
  }

  public static GetArchiveRemoteDataSource newInstance(GetArchiveService service,
      CrashLogger crashLogger) {
    return new GetArchiveRemoteDataSource(service, crashLogger);
  }
}
