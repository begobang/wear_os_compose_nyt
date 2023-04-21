package com.nttdata.domain.films

import com.nttdata.domain.model.FilmPickBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import com.rocket.core.domain.usecase.UseCase
import javax.inject.Inject

class GetFilmPicks @Inject constructor(
    private val repository: GetFilmPicksRepository
): UseCase<Either<Failure, List<FilmPickBusiness>>, Unit>() {
    override fun run(params: Unit?): Either<Failure, List<FilmPickBusiness>> {
        return repository.getFilmPicks()
    }
}