package com.example.androidcleanarchitecture.domain.usecase

import com.example.androidcleanarchitecture.domain.model.News
import com.example.androidcleanarchitecture.domain.repository.NewsRepository
import javax.inject.Inject

/* todo Created by Tejas Dani on 13/Dec/23
       usecase class to get newsdetails from repository NewsRepository because Use Cases interact
       with repositories (implementations of interfaces defined in the domain layer)*/

class GetNewsListUseCase @Inject constructor(private val newsRepository: NewsRepository) {

    suspend fun getNewsList(): Result<List<News>> {

        return newsRepository.getNewsList()
    }
}