package com.example.frontend.data

import com.example.frontend.model.CourseModule
import com.example.frontend.model.Lesson
import com.example.frontend.model.QuizQuestion
import com.example.frontend.model.CodeTemplate

object CourseRepository {

    val modules = listOf(
        CourseModule(
            id = "html_basics",
            title = "HTML5 Fundamentals",
            description = "Master the structure of the web with tags, semantic elements, and documents.",
            category = "HTML",
            iconName = "html",
            lessons = listOf(
                Lesson(
                    id = "html_101",
                    title = "Introduction to HTML",
                    summary = "Learn what HTML stands for and how web pages are structured.",
                    content = "HTML (HyperText Markup Language) is the standard markup language for documents designed to be displayed in a web browser. It defines the structure and meaning of web content using tags enclosed in angle brackets like <html>, <head>, and <body>.",
                    codeExample = "<!DOCTYPE html>\n<html>\n  <head>\n    <title>My First Webpage</title>\n  </head>\n  <body>\n    <h1>Hello, Cyber World!</h1>\n    <p>Welcome to Web Development Academy.</p>\n  </body>\n</html>",
                    keyTakeaways = listOf(
                        "HTML uses tags to structure content.",
                        "Every HTML5 document starts with <!DOCTYPE html>.",
                        "The <html> root element wraps all content."
                    )
                ),
                Lesson(
                    id = "html_tags",
                    title = "Headings, Paragraphs & Text Formatting",
                    summary = "Organize text content with hierarchy and inline styling tags.",
                    content = "Web typography relies on headings (<h1> to <h6>) for hierarchy, paragraphs (<p>) for blocks of text, and formatting tags like <strong> and <em> for emphasis.",
                    codeExample = "<h1>Main Title (H1)</h1>\n<h2>Subheading (H2)</h2>\n<p>This is a standard paragraph with <strong>bold</strong> and <em>italic</em> text.</p>",
                    keyTakeaways = listOf(
                        "Use H1 only once per page for main title.",
                        "Use paragraphs for readable text blocks.",
                        "Strong and Em provide semantic emphasis."
                    )
                ),
                Lesson(
                    id = "html_forms",
                    title = "Forms & User Input",
                    summary = "Collect user data with interactive form elements.",
                    content = "HTML forms (<form>) allow users to interact with web pages. Inputs (<input>), labels (<label>), textareas, and submit buttons enable data collection.",
                    codeExample = "<form>\n  <label for=\"username\">Username:</label><br>\n  <input type=\"text\" id=\"username\" name=\"username\"><br><br>\n  <button type=\"submit\">Register</button>\n</form>",
                    keyTakeaways = listOf(
                        "Always pair <label> with form controls using 'for' attribute.",
                        "Input types include text, password, email, and number.",
                        "Submit buttons trigger form action."
                    )
                )
            )
        ),
        CourseModule(
            id = "css_styling",
            title = "CSS3 Styling & Layouts",
            description = "Transform plain HTML into gorgeous, responsive interfaces with CSS.",
            category = "CSS",
            iconName = "css",
            lessons = listOf(
                Lesson(
                    id = "css_selectors",
                    title = "Selectors & Colors",
                    summary = "Target HTML elements and apply stunning color palettes.",
                    content = "CSS (Cascading Style Sheets) styles HTML elements. Selectors target elements by tag name, class (.class), or ID (#id). Colors can be applied via HEX, RGB, or HSL.",
                    codeExample = "/* CSS Stylesheet */\nbody {\n  background-color: #0b0f19;\n  color: #00f2fe;\n  font-family: monospace;\n}\n.card {\n  background: #1a2642;\n  padding: 16px;\n  border-radius: 8px;\n}",
                    keyTakeaways = listOf(
                        "Class selectors start with a dot (.)",
                        "ID selectors start with a hash (#)",
                        "Properties end with semicolons (;)"
                    )
                ),
                Lesson(
                    id = "css_boxmodel",
                    title = "The CSS Box Model",
                    summary = "Understand Content, Padding, Border, and Margin.",
                    content = "Every element in CSS is represented as a rectangular box. The box model consists of: Content (the actual text/image), Padding (space inside border), Border, and Margin (space outside border).",
                    codeExample = ".box {\n  width: 200px;\n  padding: 20px;\n  border: 2px solid #00f2fe;\n  margin: 15px;\n}",
                    keyTakeaways = listOf(
                        "Padding increases inner spacing.",
                        "Margin creates outer separation.",
                        "box-sizing: border-box includes padding and border in width."
                    )
                ),
                Lesson(
                    id = "css_flexbox",
                    title = "Flexbox Layout Engine",
                    summary = "Build flexible, 1D responsive layouts with ease.",
                    content = "Flexbox is a one-dimensional layout model that provides space distribution and alignment control for items inside a container using display: flex.",
                    codeExample = ".container {\n  display: flex;\n  justify-content: space-between;\n  align-items: center;\n}\n.item {\n  flex: 1;\n  margin: 5px;\n}",
                    keyTakeaways = listOf(
                        "display: flex activates the flex container.",
                        "justify-content aligns items horizontally (main axis).",
                        "align-items aligns items vertically (cross axis)."
                    )
                )
            )
        )
    )

