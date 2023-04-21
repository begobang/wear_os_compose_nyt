package com.nttdata.data.remoteDataSource

import com.nttdata.data.response.toDomain
import com.nttdata.data.services.GetFilmPicksService
import com.nttdata.domain.model.FilmPickBusiness
import com.rocket.android.core.data.network.datasource.BaseNetworkDatasource
import com.rocket.core.crashreporting.logger.CrashLogger
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetFilmPicksRemoteDataSource @Inject constructor(
    private val service: GetFilmPicksService,
    crashLogger: CrashLogger
): BaseNetworkDatasource(crashLogger) {
    fun getFilmPicks(): Either<Failure, List<FilmPickBusiness>>{
        return requestGenericApi(
            call = { service.getFilmPicks() },
            parserSuccess = { it?.results?.map { it.toDomain() } ?: emptyList() }
        )
    }
}