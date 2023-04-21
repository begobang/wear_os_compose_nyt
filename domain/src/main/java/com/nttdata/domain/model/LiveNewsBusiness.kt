package com.nttdata.domain.model

data class LiveNewsBusiness(
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
    var multimedia: List<MultimediaBusiness>? = emptyList(),
    var liked: Boolean = false

)

data class MultimediaBusiness(
    var url: String = "",
    var format: String = "",
    var height: Int = 0,
    var width: Int = 0,
    var type: String = "",
    var subtype: String = "",
    var caption: String = "",
    var copyright: String = "",
)