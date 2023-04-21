package com.nttdata.domain.films;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/nttdata/domain/films/GetFilmPicksRepository;", "", "getFilmPicks", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/FilmPickBusiness;", "domain_debug"})
public abstract interface GetFilmPicksRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.FilmPickBusiness>> getFilmPicks();
}