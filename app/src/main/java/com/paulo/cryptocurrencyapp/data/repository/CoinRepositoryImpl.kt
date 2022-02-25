package com.paulo.cryptocurrencyapp.data.repository

import com.paulo.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.paulo.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.paulo.cryptocurrencyapp.data.remote.dto.CoinDto
import com.paulo.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinInt: String): CoinDetailDto {
        return api.getCoinById(coinInt)
    }

}