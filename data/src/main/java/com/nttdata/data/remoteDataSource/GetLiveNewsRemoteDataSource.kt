package com.nttdata.data.remoteDataSource

import com.nttdata.data.request.LiveNewsRequest
import com.nttdata.data.response.toDomain
import com.nttdata.data.services.GetLiveNewsService
import com.nttdata.domain.model.LiveNewsBusiness
import com.rocket.android.core.data.network.datasource.BaseNetworkDatasource
import com.rocket.core.crashreporting.logger.CrashLogger
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetLiveNewsRemoteDataSource @Inject constructor(
    private val service: GetLiveNewsService,
    crashLogger: CrashLogger
): BaseNetworkDatasource(crashLogger) {

    fun getLiveNews(request: LiveNewsRequest): Either<Failure, List<LiveNewsBusiness>>{
        return requestGenericApi(
            call = { service.getLiveNewsAsync(request.sectionId, request.limit) },
            parserSuccess = { it?.results?.map { liveNews -> liveNews.toDomain() } ?: emptyList() }
        )
    }

}