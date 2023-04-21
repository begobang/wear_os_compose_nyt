package com.nttdata.domain.sections;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/nttdata/domain/sections/GetSections;", "Lcom/rocket/core/domain/usecase/UseCase;", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/SectionBusiness;", "", "repository", "Lcom/nttdata/domain/sections/GetSectionsRepository;", "(Lcom/nttdata/domain/sections/GetSectionsRepository;)V", "run", "params", "(Ljava/lang/Integer;)Lcom/rocket/core/domain/functional/Either;", "domain_debug"})
public final class GetSections extends com.rocket.core.domain.usecase.UseCase<com.rocket.core.domain.functional.Either<? extends com.rocket.core.domain.error.Failure, ? extends java.util.List<? extends com.nttdata.domain.model.SectionBusiness>>, java.lang.Integer> {
    private final com.nttdata.domain.sections.GetSectionsRepository repository = null;
    
    @javax.inject.Inject
    public GetSections(@org.jetbrains.annotations.NotNull
    com.nttdata.domain.sections.GetSectionsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.SectionBusiness>> run(@org.jetbrains.annotations.Nullable
    java.lang.Integer params) {
        return null;
    }
}