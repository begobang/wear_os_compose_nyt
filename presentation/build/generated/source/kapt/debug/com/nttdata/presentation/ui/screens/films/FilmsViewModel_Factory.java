package com.nttdata.presentation.ui.screens.films;

import com.nttdata.domain.films.GetFilmPicks;
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
public final class FilmsViewModel_Factory implements Factory<FilmsViewModel> {
  private final Provider<GetFilmPicks> getFilmPicksProvider;

  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  public FilmsViewModel_Factory(Provider<GetFilmPicks> getFilmPicksProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    this.getFilmPicksProvider = getFilmPicksProvider;
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
  }

  @Override
  public FilmsViewModel get() {
    return newInstance(getFilmPicksProvider.get(), coroutineDispatcherProvider.get());
  }

  public static FilmsViewModel_Factory create(Provider<GetFilmPicks> getFilmPicksProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    return new FilmsViewModel_Factory(getFilmPicksProvider, coroutineDispatcherProvider);
  }

  public static FilmsViewModel newInstance(GetFilmPicks getFilmPicks,
      CoroutineDispatcher coroutineDispatcher) {
    return new FilmsViewModel(getFilmPicks, coroutineDispatcher);
  }
}
