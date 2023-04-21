package com.nttdata.domain.archive

import com.nttdata.domain.model.ArchiveBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import com.rocket.core.domain.usecase.UseCase
import javax.inject.Inject

class GetArchive @Inject constructor(
    private val repository: GetArchiveRepository
): UseCase<Either<Failure, List<ArchiveBusiness>>, ArchiveInput>() {
    override fun run(params: ArchiveInput?): Either<Failure, List<ArchiveBusiness>> {
        return repository.getArchive(params ?: ArchiveInput("2022", "12"))
    }
}