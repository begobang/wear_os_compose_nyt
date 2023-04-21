package com.nttdata.presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.nttdata.presentation.IODispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresentationModuleDI_ProvideIODispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideIODispatcher();
  }

  public static PresentationModuleDI_ProvideIODispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideIODispatcher() {
    return Preconditions.checkNotNullFromProvides(PresentationModuleDI.INSTANCE.provideIODispatcher());
  }

  private static final class InstanceHolder {
    private static final PresentationModuleDI_ProvideIODispatcherFactory INSTANCE = new PresentationModuleDI_ProvideIODispatcherFactory();
  }
}
