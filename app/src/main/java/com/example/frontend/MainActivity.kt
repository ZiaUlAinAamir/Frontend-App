package com.example.frontend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.frontend.ui.screens.CodeEditorScreen
import com.example.frontend.ui.screens.HomeScreen
import com.example.frontend.ui.screens.LessonDetailScreen
import com.example.frontend.ui.screens.PracticeQuizScreen
import com.example.frontend.ui.theme.CyberAcademyTheme
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CyberAcademyTheme {
                WebAcademyApp()
            }
        }
    }
}

@Composable
fun WebAcademyApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onLessonClick = { lessonId ->
                    navController.navigate("lesson/$lessonId")
                },
                onQuizClick = {
                    navController.navigate("quiz")
                },
                onEditorClick = {
                    navController.navigate("editor")
                }
            )
        }

        composable(
            route = "lesson/{lessonId}",
            arguments = listOf(navArgument("lessonId") { type = NavType.StringType })
        ) { backStackEntry ->
            val lessonId = backStackEntry.arguments?.getString("lessonId") ?: "html_101"
            LessonDetailScreen(
                lessonId = lessonId,
                onBackClick = { navController.popBackStack() },
                onOpenEditor = { code, css ->
                    val encodedHtml = URLEncoder.encode(code, StandardCharsets.UTF_8.toString())
                    val encodedCss = URLEncoder.encode(css, StandardCharsets.UTF_8.toString())
                    navController.navigate("editor?html=$encodedHtml&css=$encodedCss")
                }
            )
        }

        composable("quiz") {
            PracticeQuizScreen(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(
            route = "editor?html={html}&css={css}",
            arguments = listOf(
                navArgument("html") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                },
                navArgument("css") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                }
            )
        ) { backStackEntry ->
            val encodedHtml = backStackEntry.arguments?.getString("html") ?: ""
            val encodedCss = backStackEntry.arguments?.getString("css") ?: ""
            val decodedHtml = URLDecoder.decode(encodedHtml, StandardCharsets.UTF_8.toString())
            val decodedCss = URLDecoder.decode(encodedCss, StandardCharsets.UTF_8.toString())

            CodeEditorScreen(
                initialHtml = decodedHtml,
                initialCss = decodedCss,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
