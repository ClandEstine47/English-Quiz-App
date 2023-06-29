package com.example.englishquiz.model

data class QuestionItem(
    val correct_answer: String,
    val options: List<String>,
    val question: String
)