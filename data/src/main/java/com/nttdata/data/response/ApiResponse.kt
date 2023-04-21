package com.nttdata.data.response

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    @SerializedName("copyright")
    var copyright: String,
    @SerializedName("response")
    var response: ApiResponseItem<T>,
)

data class ApiResponseItem<T>(
    @SerializedName("docs")
    var docs: List<T>,
    @SerializedName("meta")
    var meta: ApiMeta

)

data class ApiMeta(
    @SerializedName("hits")
    var hits: Int
)
