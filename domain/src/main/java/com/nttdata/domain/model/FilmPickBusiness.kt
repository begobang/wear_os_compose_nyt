package com.nttdata.domain.model

data class FilmPickBusiness(
    val display_title: String?,
    val mpaa_rating: String?,
    val critics_pick: Int?,
    val byline: String?,
    val headline: String?,
    val summary_short: String?,
    val publication_date: String?,
    val opening_date: String?,
    val date_updated: String?,
    val link: FilmPickLinkBusiness?,
    val multimedia: FilmPickMultimediaBusiness?,

)

data class FilmPickLinkBusiness(
    val type: String?,
    val url: String?,
    val suggested_link_text: String?
)

data class FilmPickMultimediaBusiness(
    val type: String?,
    val src: String?,
    val height: String?,
    val width: String?
)