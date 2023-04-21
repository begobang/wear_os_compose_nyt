package com.nttdata.data.repositoryImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nttdata/data/repositoryImpl/GetArchiveRepositoryImpl;", "Lcom/nttdata/domain/archive/GetArchiveRepository;", "remoteDataSource", "Lcom/nttdata/data/remoteDataSource/GetArchiveRemoteDataSource;", "(Lcom/nttdata/data/remoteDataSource/GetArchiveRemoteDataSource;)V", "getArchive", "Lcom/rocket/core/domain/functional/Either;", "Lcom/rocket/core/domain/error/Failure;", "", "Lcom/nttdata/domain/model/ArchiveBusiness;", "input", "Lcom/nttdata/domain/archive/ArchiveInput;", "data_debug"})
public final class GetArchiveRepositoryImpl implements com.nttdata.domain.archive.GetArchiveRepository {
    private final com.nttdata.data.remoteDataSource.GetArchiveRemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject
    public GetArchiveRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.nttdata.data.remoteDataSource.GetArchiveRemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rocket.core.domain.functional.Either<com.rocket.core.domain.error.Failure, java.util.List<com.nttdata.domain.model.ArchiveBusiness>> getArchive(@org.jetbrains.annotations.NotNull
    com.nttdata.domain.archive.ArchiveInput input) {
        return null;
    }
}