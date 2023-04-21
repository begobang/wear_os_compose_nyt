package com.nttdata.data.remoteDataSource

import com.nttdata.data.response.toDomain
import com.nttdata.data.services.GetSectionsService
import com.nttdata.domain.model.SectionBusiness
import com.rocket.android.core.data.network.datasource.BaseNetworkDatasource
import com.rocket.core.crashreporting.logger.CrashLogger
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetSectionsRemoteDataSource @Inject constructor(
    private val service: GetSectionsService,
    crashLogger: CrashLogger
): BaseNetworkDatasource(crashLogger) {

    fun getSections(limit: Int): Either<Failure, List<SectionBusiness>>{
        return requestGenericApi(
            call = { service.getSectionsAsync(limit) },
            parserSuccess = { it?.results?.map { sections -> sections.toDomain() } ?: emptyList() }
        )
    }
}