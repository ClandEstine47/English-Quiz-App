package com.example.englishquiz.model


import com.google.gson.annotations.SerializedName

data class QuestionsItem(
    @SerializedName("correct_answer")
    val correctAnswer: String,
    @SerializedName("options")
    val options: List<String>,
    @SerializedName("question")
    val question: String
)