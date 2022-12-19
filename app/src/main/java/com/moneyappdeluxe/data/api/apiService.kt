package com.moneyappdeluxe.data.api

import com.moneyappdeluxe.model.startModel.Valutes
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
     @GET("daily_json.js")
    suspend fun getMoney() : Response<ValuteItem>
}