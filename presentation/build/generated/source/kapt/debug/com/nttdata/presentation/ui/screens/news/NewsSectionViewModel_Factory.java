package com.nttdata.presentation.ui.screens.news;

import com.nttdata.domain.sections.GetSections;
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
public final class NewsSectionViewModel_Factory implements Factory<NewsSectionViewModel> {
  private final Provider<GetSections> getSectionsProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public NewsSectionViewModel_Factory(Provider<GetSections> getSectionsProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.getSectionsProvider = getSectionsProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public NewsSectionViewModel get() {
    return newInstance(getSectionsProvider.get(), dispatcherProvider.get());
  }

  public static NewsSectionViewModel_Factory create(Provider<GetSections> getSectionsProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new NewsSectionViewModel_Factory(getSectionsProvider, dispatcherProvider);
  }

  public static NewsSectionViewModel newInstance(GetSections getSections,
      CoroutineDispatcher dispatcher) {
    return new NewsSectionViewModel(getSections, dispatcher);
  }
}
