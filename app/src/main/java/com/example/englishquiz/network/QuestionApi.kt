package com.example.englishquiz.network

import com.example.englishquiz.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {

    @GET("file/d/1544EvgrQ-QJ2PAPGv_ediWDsTnv8fFWL/view")
    suspend fun getAllQuestions(): Question
}