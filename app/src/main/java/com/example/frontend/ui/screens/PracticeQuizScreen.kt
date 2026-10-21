package com.example.frontend.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontend.data.CourseRepository
import com.example.frontend.ui.theme.ElectricViolet
import com.example.frontend.ui.theme.MatrixGreen
import com.example.frontend.ui.theme.NeonCyan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PracticeQuizScreen(
    onBackClick: () -> Unit
) {
    val questions = CourseRepository.quizzes
    var currentIndex by remember { mutableStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableStateOf(0) }
    var showExplanation by remember { mutableStateOf(false) }
    var quizCompleted by remember { mutableStateOf(false) }

    val currentQuestion = questions[currentIndex]

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("PRACTICE QUIZ // HTML & CSS", style = MaterialTheme.typography.titleLarge) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            if (quizCompleted) {
                // Score Summary Card
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                    border = BorderStroke(1.dp, NeonCyan)
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.Quiz,
                            contentDescription = null,
                            tint = NeonCyan,
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "QUIZ COMPLETED!",
                            style = MaterialTheme.typography.headlineMedium,
                            color = NeonCyan
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Your Score: $score / ${questions.size}",
                            style = MaterialTheme.typography.titleLarge,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = {
                                currentIndex = 0
                                score = 0
                                selectedOption = null
                                showExplanation = false
                                quizCompleted = false
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = NeonCyan)
                        ) {
                            Text("Retake Quiz", color = Color.Black, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            } else {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                        // Progress Indicator
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Question ${currentIndex + 1} of ${questions.size}",
                                style = MaterialTheme.typography.labelLarge,
                                color = ElectricViolet
                            )
                            Text(
                                text = "Score: $score",
                                style = MaterialTheme.typography.labelLarge,
                                color = MatrixGreen
                            )
                        }

                        LinearProgressIndicator(
                            progress = { (currentIndex + 1).toFloat() / questions.size },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(6.dp)
                                .clip(RoundedCornerShape(3.dp)),
                            color = NeonCyan,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant,
                        )

                        // Question Card
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = currentQuestion.question,
                                    style = MaterialTheme.typography.titleLarge,
                                    fontSize = 18.sp
                                )
                            }
                        }

                        // Options with animated color transitions
                        currentQuestion.options.forEachIndexed { index, option ->
                            val isSelected = selectedOption == index
                            val isCorrect = index == currentQuestion.correctIndex
                            val targetBorderColor = when {
                                showExplanation && isCorrect -> MatrixGreen
                                showExplanation && isSelected && !isCorrect -> Color.Red
                                isSelected -> NeonCyan
                                else -> MaterialTheme.colorScheme.outline
                            }
                            val targetContainerColor = if (isSelected) Color(0xFF1B3A60) else MaterialTheme.colorScheme.surfaceVariant

                            val animatedBorderColor by animateColorAsState(
                                targetValue = targetBorderColor,
                                animationSpec = tween(300),
                                label = "borderColor"
                            )
                            val animatedContainerColor by animateColorAsState(
                                targetValue = targetContainerColor,
                                animationSpec = tween(300),
                                label = "containerColor"
                            )

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(10.dp))
                                    .clickable(enabled = !showExplanation) {
                                        selectedOption = index
                                    },
                                shape = RoundedCornerShape(10.dp),
                                colors = CardDefaults.cardColors(containerColor = animatedContainerColor),
                                border = BorderStroke(1.5.dp, animatedBorderColor)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "${('A' + index)}.",
                                        style = MaterialTheme.typography.bodyLarge,
                                        fontWeight = FontWeight.Bold,
                                        color = NeonCyan
                                    )
                                    Spacer(modifier = Modifier.width(12.dp))
                                    Text(
                                        text = option,
                                        style = MaterialTheme.typography.bodyLarge
                                    )
                                }
                            }
                        }

                        if (showExplanation) {
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(10.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xFF132A24)),
                                border = BorderStroke(1.dp, MatrixGreen)
                            ) {
                                Column(modifier = Modifier.padding(14.dp)) {
                                    Text(
                                        text = "EXPLANATION:",
                                        style = MaterialTheme.typography.labelLarge,
                                        color = MatrixGreen
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = currentQuestion.explanation,
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                }
                            }
                        }
                    }

                    // Bottom Action Button
                    Button(
                        onClick = {
                            if (!showExplanation) {
                                if (selectedOption != null) {
                                    showExplanation = true
                                    if (selectedOption == currentQuestion.correctIndex) {
                                        score++
                                    }
                                }
                            } else {
                                if (currentIndex < questions.size - 1) {
                                    currentIndex++
                                    selectedOption = null
                                    showExplanation = false
                                } else {
                                    quizCompleted = true
                                }
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        enabled = selectedOption != null || showExplanation,
                        colors = ButtonDefaults.buttonColors(containerColor = NeonCyan)
                    ) {
                        Text(
                            text = if (!showExplanation) "Submit Answer" else if (currentIndex < questions.size - 1) "Next Question" else "View Results",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
