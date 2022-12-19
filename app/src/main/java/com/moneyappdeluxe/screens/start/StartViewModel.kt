package com.moneyappdeluxe.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moneyappdeluxe.data.repository.Repository
import com.moneyappdeluxe.model.startModel.ValuteItem
import com.moneyappdeluxe.model.startModel.Valutes
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {
    private var repo = Repository()
    val moneyList:MutableLiveData<Response<ValuteItem>> = MutableLiveData()
    fun getNalMoney(){
        viewModelScope.launch {
            moneyList.value = repo.getNal()
        }
    }
}
