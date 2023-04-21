package com.nttdata.data.response

import com.google.gson.annotations.SerializedName
import com.nttdata.domain.model.FilmPickBusiness
import com.nttdata.domain.model.FilmPickLinkBusiness
import com.nttdata.domain.model.FilmPickMultimediaBusiness

data class FilmPickResponse(
    @SerializedName("display_title")
    val display_title: String?,
    @SerializedName("mpaa_rating")
    val mpaa_rating: String?,
    @SerializedName("critics_pick")
    val critics_pick: Int?,
    @SerializedName("byline")
    val byline: String?,
    @SerializedName("headline")
    val headline: String?,
    @SerializedName("summary_short")
    val summary_short: String?,
    @SerializedName("publication_date")
    val publication_date: String?,
    @SerializedName("opening_date")
    val opening_date: String?,
    @SerializedName("date_updated")
    val date_updated: String?,
    @SerializedName("link")
    val link: FilmPickLinkResponse?,
    @SerializedName("multimedia")
    val multimedia: FilmPickMultimediaResponse?,

    )

data class FilmPickLinkResponse(
    @SerializedName("type")
    val type: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("suggested_link_text")
    val suggested_link_text: String?
)

data class FilmPickMultimediaResponse(
    @SerializedName("type")
    val type: String?,
    @SerializedName("src")
    val src: String?,
    @SerializedName("height")
    val height: String?,
    @SerializedName("width")
    val width: String?
)

fun FilmPickResponse.toDomain() = FilmPickBusiness(
    display_title,
    mpaa_rating,
    critics_pick,
    byline,
    headline,
    summary_short,
    publication_date,
    opening_date,
    date_updated,
    link?.toDomain(),
    multimedia?.toDomain()
)

fun FilmPickLinkResponse.toDomain() = FilmPickLinkBusiness(
    type, url, suggested_link_text
)

fun FilmPickMultimediaResponse.toDomain() = FilmPickMultimediaBusiness(
    type, src, height, width
)
