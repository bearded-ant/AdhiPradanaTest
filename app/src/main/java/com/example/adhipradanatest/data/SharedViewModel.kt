package com.example.adhipradanatest.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.adhipradanatest.model.FlashSaleList
import com.example.adhipradanatest.model.LatestList
import kotlinx.coroutines.launch

class SharedViewModel : ViewModel() {

    private val repository: SharedRepository = SharedRepository()

    private val _latestDealLivedata = MutableLiveData<LatestList?>()
    val latestDealLiveData: LiveData<LatestList?> = _latestDealLivedata

    fun refreshLatestDeal() {
        viewModelScope.launch {
            _latestDealLivedata.postValue(repository.getLatestDeal())
        }
    }

    private val _flashSaleLivedata = MutableLiveData<FlashSaleList?>()
    val flashSaleLiveData: LiveData<FlashSaleList?> = _flashSaleLivedata

    fun refreshFlashSale() {
        viewModelScope.launch {
            _flashSaleLivedata.postValue(repository.getFlashSale())
        }
    }
}