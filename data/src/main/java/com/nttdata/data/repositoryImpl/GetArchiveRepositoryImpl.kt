package com.nttdata.data.repositoryImpl

import com.nttdata.data.remoteDataSource.GetArchiveRemoteDataSource
import com.nttdata.data.request.ArchiveRequest
import com.nttdata.domain.archive.ArchiveInput
import com.nttdata.domain.archive.GetArchiveRepository
import com.nttdata.domain.model.ArchiveBusiness
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetArchiveRepositoryImpl @Inject constructor(
    private val remoteDataSource: GetArchiveRemoteDataSource,
): GetArchiveRepository {
    override fun getArchive(input: ArchiveInput): Either<Failure, List<ArchiveBusiness>> {
        val request = ArchiveRequest(
            input.year,
            input.month
        )
        return remoteDataSource.getArchive(request)
    }
}