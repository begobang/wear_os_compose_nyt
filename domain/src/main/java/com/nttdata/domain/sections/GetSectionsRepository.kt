package com.nttdata.domain.sections

import com.nttdata.domain.model.SectionBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either

interface GetSectionsRepository {
    fun getSections(limit: Int): Either<Failure, List<SectionBusiness>>
}