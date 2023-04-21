package com.nttdata.domain.sections

import com.nttdata.domain.model.SectionBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import com.rocket.core.domain.usecase.UseCase
import javax.inject.Inject

class GetSections @Inject constructor(
    private val repository: GetSectionsRepository
): UseCase<Either<Failure, List<SectionBusiness>>, Int>() {
    override fun run(params: Int?): Either<Failure, List<SectionBusiness>> {
        return repository.getSections(params ?: 50)
    }
}