package com.nttdata.presentation.entities

import com.nttdata.domain.model.*

data class ArchiveViewEntity(
    var lead_paragraph: String?,
    var multimedia: List<ArchiveMultimediaViewEntity>?,
    var headline: ArchiveHeadlineViewEntity?,
    var pub_date: String?,
    var section_name: String?,
    var subsection_name: String?,
    var byline: ArchiveBylineViewEntity?,
    var added: Boolean = false
)

data class ArchiveMultimediaViewEntity(
    var type: String?,
    var url: String?,
    var crop_name: String?
)

data class ArchiveHeadlineViewEntity(
    var print_headline: String?
)

data class ArchiveBylineViewEntity(
    var original: String?
)

fun ArchiveBusiness.toPresentation() = ArchiveViewEntity(
    lead_paragraph,
    multimedia?.map { it.toPresentation() },
    headline?.toPresentation(),
    pub_date,
    section_name,
    subsection_name,
    byline?.toPresentation(),
)

fun ArchiveMultimediaBusiness.toPresentation() = ArchiveMultimediaViewEntity(
    type, url, crop_name
)

fun ArchiveHeadlineBusiness.toPresentation() = ArchiveHeadlineViewEntity(print_headline)

fun ArchiveBylineBusiness.toPresentation() = ArchiveBylineViewEntity(original)


