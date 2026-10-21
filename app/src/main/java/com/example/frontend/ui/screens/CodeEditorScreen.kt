package com.example.frontend.ui.screens

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.ui.text.TextStyle
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.frontend.data.CourseRepository
import com.example.frontend.ui.theme.ElectricViolet
import com.example.frontend.ui.theme.MatrixGreen
import com.example.frontend.ui.theme.NeonCyan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CodeEditorScreen(
    initialHtml: String = "",
    initialCss: String = "",
    onBackClick: () -> Unit
) {
    val templates = CourseRepository.templates
    val firstTemplate = templates.first()

    var htmlCode by remember {
        mutableStateOf(if (initialHtml.isNotEmpty()) initialHtml else firstTemplate.htmlCode)
    }
    var cssCode by remember {
        mutableStateOf(if (initialCss.isNotEmpty()) initialCss else firstTemplate.cssCode)
    }
    var selectedTab by remember { mutableIntStateOf(0) } // 0: HTML, 1: CSS, 2: Preview

    // Combined HTML source for WebView
    val combinedHtml = remember(htmlCode, cssCode) {
        """
        <!DOCTYPE html>
        <html>
        <head>
        <style>
        $cssCode
        </style>
        </head>
        <body>
        $htmlCode
        </body>
        </html>
        """.trimIndent()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("LIVE CODE STUDIO // EDITOR", style = MaterialTheme.typography.titleLarge) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Template Selector Bar
            Text(
                text = "TEMPLATES:",
                style = MaterialTheme.typography.labelLarge,
                color = ElectricViolet
            )
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(templates) { template ->
                    Button(
                        onClick = {
                            htmlCode = template.htmlCode
                            cssCode = template.cssCode
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant
                        ),
                        border = BorderStroke(1.dp, NeonCyan)
                    ) {
                        Text(template.title, color = NeonCyan, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }

            // Editor / Preview Tabs
            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = NeonCyan
            ) {
                Tab(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    text = { Text("HTML Code") }
                )
                Tab(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    text = { Text("CSS Code") }
                )
                Tab(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    text = { Text("Live Preview") }
                )
            }

            // Content Area
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFF070A10))
                    .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(12.dp))
            ) {
                when (selectedTab) {
                    0 -> {
                        OutlinedTextField(
                            value = htmlCode,
                            onValueChange = { htmlCode = it },
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            textStyle = TextStyle(
                                fontFamily = FontFamily.Monospace,
                                fontSize = 14.sp,
                                color = NeonCyan
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.Transparent,
                                unfocusedBorderColor = Color.Transparent
                            ),
                            placeholder = { Text("Enter HTML here...") }
                        )
                    }
                    1 -> {
                        OutlinedTextField(
                            value = cssCode,
                            onValueChange = { cssCode = it },
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            textStyle = TextStyle(
                                fontFamily = FontFamily.Monospace,
                                fontSize = 14.sp,
                                color = MatrixGreen
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.Transparent,
                                unfocusedBorderColor = Color.Transparent
                            ),
                            placeholder = { Text("Enter CSS here...") }
                        )
                    }
                    2 -> {
                        AndroidView(
                            modifier = Modifier.fillMaxSize(),
                            factory = { context ->
                                WebView(context).apply {
                                    webViewClient = WebViewClient()
                                    settings.javaScriptEnabled = true
                                    loadDataWithBaseURL(null, combinedHtml, "text/html", "UTF-8", null)
                                }
                            },
                            update = { webView ->
                                webView.loadDataWithBaseURL(null, combinedHtml, "text/html", "UTF-8", null)
                            }
                        )
                    }
                }
            }

            // Run / Preview Button shortcut
            Button(
                onClick = { selectedTab = 2 },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = NeonCyan)
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null, tint = Color.Black)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Render Live Preview", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}
