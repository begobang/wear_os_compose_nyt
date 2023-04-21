package com.nttdata.domain.sections;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/nttdata/domain/sections/GetSectionsRepository;", "", "getSections", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/SectionBusiness;", "limit", "", "domain_debug"})
public abstract interface GetSectionsRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.SectionBusiness>> getSections(int limit);
}