package com.nttdata.data.repositoryImpl

import com.nttdata.data.remoteDataSource.GetFilmPicksRemoteDataSource
import com.nttdata.domain.films.GetFilmPicksRepository
import com.nttdata.domain.model.FilmPickBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetFilmPicksRepositoryImpl @Inject constructor(
    private val remoteDataSource: GetFilmPicksRemoteDataSource
): GetFilmPicksRepository {
    override fun getFilmPicks(): Either<Failure, List<FilmPickBusiness>> {
        return remoteDataSource.getFilmPicks()
    }
}