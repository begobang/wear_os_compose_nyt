package com.nttdata.data.response

import com.google.gson.annotations.SerializedName
import com.nttdata.domain.model.SectionBusiness

data class SectionResponse(
    @SerializedName("section")
    val id: String,
    @SerializedName("display_name")
    var displayName: String
)

fun SectionResponse.toDomain(): SectionBusiness = SectionBusiness(id, displayName)



