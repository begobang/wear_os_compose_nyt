package com.nttdata.domain.films

import com.nttdata.domain.model.FilmPickBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either

interface GetFilmPicksRepository {
    fun getFilmPicks(): Either<Failure, List<FilmPickBusiness>>
}