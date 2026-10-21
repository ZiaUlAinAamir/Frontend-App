package com.example.frontend.data

import com.example.frontend.model.ReferenceItem

object ReferenceRepository {
    val items = listOf(
        // HTML Tags
        ReferenceItem(
            name = "<html>",
            category = "HTML Tag",
            description = "The root element of an HTML page. Wraps all other elements on the page.",
            syntax = "<html lang=\"en\">...</html>",
            exampleCode = "<html lang=\"en\">\n  <body>\n    <h1>Root Element Example</h1>\n  </body>\n</html>"
        ),
        ReferenceItem(
            name = "<head>",
            category = "HTML Tag",
            description = "Contains container for metadata (charset, title, stylesheets, scripts) not rendered directly.",
            syntax = "<head><title>Title</title></head>",
            exampleCode = "<head>\n  <title>Cyber Page</title>\n  <meta charset=\"UTF-8\">\n</head>"
        ),
        ReferenceItem(
            name = "<body>",
            category = "HTML Tag",
            description = "Defines the document's body, containing all visible content such as text, images, and forms.",
            syntax = "<body>Visible content here</body>",
            exampleCode = "<body>\n  <p>This is rendered inside the browser viewport.</p>\n</body>"
        ),
        ReferenceItem(
            name = "<h1> to <h6>",
            category = "HTML Tag",
            description = "HTML headings from level 1 (most important) to level 6 (least important).",
            syntax = "<h1>Heading 1</h1>",
            exampleCode = "<h1>Main Title</h1>\n<h2>Subheading</h2>\n<h3>Section Header</h3>"
        ),
        ReferenceItem(
            name = "<p>",
            category = "HTML Tag",
            description = "Defines a paragraph of text. Browsers automatically add margin before and after paragraphs.",
            syntax = "<p>Paragraph text...</p>",
            exampleCode = "<p>Welcome to Web Development Academy. Learn HTML & CSS interactively.</p>"
        ),
        ReferenceItem(
            name = "<a>",
            category = "HTML Tag",
            description = "Defines a hyperlink used to link from one page to another using the 'href' attribute.",
            syntax = "<a href=\"url\">Link Text</a>",
            exampleCode = "<a href=\"https://google.com\" target=\"_blank\">Search on Google</a>"
        ),
        ReferenceItem(
            name = "<img>",
            category = "HTML Tag",
            description = "Embeds an image into an HTML page. Requires 'src' and 'alt' attributes.",
            syntax = "<img src=\"url\" alt=\"description\">",
            exampleCode = "<img src=\"https://via.placeholder.com/150\" alt=\"Placeholder Image\">"
        ),
        ReferenceItem(
            name = "<ul> & <ol>",
            category = "HTML Tag",
            description = "Unordered (bulleted) and Ordered (numbered) lists containing <li> items.",
            syntax = "<ul><li>Item</li></ul>",
            exampleCode = "<ul>\n  <li>HTML5 Structure</li>\n  <li>CSS3 Styling</li>\n</ul>"
        ),
        ReferenceItem(
            name = "<table>",
            category = "HTML Tag",
            description = "Displays tabular data structured with rows (<tr>), headers (<th>), and cells (<td>).",
            syntax = "<table><tr><th>Header</th><td>Data</td></tr></table>",
            exampleCode = "<table border=\"1\">\n  <tr><th>Language</th><th>Type</th></tr>\n  <tr><td>HTML</td><td>Markup</td></tr>\n</table>"
        ),
        ReferenceItem(
            name = "<form>",
            category = "HTML Tag",
            description = "Creates an HTML form for user input, containing inputs, checkboxes, radios, and submit buttons.",
            syntax = "<form action=\"/submit\">...</form>",
            exampleCode = "<form>\n  <label>Username:</label>\n  <input type=\"text\" placeholder=\"Enter name...\">\n  <button type=\"submit\">Submit</button>\n</form>"
        ),
        ReferenceItem(
            name = "<video> & <audio>",
            category = "HTML Tag",
            description = "Embeds video and audio media playback directly into web pages.",
            syntax = "<video controls><source src=\"movie.mp4\"></video>",
            exampleCode = "<video controls width=\"250\">\n  <source src=\"movie.mp4\" type=\"video/mp4\">\n</video>"
        ),
        ReferenceItem(
            name = "<header>, <nav>, <main>, <footer>",
            category = "HTML Tag",
            description = "Semantic structural layout elements providing meaningful document hierarchy.",
            syntax = "<header><nav>...</nav></header><main>...</main><footer>...</footer>",
            exampleCode = "<header>\n  <nav><a href=\"#\">Home</a></nav>\n</header>\n<main>\n  <p>Main content area.</p>\n</main>\n<footer>&copy; 2025</footer>"
        ),

        // CSS Properties
        ReferenceItem(
            name = "color & background-color",
            category = "CSS Property",
            description = "Controls text color and element background color.",
            syntax = "color: #00f2fe; background-color: #0b0f19;",
            exampleCode = "div {\n  background-color: #131c2e;\n  color: #00f2fe;\n  padding: 20px;\n}"
        ),
        ReferenceItem(
            name = "font-family & font-size",
            category = "CSS Property",
            description = "Sets the font typeface and text size of elements.",
            syntax = "font-family: monospace; font-size: 16px;",
            exampleCode = "p {\n  font-family: monospace;\n  font-size: 18px;\n  font-weight: bold;\n}"
        ),
        ReferenceItem(
            name = "padding, margin & border",
            category = "CSS Property",
            description = "Core Box Model properties controlling inner space, outer space, and borders.",
            syntax = "padding: 15px; margin: 10px; border: 2px solid #00f2fe;",
            exampleCode = ".box {\n  padding: 20px;\n  margin: 15px;\n  border: 1px solid #4facfe;\n}"
        ),
        ReferenceItem(
            name = "display: flex (Flexbox)",
            category = "CSS Property",
            description = "Enables the flexible box layout model for 1-dimensional alignment and distribution.",
            syntax = "display: flex; justify-content: space-between; align-items: center;",
            exampleCode = ".container {\n  display: flex;\n  justify-content: space-between;\n  align-items: center;\n}"
        ),
        ReferenceItem(
            name = "display: grid (CSS Grid)",
            category = "CSS Property",
            description = "Enables 2-dimensional grid layout systems for rows and columns.",
            syntax = "display: grid; grid-template-columns: repeat(3, 1fr); gap: 15px;",
            exampleCode = ".grid {\n  display: grid;\n  grid-template-columns: 1fr 1fr;\n  gap: 10px;\n}"
        ),
        ReferenceItem(
            name = "border-radius & box-shadow",
            category = "CSS Property",
            description = "Creates rounded corners and glowing shadow effects on elements.",
            syntax = "border-radius: 8px; box-shadow: 0 0 15px rgba(0,242,254,0.4);",
            exampleCode = ".card {\n  background: #1a2642;\n  border-radius: 12px;\n  box-shadow: 0 0 20px rgba(0,242,254,0.3);\n}"
        )
    )
}
