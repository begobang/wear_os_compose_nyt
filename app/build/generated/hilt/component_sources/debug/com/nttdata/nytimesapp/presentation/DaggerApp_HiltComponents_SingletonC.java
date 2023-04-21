package com.nttdata.nytimesapp.presentation;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.nttdata.data.di.DataModuleDI;
import com.nttdata.data.di.DataModuleDI_ProvideApiEndPointFactory;
import com.nttdata.data.di.DataModuleDI_ProvideCoreDataNetworkProviderFactory;
import com.nttdata.data.di.DataModuleDI_ProvideCrashLoggerFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetArchiveRepositoryFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetArchiveServiceFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetFilmPicksRepositoryFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetFilmPicksServiceFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetLiveNewsRepositoryFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetLiveNewsServiceFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetSectionsRepositoryFactory;
import com.nttdata.data.di.DataModuleDI_ProvideGetSectionsServiceFactory;
import com.nttdata.data.di.DataModuleDI_ProvideLoggingInterceptorFactory;
import com.nttdata.data.di.DataModuleDI_ProvideOkHttpClientFactory;
import com.nttdata.data.di.DataModuleDI_ProvidePrivateKeyFactory;
import com.nttdata.data.di.QueryInterceptor;
import com.nttdata.data.remoteDataSource.GetArchiveRemoteDataSource;
import com.nttdata.data.remoteDataSource.GetFilmPicksRemoteDataSource;
import com.nttdata.data.remoteDataSource.GetLiveNewsRemoteDataSource;
import com.nttdata.data.remoteDataSource.GetSectionsRemoteDataSource;
import com.nttdata.data.services.GetArchiveService;
import com.nttdata.data.services.GetFilmPicksService;
import com.nttdata.data.services.GetLiveNewsService;
import com.nttdata.data.services.GetSectionsService;
import com.nttdata.domain.archive.GetArchive;
import com.nttdata.domain.archive.GetArchiveRepository;
import com.nttdata.domain.films.GetFilmPicks;
import com.nttdata.domain.films.GetFilmPicksRepository;
import com.nttdata.domain.liveNews.GetLiveNews;
import com.nttdata.domain.liveNews.GetLiveNewsRepository;
import com.nttdata.domain.sections.GetSections;
import com.nttdata.domain.sections.GetSectionsRepository;
import com.nttdata.presentation.MainActivity;
import com.nttdata.presentation.PresentationModuleDI;
import com.nttdata.presentation.PresentationModuleDI_ProvideIODispatcherFactory;
import com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveDetailViewModel;
import com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nttdata.presentation.ui.screens.films.FilmsViewModel;
import com.nttdata.presentation.ui.screens.films.FilmsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nttdata.presentation.ui.screens.news.NewsSectionViewModel;
import com.nttdata.presentation.ui.screens.news.NewsSectionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel;
import com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.rocket.android.core.data.network.di.CoreDataNetworkProvider;
import com.rocket.core.crashreporting.logger.CrashLogger;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DataModuleDI dataModuleDI;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder dataModuleDI(DataModuleDI dataModuleDI) {
      this.dataModuleDI = Preconditions.checkNotNull(dataModuleDI);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder presentationModuleDI(PresentationModuleDI presentationModuleDI) {
      Preconditions.checkNotNull(presentationModuleDI);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (dataModuleDI == null) {
        this.dataModuleDI = new DataModuleDI();
      }
      return new SingletonCImpl(applicationContextModule, dataModuleDI);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(ArchiveDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), FilmsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LiveNewsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NewsSectionViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<ArchiveDetailViewModel> archiveDetailViewModelProvider;

    private Provider<FilmsViewModel> filmsViewModelProvider;

    private Provider<LiveNewsViewModel> liveNewsViewModelProvider;

    private Provider<NewsSectionViewModel> newsSectionViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private GetArchive getArchive() {
      return new GetArchive(singletonCImpl.provideGetArchiveRepositoryProvider.get());
    }

    private GetFilmPicks getFilmPicks() {
      return new GetFilmPicks(singletonCImpl.provideGetFilmPicksRepositoryProvider.get());
    }

    private GetSections getSections() {
      return new GetSections(singletonCImpl.provideGetSectionsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.archiveDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.filmsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.liveNewsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.newsSectionViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>of("com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveDetailViewModel", ((Provider) archiveDetailViewModelProvider), "com.nttdata.presentation.ui.screens.films.FilmsViewModel", ((Provider) filmsViewModelProvider), "com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel", ((Provider) liveNewsViewModelProvider), "com.nttdata.presentation.ui.screens.news.NewsSectionViewModel", ((Provider) newsSectionViewModelProvider));
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveDetailViewModel 
          return (T) new ArchiveDetailViewModel(viewModelCImpl.getArchive(), PresentationModuleDI_ProvideIODispatcherFactory.provideIODispatcher());

          case 1: // com.nttdata.presentation.ui.screens.films.FilmsViewModel 
          return (T) new FilmsViewModel(viewModelCImpl.getFilmPicks(), PresentationModuleDI_ProvideIODispatcherFactory.provideIODispatcher());

          case 2: // com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel 
          return (T) new LiveNewsViewModel(singletonCImpl.getLiveNewsProvider.get(), PresentationModuleDI_ProvideIODispatcherFactory.provideIODispatcher());

          case 3: // com.nttdata.presentation.ui.screens.news.NewsSectionViewModel 
          return (T) new NewsSectionViewModel(viewModelCImpl.getSections(), PresentationModuleDI_ProvideIODispatcherFactory.provideIODispatcher());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final DataModuleDI dataModuleDI;

    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<GetArchiveService> provideGetArchiveServiceProvider;

    private Provider<CoreDataNetworkProvider> provideCoreDataNetworkProvider;

    private Provider<CrashLogger> provideCrashLoggerProvider;

    private Provider<GetArchiveRepository> provideGetArchiveRepositoryProvider;

    private Provider<GetFilmPicksService> provideGetFilmPicksServiceProvider;

    private Provider<GetFilmPicksRepository> provideGetFilmPicksRepositoryProvider;

    private Provider<GetLiveNewsService> provideGetLiveNewsServiceProvider;

    private Provider<GetLiveNewsRepository> provideGetLiveNewsRepositoryProvider;

    private Provider<GetLiveNews> getLiveNewsProvider;

    private Provider<GetSectionsService> provideGetSectionsServiceProvider;

    private Provider<GetSectionsRepository> provideGetSectionsRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        DataModuleDI dataModuleDIParam) {
      this.dataModuleDI = dataModuleDIParam;
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam, dataModuleDIParam);

    }

    private QueryInterceptor queryInterceptor() {
      return new QueryInterceptor(DataModuleDI_ProvidePrivateKeyFactory.providePrivateKey(dataModuleDI));
    }

    private OkHttpClient okHttpClient() {
      return DataModuleDI_ProvideOkHttpClientFactory.provideOkHttpClient(dataModuleDI, DataModuleDI_ProvideLoggingInterceptorFactory.provideLoggingInterceptor(dataModuleDI), queryInterceptor());
    }

    private GetArchiveRemoteDataSource getArchiveRemoteDataSource() {
      return new GetArchiveRemoteDataSource(provideGetArchiveServiceProvider.get(), provideCrashLoggerProvider.get());
    }

    private GetFilmPicksRemoteDataSource getFilmPicksRemoteDataSource() {
      return new GetFilmPicksRemoteDataSource(provideGetFilmPicksServiceProvider.get(), provideCrashLoggerProvider.get());
    }

    private GetLiveNewsRemoteDataSource getLiveNewsRemoteDataSource() {
      return new GetLiveNewsRemoteDataSource(provideGetLiveNewsServiceProvider.get(), provideCrashLoggerProvider.get());
    }

    private GetSectionsRemoteDataSource getSectionsRemoteDataSource() {
      return new GetSectionsRemoteDataSource(provideGetSectionsServiceProvider.get(), provideCrashLoggerProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final DataModuleDI dataModuleDIParam) {
      this.provideGetArchiveServiceProvider = DoubleCheck.provider(new SwitchingProvider<GetArchiveService>(singletonCImpl, 1));
      this.provideCoreDataNetworkProvider = DoubleCheck.provider(new SwitchingProvider<CoreDataNetworkProvider>(singletonCImpl, 3));
      this.provideCrashLoggerProvider = DoubleCheck.provider(new SwitchingProvider<CrashLogger>(singletonCImpl, 2));
      this.provideGetArchiveRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GetArchiveRepository>(singletonCImpl, 0));
      this.provideGetFilmPicksServiceProvider = DoubleCheck.provider(new SwitchingProvider<GetFilmPicksService>(singletonCImpl, 5));
      this.provideGetFilmPicksRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GetFilmPicksRepository>(singletonCImpl, 4));
      this.provideGetLiveNewsServiceProvider = DoubleCheck.provider(new SwitchingProvider<GetLiveNewsService>(singletonCImpl, 8));
      this.provideGetLiveNewsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GetLiveNewsRepository>(singletonCImpl, 7));
      this.getLiveNewsProvider = DoubleCheck.provider(new SwitchingProvider<GetLiveNews>(singletonCImpl, 6));
      this.provideGetSectionsServiceProvider = DoubleCheck.provider(new SwitchingProvider<GetSectionsService>(singletonCImpl, 10));
      this.provideGetSectionsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GetSectionsRepository>(singletonCImpl, 9));
    }

    @Override
    public void injectApp(App arg0) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.nttdata.domain.archive.GetArchiveRepository 
          return (T) DataModuleDI_ProvideGetArchiveRepositoryFactory.provideGetArchiveRepository(singletonCImpl.dataModuleDI, singletonCImpl.getArchiveRemoteDataSource());

          case 1: // com.nttdata.data.services.GetArchiveService 
          return (T) DataModuleDI_ProvideGetArchiveServiceFactory.provideGetArchiveService(singletonCImpl.dataModuleDI, DataModuleDI_ProvideApiEndPointFactory.provideApiEndPoint(singletonCImpl.dataModuleDI), singletonCImpl.okHttpClient());

          case 2: // com.rocket.core.crashreporting.logger.CrashLogger 
          return (T) DataModuleDI_ProvideCrashLoggerFactory.provideCrashLogger(singletonCImpl.dataModuleDI, singletonCImpl.provideCoreDataNetworkProvider.get());

          case 3: // com.rocket.android.core.data.network.di.CoreDataNetworkProvider 
          return (T) DataModuleDI_ProvideCoreDataNetworkProviderFactory.provideCoreDataNetworkProvider(singletonCImpl.dataModuleDI, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 4: // com.nttdata.domain.films.GetFilmPicksRepository 
          return (T) DataModuleDI_ProvideGetFilmPicksRepositoryFactory.provideGetFilmPicksRepository(singletonCImpl.dataModuleDI, singletonCImpl.getFilmPicksRemoteDataSource());

          case 5: // com.nttdata.data.services.GetFilmPicksService 
          return (T) DataModuleDI_ProvideGetFilmPicksServiceFactory.provideGetFilmPicksService(singletonCImpl.dataModuleDI, DataModuleDI_ProvideApiEndPointFactory.provideApiEndPoint(singletonCImpl.dataModuleDI), singletonCImpl.okHttpClient());

          case 6: // com.nttdata.domain.liveNews.GetLiveNews 
          return (T) new GetLiveNews(singletonCImpl.provideGetLiveNewsRepositoryProvider.get());

          case 7: // com.nttdata.domain.liveNews.GetLiveNewsRepository 
          return (T) DataModuleDI_ProvideGetLiveNewsRepositoryFactory.provideGetLiveNewsRepository(singletonCImpl.dataModuleDI, singletonCImpl.getLiveNewsRemoteDataSource());

          case 8: // com.nttdata.data.services.GetLiveNewsService 
          return (T) DataModuleDI_ProvideGetLiveNewsServiceFactory.provideGetLiveNewsService(singletonCImpl.dataModuleDI, DataModuleDI_ProvideApiEndPointFactory.provideApiEndPoint(singletonCImpl.dataModuleDI), singletonCImpl.okHttpClient());

          case 9: // com.nttdata.domain.sections.GetSectionsRepository 
          return (T) DataModuleDI_ProvideGetSectionsRepositoryFactory.provideGetSectionsRepository(singletonCImpl.dataModuleDI, singletonCImpl.getSectionsRemoteDataSource());

          case 10: // com.nttdata.data.services.GetSectionsService 
          return (T) DataModuleDI_ProvideGetSectionsServiceFactory.provideGetSectionsService(singletonCImpl.dataModuleDI, DataModuleDI_ProvideApiEndPointFactory.provideApiEndPoint(singletonCImpl.dataModuleDI), singletonCImpl.okHttpClient());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
