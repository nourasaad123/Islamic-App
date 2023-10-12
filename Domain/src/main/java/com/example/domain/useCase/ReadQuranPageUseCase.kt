package com.example.domain.useCase

import com.example.domain.repository.QuranRepository

class ReadQuranPageUseCase( private val repository: QuranRepository) {
    suspend operator fun invoke(pageNumber:Int)=repository.getQuranPage(pageNumber)
}