package com.nttdata.data.repositoryImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/nttdata/data/repositoryImpl/GetFilmPicksRepositoryImpl;", "Lcom/nttdata/domain/films/GetFilmPicksRepository;", "remoteDataSource", "Lcom/nttdata/data/remoteDataSource/GetFilmPicksRemoteDataSource;", "(Lcom/nttdata/data/remoteDataSource/GetFilmPicksRemoteDataSource;)V", "getFilmPicks", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/FilmPickBusiness;", "data_debug"})
public final class GetFilmPicksRepositoryImpl implements com.nttdata.domain.films.GetFilmPicksRepository {
    private final com.nttdata.data.remoteDataSource.GetFilmPicksRemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject()
    public GetFilmPicksRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.nttdata.data.remoteDataSource.GetFilmPicksRemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.FilmPickBusiness>> getFilmPicks() {
        return null;
    }
}