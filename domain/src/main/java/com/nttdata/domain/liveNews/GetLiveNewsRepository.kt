package com.nttdata.domain.liveNews

import com.nttdata.domain.model.LiveNewsBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either

interface GetLiveNewsRepository {
    fun getLiveNews(input: LiveNewsInput): Either<Failure, List<LiveNewsBusiness>>
}