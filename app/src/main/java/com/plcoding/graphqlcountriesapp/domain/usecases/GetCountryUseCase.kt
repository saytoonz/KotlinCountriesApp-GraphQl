package com.plcoding.graphqlcountriesapp.domain.usecases

import com.plcoding.graphqlcountriesapp.domain.CountryClient
import com.plcoding.graphqlcountriesapp.domain.data_models.DetailedCountry

class GetCountryUseCase(
    private val countryClient: CountryClient
) {
    suspend fun execute(code: String) : DetailedCountry? {
        return  countryClient
            .getCountry(code)

    }


}