package com.example.ppbjobsheet6.api

import com.example.ppbjobsheet6.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}