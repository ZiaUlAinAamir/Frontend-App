package com.example.frontend.model

data class CourseModule(
    val id: String,
    val title: String,
    val description: String,
    val category: String, // "HTML" or "CSS"
    val iconName: String,
    val lessons: List<Lesson>
)

data class Lesson(
    val id: String,
    val title: String,
    val summary: String,
    val content: String,
    val codeExample: String,
    val keyTakeaways: List<String>
)

data class QuizQuestion(
    val id: String,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

data class CodeTemplate(
    val id: String,
    val title: String,
    val description: String,
    val htmlCode: String,
    val cssCode: String
)
