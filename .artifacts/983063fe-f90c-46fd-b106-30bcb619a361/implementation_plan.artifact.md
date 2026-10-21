# HTML & CSS Web Development Academy & Code Studio - Implementation Plan

An immersive, feature-rich Android application designed for learning HTML and CSS from scratch to advanced concepts, complete with structured lessons, interactive practice quizzes, and an integrated live code editor with real-time WebView preview, styled in a unique "Cyber-Developer" dark theme.

## User Review Required

> [!IMPORTANT]
> - **Jetpack Compose & Material 3**: We will add Jetpack Compose dependencies to build a modern, reactive UI with smooth navigation and custom widgets.
> - **Unique Theme**: "Cyber-Developer" theme featuring deep obsidian (`#0B0F19`), neon cyan (`#00F2FE`), electric violet (`#4FACFE`), and matrix green accent colors with custom card shapes and glowing elements.

## Proposed Changes

### Build Configuration & Dependencies
#### [MODIFY] [libs.versions.toml](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/gradle/libs.versions.toml)
- Add Compose BOM, Material3, Navigation, and Lifecycle dependencies.

#### [MODIFY] [build.gradle.kts](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/build.gradle.kts)
- Enable Compose build features and add required dependencies.

### Core Domain & Data
#### [NEW] [Models.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/model/Models.kt)
- Define data classes for `CourseModule`, `Lesson`, `QuizQuestion`, and `CodeSample`.

#### [NEW] [CourseRepository.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/data/CourseRepository.kt)
- Provide comprehensive HTML & CSS course curriculum (Introduction to HTML, Tags & Attributes, Forms & Tables, CSS Selectors, Box Model, Flexbox, Grid, Responsive Design).

### Theme & Styling
#### [NEW] [Theme.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/ui/theme/Theme.kt)
- Define Cyber-Developer color palette, typography, and Material 3 theme.

### UI Screens & Components
#### [NEW] [HomeScreen.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/ui/screens/HomeScreen.kt)
- Dashboard displaying course progress, modules (HTML & CSS), quick practice shortcuts, and direct link to the Code Studio.

#### [NEW] [LessonDetailScreen.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/ui/screens/LessonDetailScreen.kt)
- Detailed lesson view with theory, formatted code examples with "Try in Editor" button, and key takeaways.

#### [NEW] [PracticeQuizScreen.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/ui/screens/PracticeQuizScreen.kt)
- Interactive practice quizzes with instant score tracking and explanations.

#### [NEW] [CodeEditorScreen.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/ui/screens/CodeEditorScreen.kt)
- Integrated HTML/CSS code editor with syntax area, template selector, and live split/full WebView preview.

#### [MODIFY] [MainActivity.kt](file:///C:/Users/zziau/AndroidStudioProjects/frontend2/app/src/main/java/com/example/frontend/MainActivity.kt)
- Host the root Compose navigation controller and main app scaffolding.

## Verification Plan

### Automated Tests
- Gradle build verification (`app:assembleDebug`).
- Unit tests for course data and quiz logic.

### Manual Verification
- Deploy to emulator/device, navigate through HTML & CSS lessons, take practice quizzes, and test live HTML/CSS editing with real-time preview in the Code Studio.
