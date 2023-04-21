package com.nttdata.data.repositoryImpl

import com.nttdata.data.remoteDataSource.GetLiveNewsRemoteDataSource
import com.nttdata.data.request.LiveNewsRequest
import com.nttdata.domain.liveNews.GetLiveNewsRepository
import com.nttdata.domain.liveNews.LiveNewsInput
import com.nttdata.domain.model.LiveNewsBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetLiveNewsRepositoryImpl @Inject constructor(
    private val remoteDataSource: GetLiveNewsRemoteDataSource
): GetLiveNewsRepository {
    override fun getLiveNews(input: LiveNewsInput): Either<Failure, List<LiveNewsBusiness>> {
        val request = LiveNewsRequest(
            input.sectionId,
            input.limit
        )
        return remoteDataSource.getLiveNews(request)
    }
}