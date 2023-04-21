package com.nttdata.domain.liveNews

import com.nttdata.domain.model.LiveNewsBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import com.rocket.core.domain.usecase.UseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetLiveNews @Inject constructor(private val repository: GetLiveNewsRepository) :
    UseCase<Either<Failure, List<LiveNewsBusiness>>, LiveNewsInput>() {
    override fun run(params: LiveNewsInput?): Either<Failure, List<LiveNewsBusiness>> {
        return repository.getLiveNews(params!!)
    }
}