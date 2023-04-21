package com.nttdata.data.response

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.JsonClass

data class ApiResults<T>(
    @SerializedName("status")
    var status: String,
    @SerializedName("copyright")
    var copyright: String,
    @SerializedName("num_results")
    var num_results: Int,
    @SerializedName("results")
    var results: List<T>
)
