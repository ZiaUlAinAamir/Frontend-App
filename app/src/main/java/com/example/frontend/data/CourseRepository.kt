package com.example.frontend.data

import com.example.frontend.model.CourseModule
import com.example.frontend.model.Lesson
import com.example.frontend.model.QuizQuestion
import com.example.frontend.model.CodeTemplate

object CourseRepository {

    val modules = listOf(
        CourseModule(
            id = "html_basics",
            title = "HTML5 Document Structure",
            description = "Master the root structure, metadata, and core semantic skeleton of web documents.",
            category = "HTML",
            iconName = "html",
            lessons = listOf(
                Lesson(
                    id = "html_101",
                    title = "Anatomy of an HTML Document",
                    summary = "Understand <!DOCTYPE html>, <html>, <head>, and <body>.",
                    content = "Every HTML document requires a precise hierarchy. <!DOCTYPE html> informs the browser of HTML5 standards. The <html> root wraps everything. The <head> holds invisible metadata (title, stylesheets, charset), while the <body> contains all visible elements rendered on screen.",
                    codeExample = "<!DOCTYPE html>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"UTF-8\">\n    <title>WebCraft Academy</title>\n  </head>\n  <body>\n    <h1>Mastering HTML5</h1>\n    <p>Building the modern web.</p>\n  </body>\n</html>",
                    keyTakeaways = listOf(
                        "<!DOCTYPE html> is mandatory for HTML5 rendering.",
                        "<meta charset=\"UTF-8\"> ensures correct character encoding.",
                        "All visible content goes inside the <body> tag."
                    )
                ),
                Lesson(
                    id = "html_semantics",
                    title = "Semantic HTML5 Elements",
                    summary = "Use <header>, <nav>, <main>, <section>, <article>, and <footer>.",
                    content = "Semantic tags clearly describe their meaning to both the browser and the developer. Instead of generic <div> tags everywhere, semantic elements like <header> for page headers, <nav> for navigation links, <main> for primary content, <article> for self-contained content, and <footer> for copyright/contact info improve accessibility and SEO.",
                    codeExample = "<header>\n  <nav>\n    <a href=\"#home\">Home</a> | <a href=\"#courses\">Courses</a>\n  </nav>\n</header>\n<main>\n  <article>\n    <h2>Semantic Web Design</h2>\n    <p>Why structure matters for SEO and accessibility.</p>\n  </article>\n</main>\n<footer>\n  <p>&copy; 2025 WebCraft Academy</p>\n</footer>",
                    keyTakeaways = listOf(
                        "Semantic elements improve SEO and screen reader accessibility.",
                        "<nav> is dedicated to navigation links.",
                        "<article> represents independent, self-contained content."
                    )
                )
            )
        ),
        CourseModule(
            id = "html_tags_mastery",
            title = "Complete HTML Tags Directory",
            description = "Comprehensive guide to text formatting, lists, tables, media, and form tags with uses.",
            category = "HTML",
            iconName = "html",
            lessons = listOf(
                Lesson(
                    id = "tags_text_media",
                    title = "Text Formatting, Links & Media Tags",
                    summary = "Explore <a>, <img>, <strong>, <em>, <code>, <video>, and <audio>.",
                    content = "HTML provides dedicated tags for rich media and text styling:\n• <a>: Hyperlinks for navigation (href attribute).\n• <img>: Embeds images (src and alt attributes).\n• <strong> & <em>: Semantic bold and italic emphasis.\n• <code> & <pre>: Monospace code snippets and preformatted blocks.\n• <video> & <audio>: Native multimedia embedding with controls.",
                    codeExample = "<!-- Links & Images -->\n<a href=\"https://google.com\" target=\"_blank\">Visit Google</a>\n<img src=\"cyber-logo.png\" alt=\"Cyber Logo\" width=\"150\">\n\n<!-- Code & Multimedia -->\n<pre><code>console.log('Cyber Academy');</code></pre>\n<video controls width=\"300\">\n  <source src=\"cyber-video.mp4\" type=\"video/mp4\">\n</video>",
                    keyTakeaways = listOf(
                        "Always include 'alt' attribute on <img> for accessibility.",
                        "<a> tag uses 'target=\"_blank\"' to open links in a new tab.",
                        "<video> and <audio> require the 'controls' attribute for playback UI."
                    )
                ),
                Lesson(
                    id = "tags_lists_tables",
                    title = "Lists & Data Tables Tags",
                    summary = "Master unordered/ordered lists (<ul>, <ol>, <li>) and tabular data (<table>, <tr>, <th>, <td>).",
                    content = "Structuring data cleanly requires lists and tables:\n• <ul> & <ol>: Unordered (bulleted) and Ordered (numbered) lists containing <li> items.\n• <table>: Container for tabular data.\n• <thead>, <tbody>, <tr>: Table header, body, and table rows.\n• <th> & <td>: Table header cells (bold/centered) and standard data cells.",
                    codeExample = "<!-- Unordered List -->\n<ul>\n  <li>HTML5 Structure</li>\n  <li>CSS3 Styling</li>\n</ul>\n\n<!-- Data Table -->\n<table border=\"1\">\n  <thead>\n    <tr><th>Course</th><th>Level</th></tr>\n  </thead>\n  <tbody>\n    <tr><td>HTML</td><td>Beginner</td></tr>\n    <tr><td>CSS</td><td>Intermediate</td></tr>\n  </tbody>\n</table>",
                    keyTakeaways = listOf(
                        "<ul> and <ol> children must always be <li> elements.",
                        "Use <th> for header cells and <td> for regular data cells.",
                        "Organize tables using <thead> and <tbody> for semantic clarity."
                    )
                ),
                Lesson(
                    id = "tags_forms_inputs",
                    title = "Forms & Interactive Controls",
                    summary = "Collect user input with <form>, <input>, <label>, <textarea>, <select>, and <button>.",
                    content = "Forms are crucial for user interaction and backend data transmission:\n• <form>: Container collecting user inputs.\n• <label>: Describes form controls (accessibility focus via 'for').\n• <input>: Versatile input element (types: text, password, email, checkbox, radio, submit).\n• <textarea>: Multi-line text input.\n• <select> & <option>: Dropdown menus.\n• <button>: Clickable action button.",
                    codeExample = "<form action=\"/submit\" method=\"POST\">\n  <label for=\"email\">Email Address:</label><br>\n  <input type=\"email\" id=\"email\" name=\"email\" required><br><br>\n  \n  <label for=\"role\">Select Track:</label>\n  <select id=\"role\" name=\"role\">\n    <option value=\"frontend\">Frontend Developer</option>\n    <option value=\"fullstack\">Full Stack Engineer</option>\n  </select><br><br>\n  \n  <button type=\"submit\">Enroll Now</button>\n</form>",
                    keyTakeaways = listOf(
                        "Input 'type' attribute changes input behavior (email, password, number).",
                        "Always pair <label> with input IDs for accessibility.",
                        "Dropdowns are built using <select> with nested <option> tags."
                    )
                )
            )
        ),
        CourseModule(
            id = "css_types_mastery",
            title = "CSS3 Styling: The 3 Types of CSS",
            description = "Master Inline, Internal, and External CSS concepts, syntax, usage, and best practices.",
            category = "CSS",
            iconName = "css",
            lessons = listOf(
                Lesson(
                    id = "css_three_types",
                    title = "Inline, Internal vs. External CSS",
                    summary = "Learn how to apply CSS using inline styles, internal <style> tags, and external .css files.",
                    content = "CSS can be integrated into web pages in three distinct ways:\n\n1. INLINE CSS:\n• Concept: Applies styles directly to a single HTML element using the `style` attribute.\n• Use Case: Quick, one-off overrides or dynamic JavaScript style injection.\n• Example: `<p style=\"color: #00f2fe;\">Inline text</p>`\n\n2. INTERNAL CSS:\n• Concept: Placed inside a `<style>` tag in the HTML document's `<head>` section.\n• Use Case: Styling a single standalone HTML page without external files.\n• Example: `<head><style>body { background: #0b0f19; }</style></head>`\n\n3. EXTERNAL CSS:\n• Concept: Written in a separate `.css` file and linked via the `<link>` tag in `<head>`.\n• Use Case: Industry standard for styling entire multi-page websites from a single file.\n• Example: `<link rel=\"stylesheet\" href=\"styles.css\">`",
                    codeExample = "<!-- 1. INLINE CSS -->\n<h1 style=\"color: #00f2fe; font-family: monospace;\">Cyber Header</h1>\n\n<!-- 2. INTERNAL CSS -->\n<head>\n  <style>\n    .internal-box { background: #131c2e; padding: 20px; }\n  </style>\n</head>\n\n<!-- 3. EXTERNAL CSS (in styles.css) -->\n/*\n  body { background: #0b0f19; color: #fff; }\n*/",
                    keyTakeaways = listOf(
                        "External CSS is the industry standard for maintainability across multiple pages.",
                        "Internal CSS applies to a single document via the <head> <style> tag.",
                        "Inline CSS has the highest specificity but makes HTML cluttered and hard to maintain."
                    )
                ),
                Lesson(
                    id = "css_selectors_boxmodel",
                    title = "Selectors, Colors & The Box Model",
                    summary = "Target elements with selectors and master Content, Padding, Border, and Margin.",
                    content = "CSS Selectors target HTML elements to apply styles:\n• Element Selector: `p { color: white; }`\n• Class Selector (`.className`): Reusable styles across multiple elements.\n• ID Selector (`#idName`): Unique single element styling.\n\nThe Box Model:\nEvery element is a box composed of Content, Padding (inner spacing), Border, and Margin (outer spacing).",
                    codeExample = "/* Selectors & Box Model */\n#main-heading {\n  color: #00f2fe;\n  text-align: center;\n}\n.cyber-card {\n  background: #1a2642;\n  padding: 20px;\n  border: 2px solid #4facfe;\n  margin: 15px auto;\n  border-radius: 12px;\n}",
                    keyTakeaways = listOf(
                        "Class selectors (.) can be reused on multiple elements.",
                        "ID selectors (#) must be strictly unique per page.",
                        "Box model padding creates inner space while margin creates outer space."
                    )
                ),
                Lesson(
                    id = "css_flexbox_grid",
                    title = "Flexbox & Grid Layout Engines",
                    summary = "Build modern 1D and 2D responsive web layouts.",
                    content = "Modern CSS layout relies on two powerful engines:\n• Flexbox (`display: flex`): 1-dimensional layout for aligning items in rows or columns with `justify-content` and `align-items`.\n• CSS Grid (`display: grid`): 2-dimensional layout system controlling both rows and columns simultaneously using `grid-template-columns` and `gap`.",
                    codeExample = "/* Flexbox Navbar */\n.navbar {\n  display: flex;\n  justify-content: space-between;\n  align-items: center;\n  padding: 16px;\n}\n\n/* CSS Grid Dashboard */\n.grid-container {\n  display: grid;\n  grid-template-columns: repeat(3, 1fr);\n  gap: 20px;\n}",
                    keyTakeaways = listOf(
                        "Flexbox is ideal for navigation bars, cards, and 1D alignment.",
                        "CSS Grid is ideal for full page layouts and 2D grid systems.",
                        "Use 'gap' property in Flexbox and Grid to space items cleanly without margins."
                    )
                )
            )
        )
    )

