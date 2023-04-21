package com.nttdata.data.repositoryImpl

import com.nttdata.data.remoteDataSource.GetSectionsRemoteDataSource
import com.nttdata.domain.model.SectionBusiness
import com.nttdata.domain.sections.GetSectionsRepository
import com.rocket.core.domain.error.Failure
import com.rocket.core.domain.functional.Either
import javax.inject.Inject

class GetSectionsRepositoryImpl @Inject constructor(
    private val remoteDataSource: GetSectionsRemoteDataSource
): GetSectionsRepository {
    override fun getSections(limit: Int): Either<Failure, List<SectionBusiness>> {
        return remoteDataSource.getSections(limit)
    }
}