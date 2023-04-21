package com.nttdata.data.remoteDataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/nttdata/data/remoteDataSource/GetSectionsRemoteDataSource;", "Lcom/rocket/android/core/data/network/datasource/BaseNetworkDatasource;", "service", "Lcom/nttdata/data/services/GetSectionsService;", "crashLogger", "Lcom/rocket/core/crashreporting/logger/CrashLogger;", "(Lcom/nttdata/data/services/GetSectionsService;Lcom/rocket/core/crashreporting/logger/CrashLogger;)V", "getSections", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/SectionBusiness;", "limit", "", "data_debug"})
public final class GetSectionsRemoteDataSource extends com.rocket.android.core.data.network.datasource.BaseNetworkDatasource {
    private final com.nttdata.data.services.GetSectionsService service = null;
    
    @javax.inject.Inject()
    public GetSectionsRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.nttdata.data.services.GetSectionsService service, @org.jetbrains.annotations.NotNull()
    com.rocket.core.crashreporting.logger.CrashLogger crashLogger) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.SectionBusiness>> getSections(int limit) {
        return null;
    }
}