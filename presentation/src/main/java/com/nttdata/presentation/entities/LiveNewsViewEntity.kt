package com.nttdata.presentation.entities

import com.nttdata.domain.model.LiveNewsBusiness
import com.nttdata.domain.model.MultimediaBusiness

data class LiveNewsViewEntity(
    var slug_name: String = "",
    var section: String = "",
    var subsection: String = "",
    var title: String = "",
    var abstract: String = "",
    var uri: String = "",
    var url: String = "",
    var byline: String = "",
    var thumbnail_standard: String = "",
    var item_type: String = "",
    var source: String = "",
    var updated_date: String = "",
    var published_date: String = "",
    var first_published_date: String = "",
    var material_type_facet: String = "",
    var kicker: String = "",
    var subheadline: String = "",
    var des_facet: List<String>? = emptyList(),
    var org_facet: List<String>? = emptyList(),
    var per_facet: List<String>? = emptyList(),
    var geo_facet: List<String>? = emptyList(),
    var relatedUrls: List<String>? = emptyList(),
    var multimedia: List<MultimediaViewEntity>? = emptyList(),
    var liked: Boolean = false

)

data class MultimediaViewEntity(
    var url: String = "",
    var format: String = "",
    var height: Int = 0,
    var width: Int = 0,
    var type: String = "",
    var subtype: String = "",
    var caption: String = "",
    var copyright: String = "",
)

fun LiveNewsBusiness.toPresentation(): LiveNewsViewEntity = LiveNewsViewEntity(
    slug_name,
    section,
    subsection,
    title,
    abstract,
    uri,
    url,
    byline,
    thumbnail_standard,
    item_type,
    source,
    updated_date,
    published_date,
    first_published_date,
    material_type_facet,
    kicker,
    subheadline,
    des_facet,
    org_facet,
    per_facet,
    geo_facet,
    relatedUrls,
    multimedia?.map { it.toPresentation() }
)

fun MultimediaBusiness.toPresentation(): MultimediaViewEntity =
    MultimediaViewEntity(url, format, height, width, type, subtype, caption, copyright)