    val quizzes = listOf(
        QuizQuestion(
            id = "q1",
            question = "Which HTML5 tag is used to define the root of an HTML document?",
            options = listOf("<html>", "<document>", "<root>", "<body>"),
            correctIndex = 0,
            explanation = "The <html> element is the root element of an HTML page."
        ),
        QuizQuestion(
            id = "q2",
            question = "Which of the 3 types of CSS applies styles directly inside an HTML tag using the style attribute?",
            options = listOf("External CSS", "Internal CSS", "Inline CSS", "Global CSS"),
            correctIndex = 2,
            explanation = "Inline CSS uses the 'style' attribute directly on an HTML element."
        ),
        QuizQuestion(
            id = "q3",
            question = "How do you correctly link an External CSS file in the HTML <head>?",
            options = listOf(
                "<style src=\"styles.css\">",
                "<link rel=\"stylesheet\" href=\"styles.css\">",
                "<stylesheet href=\"styles.css\">",
                "<css file=\"styles.css\">"
            ),
            correctIndex = 1,
            explanation = "External stylesheets are linked using <link rel=\"stylesheet\" href=\"url\">."
        ),
        QuizQuestion(
            id = "q4",
            question = "Which semantic tag is best suited for navigation links?",
            options = listOf("<section>", "<nav>", "<aside>", "<divist>"),
            correctIndex = 1,
            explanation = "The <nav> tag is a semantic element specifically designed for navigation link blocks."
        ),
        QuizQuestion(
            id = "q5",
            question = "In the CSS Box Model, which property controls the space *outside* the element's border?",
            options = listOf("padding", "margin", "spacing", "content-box"),
            correctIndex = 1,
            explanation = "Margin controls the outer spacing around an element's border."
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
            cssCode = "body {\n  background: #0b0f19;\n  color: #f1f5f9;\n  font-family: monospace;\n  margin: 0;\n}\n.navbar {\n  display: flex;\n  justify-content: space-between;\n  align-items: center;\n  background: #131c2e;\n  padding: 15px 30px;\n  border-bottom: 1px solid #2a3b66;\n}\n.nav-links {\n  display: flex;\n  list-style: none;\n  gap: 20px;\n  margin: 0;\n}\n.nav-links a {\n  color: #00f2fe;\n  text-decoration: none;\n  font-weight: bold;\n}\n.hero {\n  text-align: center;\n  padding: 80px 20px;\n}\n.hero h1 {\n  color: #4facfe;\n  font-size: 2.2rem;\n}"
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
