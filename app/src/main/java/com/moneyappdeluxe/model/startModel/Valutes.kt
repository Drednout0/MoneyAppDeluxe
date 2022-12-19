package com.moneyappdeluxe.model.startModel

import com.google.gson.annotations.SerializedName

data class Valutes(
    @SerializedName("Valute")
    val valute: Map<String, ValuteItem>
)