    val quizzes = listOf(
        QuizQuestion(
            id = "q1",
            question = "What does HTML stand for?",
            options = listOf(
                "Hyper Text Markup Language",
                "High Tech Modern Language",
                "Hyperlink and Text Management Language",
                "Home Tool Markup Language"
            ),
            correctIndex = 0,
            explanation = "HTML stands for Hyper Text Markup Language, the standard markup language for creating web pages."
        ),
        QuizQuestion(
            id = "q2",
            question = "Which HTML tag is used to define an internal style sheet?",
            options = listOf("<script>", "<css>", "<style>", "<design>"),
            correctIndex = 2,
            explanation = "The <style> tag is used to define internal CSS styles within an HTML document."
        ),
        QuizQuestion(
            id = "q3",
            question = "In CSS, how do you select an element with id 'header'?",
            options = listOf(".header", "#header", "header", "*header"),
            correctIndex = 1,
            explanation = "ID selectors in CSS are prefixed with a hash (#), e.g., #header."
        ),
        QuizQuestion(
            id = "q4",
            question = "Which CSS property controls the space inside the element's border?",
            options = listOf("spacing", "padding", "margin", "border-width"),
            correctIndex = 1,
            explanation = "Padding defines the space between the element content and its border."
        ),
        QuizQuestion(
            id = "q5",
            question = "Which Flexbox property aligns items along the cross axis?",
            options = listOf("justify-content", "align-items", "flex-direction", "row-gap"),
            correctIndex = 1,
            explanation = "align-items aligns flex items along the cross axis."
        )
    )

    val templates = listOf(
        CodeTemplate(
            id = "cyber_card",
            title = "Cyber Neon Card",
            description = "A futuristic glassmorphic card with glowing borders and cyber cyan accents.",
            htmlCode = "<div class=\"cyber-card\">\n  <h2>CYBER_NODE // 01</h2>\n  <p>System status: Operational</p>\n  <button class=\"btn-cyber\">EXECUTE</button>\n</div>",
            cssCode = "body {\n  background: #0b0f19;\n  color: #f1f5f9;\n  font-family: monospace;\n  display: flex;\n  justify-content: center;\n  align-items: center;\n  height: 100vh;\n  margin: 0;\n}\n.cyber-card {\n  background: #131c2e;\n  border: 2px solid #00f2fe;\n  padding: 24px;\n  border-radius: 12px;\n  box-shadow: 0 0 20px rgba(0,242,254,0.3);\n  width: 280px;\n  text-align: center;\n}\n.btn-cyber {\n  background: linear-gradient(90deg, #00f2fe, #4facfe);\n  color: #0b0f19;\n  border: none;\n  padding: 10px 20px;\n  font-weight: bold;\n  border-radius: 6px;\n  cursor: pointer;\n  margin-top: 15px;\n}"
        ),
        CodeTemplate(
            id = "flexbox_hero",
            title = "Flexbox Hero Header",
            description = "A responsive navigation bar and hero section built with Flexbox.",
            htmlCode = "<nav class=\"navbar\">\n  <div class=\"logo\">DEV_PULSE</div>\n  <ul class=\"nav-links\">\n    <li><a href=\"#\">Home</a></li>\n    <li><a href=\"#\">Courses</a></li>\n    <li><a href=\"#\">Studio</a></li>\n  </ul>\n</nav>\n<header class=\"hero\">\n  <h1>Master HTML & CSS</h1>\n  <p>Build the future of the web.</p>\n</header>",
            cssCode = "body {\n  background: #0b0f19;\n  color: #f1f5f9;\n  font-family: sans-serif;\n  margin: 0;\n}\n.navbar {\n  display: flex;\n  justify-content: space-between;\n  align-items: center;\n  background: #131c2e;\n  padding: 15px 30px;\n  border-bottom: 1px solid #2a3b66;\n}\n.nav-links {\n  display: flex;\n  list-style: none;\n  gap: 20px;\n  margin: 0;\n}\n.nav-links a {\n  color: #00f2fe;\n  text-decoration: none;\n  font-weight: bold;\n}\n.hero {\n  text-align: center;\n  padding: 80px 20px;\n}\n.hero h1 {\n  color: #4facfe;\n  font-size: 2.5rem;\n}"
        ),
        CodeTemplate(
            id = "html_form",
            title = "Futuristic Login Form",
            description = "A clean styled HTML login form with glowing input focus states.",
            htmlCode = "<div class=\"form-container\">\n  <h2>SECURE LOGIN</h2>\n  <form>\n    <label>User ID</label>\n    <input type=\"text\" placeholder=\"Enter ID...\">\n    <label>Access Key</label>\n    <input type=\"password\" placeholder=\"••••••••\">\n    <button type=\"submit\">AUTHORIZE</button>\n  </form>\n</div>",
            cssCode = "body {\n  background: #0b0f19;\n  color: #f1f5f9;\n  font-family: monospace;\n  display: flex;\n  justify-content: center;\n  align-items: center;\n  height: 100vh;\n  margin: 0;\n}\n.form-container {\n  background: #131c2e;\n  border: 1px solid #2a3b66;\n  padding: 30px;\n  border-radius: 12px;\n  width: 320px;\n}\n.form-container h2 {\n  text-align: center;\n  color: #00f2fe;\n  margin-bottom: 20px;\n}\nlabel {\n  font-size: 12px;\n  color: #94a3b8;\n}\ninput {\n  width: 100%;\n  padding: 10px;\n  margin: 8px 0 16px 0;\n  background: #1a2642;\n  border: 1px solid #2a3b66;\n  color: #fff;\n  border-radius: 6px;\n  box-sizing: border-box;\n}\ninput:focus {\n  border-color: #00f2fe;\n  outline: none;\n}\nbutton {\n  width: 100%;\n  padding: 12px;\n  background: #00f2fe;\n  color: #0b0f19;\n  border: none;\n  font-weight: bold;\n  border-radius: 6px;\n  cursor: pointer;\n}"
        )
    )
}
