package com.example.banking.domain

import com.example.banking.data.model.PopularPerson
import com.example.banking.data.model.Transaction
import kotlinx.coroutines.flow.Flow

interface AppRepo {
    fun getPopulars(): ArrayList<PopularPerson>
    fun getTransactions():ArrayList<Transaction>
}