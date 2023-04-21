package com.nttdata.data.remoteDataSource

import com.nttdata.data.request.ArchiveRequest
import com.nttdata.data.response.toDomain
import com.nttdata.data.services.GetArchiveService
import com.nttdata.domain.model.ArchiveBusiness
import com.rocket.android.core.data.network.datasource.BaseNetworkDatasource
import com.rocket.core.crashreporting.logger.CrashLogger
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetArchiveRemoteDataSource @Inject constructor(
    private val service: GetArchiveService,
    crashLogger: CrashLogger
): BaseNetworkDatasource(crashLogger) {

    fun getArchive(request: ArchiveRequest): Either<Failure, List<ArchiveBusiness>>{
        return requestGenericApi(
            call = { service.getArchive(request.year, request.month) },
            parserSuccess = { it?.response?.docs?.map { archive -> archive.toDomain() } ?: emptyList() }
        )
    }
}