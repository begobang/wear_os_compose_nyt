package com.nttdata.domain.model

data class ArchiveBusiness(
    var lead_paragraph: String?,
    var multimedia: List<ArchiveMultimediaBusiness>?,
    var headline: ArchiveHeadlineBusiness?,
    var pub_date: String?,
    var section_name: String?,
    var subsection_name: String?,
    var byline: ArchiveBylineBusiness?,
)

data class ArchiveMultimediaBusiness(
    var type: String?,
    var url: String?,
    var crop_name: String?
)

data class ArchiveHeadlineBusiness(
    var print_headline: String?,
)

data class ArchiveBylineBusiness(
    var original: String?
)

