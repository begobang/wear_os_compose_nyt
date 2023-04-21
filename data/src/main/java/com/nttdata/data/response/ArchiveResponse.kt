package com.nttdata.data.response

import com.google.gson.annotations.SerializedName
import com.nttdata.domain.model.*

data class ArchiveResponse(
    @SerializedName("lead_paragraph")
    var lead_paragraph: String?,
    @SerializedName("multimedia")
    var multimedia: List<ArchiveMultimediaResponse>?,
    @SerializedName("headline")
    var headline: ArchiveHeadlineResponse?,
    @SerializedName("pub_date")
    var pub_date: String?,
    @SerializedName("section_name")
    var section_name: String?,
    @SerializedName("subsection_name")
    var subsection_name: String?,
    @SerializedName("byline")
    var byline: ArchiveBylineResponse?,
)

data class ArchiveMultimediaResponse(
    @SerializedName("type")
    var type: String?,
    @SerializedName("url")
    var url: String?,
    @SerializedName("crop_name")
    var crop_name: String?
)

data class ArchiveHeadlineResponse(
    @SerializedName("print_headline")
    var print_headline: String?
)

data class ArchiveBylineResponse(
    @SerializedName("original")
    var original: String?
)

fun ArchiveResponse.toDomain(): ArchiveBusiness {
    return ArchiveBusiness(
        lead_paragraph,
        multimedia?.map { it.toDomain() },
        headline?.toDomain(),
        pub_date,
        section_name,
        subsection_name,
        byline?.toDomain(),
    )
}

fun ArchiveMultimediaResponse.toDomain() =
    ArchiveMultimediaBusiness(
        type, url, crop_name
    )

fun ArchiveHeadlineResponse.toDomain() = ArchiveHeadlineBusiness(print_headline)

fun ArchiveBylineResponse.toDomain() = ArchiveBylineBusiness(original)
