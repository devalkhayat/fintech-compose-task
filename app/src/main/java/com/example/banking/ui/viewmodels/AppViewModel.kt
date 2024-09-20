package com.example.banking.ui.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.banking.data.model.PopularPerson
import com.example.banking.data.model.Transaction
import com.example.banking.data.respositoriesImpl.AppImpl
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class AppViewModel: ViewModel() {

    private var appImpl:AppImpl = AppImpl()

    val popularListFlow=flow<ArrayList<PopularPerson>>{
        emit(appImpl.getPopulars())
      }
    val transactionListFlow=flow<ArrayList<Transaction>>{
        emit(appImpl.getTransactions())
    }



}