package com.nttdata.presentation.ui.screens.news.liveNews;

import com.nttdata.domain.liveNews.GetLiveNews;
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
public final class LiveNewsViewModel_Factory implements Factory<LiveNewsViewModel> {
  private final Provider<GetLiveNews> getLiveNewsProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LiveNewsViewModel_Factory(Provider<GetLiveNews> getLiveNewsProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.getLiveNewsProvider = getLiveNewsProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LiveNewsViewModel get() {
    return newInstance(getLiveNewsProvider.get(), dispatcherProvider.get());
  }

  public static LiveNewsViewModel_Factory create(Provider<GetLiveNews> getLiveNewsProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LiveNewsViewModel_Factory(getLiveNewsProvider, dispatcherProvider);
  }

  public static LiveNewsViewModel newInstance(GetLiveNews getLiveNews,
      CoroutineDispatcher dispatcher) {
    return new LiveNewsViewModel(getLiveNews, dispatcher);
  }
}
