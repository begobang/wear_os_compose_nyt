package com.nttdata.presentation.ui.screens.archive.archiveDetail;

import com.nttdata.domain.archive.GetArchive;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class ArchiveDetailViewModel_Factory implements Factory<ArchiveDetailViewModel> {
  private final Provider<GetArchive> getArchiveProvider;

  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  public ArchiveDetailViewModel_Factory(Provider<GetArchive> getArchiveProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    this.getArchiveProvider = getArchiveProvider;
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
  }

  @Override
  public ArchiveDetailViewModel get() {
    return newInstance(getArchiveProvider.get(), coroutineDispatcherProvider.get());
  }

  public static ArchiveDetailViewModel_Factory create(Provider<GetArchive> getArchiveProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    return new ArchiveDetailViewModel_Factory(getArchiveProvider, coroutineDispatcherProvider);
  }

  public static ArchiveDetailViewModel newInstance(GetArchive getArchive,
      CoroutineDispatcher coroutineDispatcher) {
    return new ArchiveDetailViewModel(getArchive, coroutineDispatcher);
  }
}
