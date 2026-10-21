package com.example.frontend.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontend.data.ReferenceRepository
import com.example.frontend.model.ReferenceItem
import com.example.frontend.ui.theme.ElectricViolet
import com.example.frontend.ui.theme.MatrixGreen
import com.example.frontend.ui.theme.NeonCyan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReferenceScreen(
    onHomeClick: () -> Unit,
    onQuizClick: () -> Unit,
    onEditorClick: () -> Unit,
    onTryInEditor: (String, String) -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    val allItems = ReferenceRepository.items
    val filteredItems = remember(searchQuery) {
        if (searchQuery.isBlank()) {
            allItems
        } else {
            allItems.filter {
                it.name.contains(searchQuery, ignoreCase = true) ||
                        it.description.contains(searchQuery, ignoreCase = true) ||
                        it.category.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("W3SCHOOLS // TAG & CSS REFERENCE", style = MaterialTheme.typography.titleLarge) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface
            ) {
                NavigationBarItem(
                    selected = false,
                    onClick = onHomeClick,
                    icon = { Icon(Icons.Default.Code, contentDescription = "Modules") },
                    label = { Text("Modules") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = { },
                    icon = { Icon(Icons.Default.Search, contentDescription = "Reference") },
                    label = { Text("Reference") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = onQuizClick,
                    icon = { Icon(Icons.Default.Quiz, contentDescription = "Quizzes") },
                    label = { Text("Quizzes") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = onEditorClick,
                    icon = { Icon(Icons.Default.PlayArrow, contentDescription = "Studio") },
                    label = { Text("Live Studio") }
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Search Bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Search HTML tags or CSS properties (e.g. <table>, flex, <img>)...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = NeonCyan) },
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = NeonCyan,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                ),
                singleLine = true
            )

            // Results count
            Text(
                text = "Showing ${filteredItems.size} Reference Items",
                style = MaterialTheme.typography.labelLarge,
                color = MatrixGreen
            )

            // Items List
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(filteredItems) { item ->
                    ReferenceCard(item = item, onTryInEditor = onTryInEditor)
                }
            }
        }
    }
}

@Composable
fun ReferenceCard(
    item: ReferenceItem,
    onTryInEditor: (String, String) -> Unit
) {
    val isHtml = item.category.contains("HTML", ignoreCase = true)
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.name,
                    style = MaterialTheme.typography.titleLarge,
                    color = if (isHtml) NeonCyan else MatrixGreen
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(if (isHtml) NeonCyan.copy(alpha = 0.15f) else MatrixGreen.copy(alpha = 0.15f))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = item.category,
                        style = MaterialTheme.typography.labelLarge,
                        color = if (isHtml) NeonCyan else MatrixGreen,
                        fontSize = 11.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = item.description,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(10.dp))

            // Syntax Box
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF070A10))
                    .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(8.dp))
                    .padding(10.dp)
            ) {
                Text(
                    text = item.syntax,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontSize = 13.sp,
                        color = ElectricViolet
                    )
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    if (isHtml) {
                        onTryInEditor(item.exampleCode, "body { background: #0b0f19; color: #fff; font-family: monospace; padding: 20px; }")
                    } else {
                        onTryInEditor("<div style=\"padding: 20px;\"><h2>CSS Property Demo</h2><div class=\"demo-box\">Styled Element</div></div>", "body { background: #0b0f19; color: #fff; font-family: monospace; }\n.demo-box {\n  background: #131c2e;\n  border: 2px solid #00f2fe;\n  padding: 20px;\n  border-radius: 8px;\n  ${item.syntax}\n}")
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = if (isHtml) NeonCyan else MatrixGreen)
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null, tint = Color.Black, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(text = "Try in Live Studio", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}
