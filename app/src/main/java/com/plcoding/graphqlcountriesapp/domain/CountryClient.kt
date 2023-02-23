package com.plcoding.graphqlcountriesapp.domain

import com.plcoding.graphqlcountriesapp.domain.data_models.DetailedCountry
import com.plcoding.graphqlcountriesapp.domain.data_models.SimpleCountry

/* SOLID Abstractions */
interface CountryClient {
    suspend fun getCountries(): List<SimpleCountry>
    suspend fun getCountry(code: String): DetailedCountry?
}