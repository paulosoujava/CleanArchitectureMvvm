package com.paulo.cryptocurrencyapp.domain.repository

import com.paulo.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.paulo.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinInt: String): CoinDetailDto
}