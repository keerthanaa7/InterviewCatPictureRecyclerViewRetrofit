package com.verkada.android.catpictures.network

import com.verkada.android.catpictures.data.Picture
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface PictureService {

    @GET("list")
    suspend fun pictures(
        @Query("page") page: Int = 1,
        @Query("limit") perPage: Int = PER_PAGE_COUNT
    ): List<Picture>

    companion object {
        private const val PER_PAGE_COUNT = 30
        const val ROOT_URL = "https://picsum.photos/v2/"
    }

    @GET("list")
    fun getPicturesList(
        @Query("page") page: Int = 1,
        @Query("limit") perPage: Int = PER_PAGE_COUNT
    ): Call<List<Picture>>
}
