package com.moneyappdeluxe.data.repository

import com.moneyappdeluxe.data.api.RetrofitInstance
import com.moneyappdeluxe.model.startModel.ValuteItem
import com.moneyappdeluxe.model.startModel.Valutes
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<ValuteItem>{
        return RetrofitInstance.api.getMoney()
    }
}