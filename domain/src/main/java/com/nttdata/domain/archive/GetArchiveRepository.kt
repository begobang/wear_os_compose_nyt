package com.nttdata.domain.archive

import com.nttdata.domain.model.ArchiveBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either

interface GetArchiveRepository {
    fun getArchive(input: ArchiveInput): Either<Failure, List<ArchiveBusiness>>
}