package com.nttdata.domain.liveNews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ$\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nttdata/domain/liveNews/GetLiveNews;", "Lcom/rocket/core/domain/usecase/UseCase;", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/LiveNewsBusiness;", "Lcom/nttdata/domain/liveNews/LiveNewsInput;", "repository", "Lcom/nttdata/domain/liveNews/GetLiveNewsRepository;", "(Lcom/nttdata/domain/liveNews/GetLiveNewsRepository;)V", "run", "params", "domain_debug"})
@javax.inject.Singleton
public final class GetLiveNews extends com.rocket.core.domain.usecase.UseCase<com.rocket.core.domain.functional.Either<? extends com.rocket.core.domain.error.Failure, ? extends java.util.List<? extends com.nttdata.domain.model.LiveNewsBusiness>>, com.nttdata.domain.liveNews.LiveNewsInput> {
    private final com.nttdata.domain.liveNews.GetLiveNewsRepository repository = null;
    
    @javax.inject.Inject
    public GetLiveNews(@org.jetbrains.annotations.NotNull
    com.nttdata.domain.liveNews.GetLiveNewsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.LiveNewsBusiness>> run(@org.jetbrains.annotations.Nullable
    com.nttdata.domain.liveNews.LiveNewsInput params) {
        return null;
    }
}