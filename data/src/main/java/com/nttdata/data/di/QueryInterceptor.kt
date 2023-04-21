package com.nttdata.data.di

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class QueryInterceptor @Inject constructor(
    @PrivateKey private val privateKey: String
): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalUrl = original.url

        val url = originalUrl.newBuilder()
            .addQueryParameter("api-key", privateKey)
            .build()


        val request = original.newBuilder()
            .url(url)
            .build()

        return chain.proceed(request)

    }
}