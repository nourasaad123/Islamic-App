package com.example.domain.useCase

import com.example.domain.repository.QuranRepository

class SearchQuranUseCase(private val repository: QuranRepository) {
    suspend operator fun invoke(searchKey: String) = repository.searchQuran(searchKey)
}