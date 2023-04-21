package com.nttdata.data.response

import com.google.gson.annotations.SerializedName
import com.nttdata.domain.model.LiveNewsBusiness
import com.nttdata.domain.model.MultimediaBusiness

data class LiveNewsResponse(
    @SerializedName("slug_name")
    var slug_name: String = "",
    @SerializedName("section")
    var section: String = "",
    @SerializedName("subsection")
    var subsection: String = "",
    @SerializedName("title")
    var title: String = "",
    @SerializedName("abstract")
    var abstract: String = "",
    @SerializedName("uri")
    var uri: String = "",
    @SerializedName("url")
    var url: String = "",
    @SerializedName("byline")
    var byline: String = "",
    @SerializedName("thumbnail_standard")
    var thumbnail_standard: String = "",
    @SerializedName("item_type")
    var item_type: String = "",
    @SerializedName("source")
    var source: String = "",
    @SerializedName("updated_date")
    var updated_date: String = "",
    @SerializedName("published_date")
    var published_date: String = "",
    @SerializedName("first_published_date")
    var first_published_date: String = "",
    @SerializedName("material_type_facet")
    var material_type_facet: String = "",
    @SerializedName("kicker")
    var kicker: String = "",
    @SerializedName("subheadline")
    var subheadline: String = "",
    @SerializedName("des_facet")
    var des_facet: List<String>? = emptyList(),
    @SerializedName("org_facet")
    var org_facet: List<String>? = emptyList(),
    @SerializedName("per_facet")
    var per_facet: List<String>? = emptyList(),
    @SerializedName("geo_facet")
    var geo_facet: List<String>? = emptyList(),
    @SerializedName("relatedUrls")
    var relatedUrls: List<String>? = emptyList(),
    @SerializedName("multimedia")
    var multimedia: List<MultimediaResponse>? = emptyList()

)

data class MultimediaResponse(
    @SerializedName("url")
    var url: String = "",
    @SerializedName("format")
    var format: String = "",
    @SerializedName("height")
    var height: Int = 0,
    @SerializedName("width")
    var width: Int = 0,
    @SerializedName("type")
    var type: String = "",
    @SerializedName("subtype")
    var subtype: String = "",
    @SerializedName("caption")
    var caption: String = "",
    @SerializedName("copyright")
    var copyright: String = "",
)

fun LiveNewsResponse.toDomain(): LiveNewsBusiness =
    LiveNewsBusiness(
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
        multimedia?.map { it.toDomain() }
    )


fun MultimediaResponse.toDomain(): MultimediaBusiness =
    MultimediaBusiness(url, format, height, width, type, subtype, caption, copyright)