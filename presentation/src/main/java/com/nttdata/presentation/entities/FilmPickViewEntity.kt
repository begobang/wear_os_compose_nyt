package com.nttdata.presentation.entities

import com.nttdata.domain.model.FilmPickBusiness
import com.nttdata.domain.model.FilmPickLinkBusiness
import com.nttdata.domain.model.FilmPickMultimediaBusiness

data class FilmPickViewEntity(
    val display_title: String?,
    val mpaa_rating: String?,
    val critics_pick: Int?,
    val byline: String?,
    val headline: String?,
    val summary_short: String?,
    val publication_date: String?,
    val opening_date: String?,
    val date_updated: String?,
    val link: FilmPickLinkViewEntity?,
    val multimedia: FilmPickMultimediaViewEntity?,
    var added: Boolean = false

    )

data class FilmPickLinkViewEntity(
    val type: String?,
    val url: String?,
    val suggested_link_text: String?
)

data class FilmPickMultimediaViewEntity(
    val type: String?,
    val src: String?,
    val height: String?,
    val width: String?
)

fun FilmPickBusiness.toPresentation() = FilmPickViewEntity(
    display_title,
    mpaa_rating,
    critics_pick,
    byline,
    headline,
    summary_short,
    publication_date,
    opening_date,
    date_updated,
    link?.toPresentation(),
    multimedia?.toPresentation()
)

fun FilmPickLinkBusiness.toPresentation() = FilmPickLinkViewEntity(
    type, url, suggested_link_text
)

fun FilmPickMultimediaBusiness.toPresentation() = FilmPickMultimediaViewEntity(
    type, src, height, width
)
