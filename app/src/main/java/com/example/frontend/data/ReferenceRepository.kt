package com.example.frontend.data

import com.example.frontend.model.ReferenceItem

object ReferenceRepository {
    val items = listOf(
        // --- HTML5 TAGS A to Z ---
        ReferenceItem(
            name = "<a>",
            category = "HTML Tag",
            description = "Defines a hyperlink used to link from one page to another.",
            syntax = "<a href=\"https://example.com\" target=\"_blank\">Link Text</a>",
            exampleCode = "<a href=\"https://google.com\" target=\"_blank\">Visit Google</a>"
        ),
        ReferenceItem(
            name = "<abbr>",
            category = "HTML Tag",
            description = "Defines an abbreviation or an acronym like HTML, CSS, or HTTP.",
            syntax = "<abbr title=\"HyperText Markup Language\">HTML</abbr>",
            exampleCode = "<p>I love learning <abbr title=\"HyperText Markup Language\">HTML</abbr>.</p>"
        ),
        ReferenceItem(
            name = "<address>",
            category = "HTML Tag",
            description = "Defines contact information for the author/owner of a document or article.",
            syntax = "<address>Written by John Doe.<br>Visit us...</address>",
            exampleCode = "<address>Contact: support@webcraft.io<br>Silicon Valley, CA</address>"
        ),
        ReferenceItem(
            name = "<area>",
            category = "HTML Tag",
            description = "Defines an area inside an image map (linked with <map>).",
            syntax = "<area shape=\"rect\" coords=\"34,44,270,350\" href=\"url\">",
            exampleCode = "<map name=\"workmap\">\n  <area shape=\"rect\" coords=\"0,0,82,126\" href=\"sun.htm\">\n</map>"
        ),
        ReferenceItem(
            name = "<article>",
            category = "HTML Tag",
            description = "Specifies independent, self-contained content such as a blog post or news story.",
            syntax = "<article><h2>Title</h2><p>Content...</p></article>",
            exampleCode = "<article>\n  <h2>Cyber Security 2025</h2>\n  <p>New protocols released.</p>\n</article>"
        ),
        ReferenceItem(
            name = "<aside>",
            category = "HTML Tag",
            description = "Defines content aside from the page content (like sidebars or callouts).",
            syntax = "<aside><h4>Related Links</h4>...</aside>",
            exampleCode = "<aside>\n  <h4>Quick Tip</h4>\n  <p>Always close your HTML tags!</p>\n</aside>"
        ),
        ReferenceItem(
            name = "<audio>",
            category = "HTML Tag",
            description = "Embeds sound content in documents with playback controls.",
            syntax = "<audio controls><source src=\"audio.mp3\" type=\"audio/mpeg\"></audio>",
            exampleCode = "<audio controls>\n  <source src=\"cyber-sound.mp3\" type=\"audio/mpeg\">\n</audio>"
        ),
        ReferenceItem(
            name = "<b>",
            category = "HTML Tag",
            description = "Displays text in bold font without extra semantic importance.",
            syntax = "<b>Bold text</b>",
            exampleCode = "<p>This is <b>bold</b> text.</p>"
        ),
        ReferenceItem(
            name = "<base>",
            category = "HTML Tag",
            description = "Specifies the base URL/target for all relative URLs in a document.",
            syntax = "<base href=\"https://www.example.com/images/\" target=\"_blank\">",
            exampleCode = "<head>\n  <base href=\"https://webcraft.io/\">\n</head>"
        ),
        ReferenceItem(
            name = "<blockquote>",
            category = "HTML Tag",
            description = "Specifies a section that is quoted from another source.",
            syntax = "<blockquote cite=\"url\">Quote text here...</blockquote>",
            exampleCode = "<blockquote cite=\"https://www.w3.org\">\n  The Web is designed to work for all people.\n</blockquote>"
        ),
        ReferenceItem(
            name = "<body>",
            category = "HTML Tag",
            description = "Contains all the visible contents of an HTML document.",
            syntax = "<body>...</body>",
            exampleCode = "<body>\n  <h1>Welcome</h1>\n  <p>Visible viewport content.</p>\n</body>"
        ),
        ReferenceItem(
            name = "<br>",
            category = "HTML Tag",
            description = "Inserts a single line break (carriage return).",
            syntax = "First line<br>Second line",
            exampleCode = "<p>Line one<br>Line two on new break.</p>"
        ),
        ReferenceItem(
            name = "<button>",
            category = "HTML Tag",
            description = "Defines a clickable button element.",
            syntax = "<button type=\"button\">Click Me</button>",
            exampleCode = "<button style=\"background:#00f2fe; color:#000; padding:10px;\">Execute</button>"
        ),
        ReferenceItem(
            name = "<canvas>",
            category = "HTML Tag",
            description = "Used to draw graphics on the fly via JavaScript.",
            syntax = "<canvas id=\"myCanvas\" width=\"200\" height=\"100\"></canvas>",
            exampleCode = "<canvas id=\"gameCanvas\" width=\"300\" height=\"150\"></canvas>"
        ),
        ReferenceItem(
            name = "<caption>",
            category = "HTML Tag",
            description = "Defines a table caption, appearing directly above or below a table.",
            syntax = "<table><caption>Monthly Savings</caption>...</table>",
            exampleCode = "<table>\n  <caption>Student Scores 2025</caption>\n  <tr><th>Name</th><th>Score</th></tr>\n</table>"
        ),
        ReferenceItem(
            name = "<cite>",
            category = "HTML Tag",
            description = "Cites the title of a creative work.",
            syntax = "<cite>The Scream</cite> by Edvard Munch.",
            exampleCode = "<p><cite>HTML & CSS Design</cite> by Jon Duckett.</p>"
        ),
        ReferenceItem(
            name = "<code>",
            category = "HTML Tag",
            description = "Specifies a fragment of computer code displayed in monospace font.",
            syntax = "<code>let x = 10;</code>",
            exampleCode = "<p>Use the <code>print()</code> function in Python.</p>"
        ),
        ReferenceItem(
            name = "<data>",
            category = "HTML Tag",
            description = "Links a given content with a machine-readable translation.",
            syntax = "<data value=\"398\">Smart Watch</data>",
            exampleCode = "<p>Item: <data value=\"1005\">Cyber Shield v2</data></p>"
        ),
        ReferenceItem(
            name = "<datalist>",
            category = "HTML Tag",
            description = "Specifies a list of pre-defined options for <input> elements.",
            syntax = "<datalist id=\"browsers\"><option value=\"Chrome\"></datalist>",
            exampleCode = "<input list=\"browsers\">\n<datalist id=\"browsers\">\n  <option value=\"Chrome\">\n  <option value=\"Firefox\">\n</datalist>"
        ),
        ReferenceItem(
            name = "<details>",
            category = "HTML Tag",
            description = "Creates a disclosure widget that the user can open and close.",
            syntax = "<details><summary>Click to expand</summary>Hidden content...</details>",
            exampleCode = "<details>\n  <summary>System Specifications</summary>\n  <p>CPU: Quantum 8-Core<br>RAM: 64GB</p>\n</details>"
        ),
        ReferenceItem(
            name = "<dialog>",
            category = "HTML Tag",
            description = "Defines a dialog box or sub-window modal.",
            syntax = "<dialog open>This is an open dialog window</dialog>",
            exampleCode = "<dialog open>\n  <p>System Alert: Update available!</p>\n  <button>Close</button>\n</dialog>"
        ),
        ReferenceItem(
            name = "<div>",
            category = "HTML Tag",
            description = "A generic container block element for grouping content.",
            syntax = "<div class=\"container\">...</div>",
            exampleCode = "<div style=\"background:#131c2e; padding:15px;\">\n  <h3>Container Box</h3>\n</div>"
        ),
        ReferenceItem(
            name = "<dl>, <dt>, <dd>",
            category = "HTML Tag",
            description = "Description list (<dl>) containing terms (<dt>) and descriptions (<dd>).",
            syntax = "<dl><dt>HTML</dt><dd>Markup Language</dd></dl>",
            exampleCode = "<dl>\n  <dt>CSS</dt>\n  <dd>Cascading Style Sheets</dd>\n  <dt>HTML</dt>\n  <dd>HyperText Markup</dd>\n</dl>"
        ),
        ReferenceItem(
            name = "<em>",
            category = "HTML Tag",
            description = "Renders italicized text with emphasized semantic stress.",
            syntax = "<em>Emphasized text</em>",
            exampleCode = "<p>Do not <em>ever</em> delete system root.</p>"
        ),
        ReferenceItem(
            name = "<embed>",
            category = "HTML Tag",
            description = "Defines a container for an external application or interactive content (plugin).",
            syntax = "<embed src=\"snippet.swf\" width=\"300\" height=\"200\">",
            exampleCode = "<embed src=\"interactive.svg\" width=\"200\" height=\"200\">"
        ),
        ReferenceItem(
            name = "<fieldset>",
            category = "HTML Tag",
            description = "Groups related elements in a form, often styled with a border and <legend>.",
            syntax = "<fieldset><legend>Personal Info</legend>...</fieldset>",
            exampleCode = "<fieldset>\n  <legend>User Credentials</legend>\n  <input type=\"text\" placeholder=\"Username\">\n</fieldset>"
        ),
        ReferenceItem(
            name = "<figure> & <figcaption>",
            category = "HTML Tag",
            description = "Self-contained content (<figure>) with an optional caption (<figcaption>).",
            syntax = "<figure><img src=\"img.png\"><figcaption>Caption</figcaption></figure>",
            exampleCode = "<figure>\n  <img src=\"cyber-node.png\" alt=\"Node\" width=\"120\">\n  <figcaption>Fig 1.0 - Cyber Node Architecture</figcaption>\n</figure>"
        ),
        ReferenceItem(
            name = "<footer>",
            category = "HTML Tag",
            description = "Defines a footer for a document or section, containing copyright or links.",
            syntax = "<footer><p>&copy; 2025 WebCraft</p></footer>",
            exampleCode = "<footer>\n  <p>All rights reserved &copy; 2025</p>\n</footer>"
        ),
        ReferenceItem(
            name = "<form>",
            category = "HTML Tag",
            description = "Creates an HTML form for collecting user input.",
            syntax = "<form action=\"/submit\">...</form>",
            exampleCode = "<form>\n  <input type=\"email\" placeholder=\"Enter email...\">\n  <button type=\"submit\">Subscribe</button>\n</form>"
        ),
        ReferenceItem(
            name = "<head>",
            category = "HTML Tag",
            description = "Contains metadata about the HTML document (title, styles, charset).",
            syntax = "<head><title>Page Title</title></head>",
            exampleCode = "<head>\n  <meta charset=\"UTF-8\">\n  <title>Cyber Academy</title>\n</head>"
        ),
        ReferenceItem(
            name = "<header>",
            category = "HTML Tag",
            description = "Represents introductory content or a navigation bar container.",
            syntax = "<header><h1>Site Title</h1></header>",
            exampleCode = "<header>\n  <h2>DEV_PULSE NETWORK</h2>\n</header>"
        ),
        ReferenceItem(
            name = "<hr>",
            category = "HTML Tag",
            description = "Thematic break or horizontal rule separator line.",
            syntax = "<hr>",
            exampleCode = "<p>Section One</p><hr><p>Section Two</p>"
        ),
        ReferenceItem(
            name = "<html>",
            category = "HTML Tag",
            description = "Root element of an HTML document.",
            syntax = "<html lang=\"en\">...</html>",
            exampleCode = "<html lang=\"en\">\n  <body><h1>Root Element</h1></body>\n</html>"
        ),
        ReferenceItem(
            name = "<iframe>",
            category = "HTML Tag",
            description = "Embeds an inline frame (another HTML document) within the current page.",
            syntax = "<iframe src=\"https://example.com\" width=\"300\" height=\"200\"></iframe>",
            exampleCode = "<iframe src=\"https://www.wikipedia.org\" width=\"100%\" height=\"200\"></iframe>"
        ),
        ReferenceItem(
            name = "<img>",
            category = "HTML Tag",
            description = "Embeds images into web pages.",
            syntax = "<img src=\"url\" alt=\"text\">",
            exampleCode = "<img src=\"https://picsum.photos/200/100\" alt=\"Random Image\">"
        ),
        ReferenceItem(
            name = "<input>",
            category = "HTML Tag",
            description = "Interactive form control for gathering user data (text, checkbox, radio, file, etc.).",
            syntax = "<input type=\"text\" name=\"username\">",
            exampleCode = "<input type=\"password\" placeholder=\"Enter password...\">"
        ),
        ReferenceItem(
            name = "<kbd>",
            category = "HTML Tag",
            description = "Represents user keyboard input text formatting.",
            syntax = "Press <kbd>Ctrl</kbd> + <kbd>C</kbd> to copy.",
            exampleCode = "<p>Press <kbd>Cmd</kbd> + <kbd>R</kbd> to reload.</p>"
        ),
        ReferenceItem(
            name = "<label>",
            category = "HTML Tag",
            description = "Defines a caption or accessible label for form elements.",
            syntax = "<label for=\"email\">Email:</label>",
            exampleCode = "<label for=\"uname\">Username:</label>\n<input id=\"uname\" type=\"text\">"
        ),
        ReferenceItem(
            name = "<li>",
            category = "HTML Tag",
            description = "Defines a list item inside <ul> or <ol> containers.",
            syntax = "<ul><li>List Item</li></ul>",
            exampleCode = "<ul>\n  <li>Item Alpha</li>\n  <li>Item Beta</li>\n</ul>"
        ),
        ReferenceItem(
            name = "<link>",
            category = "HTML Tag",
            description = "Links external resources like CSS stylesheets to the document.",
            syntax = "<link rel=\"stylesheet\" href=\"style.css\">",
            exampleCode = "<link rel=\"stylesheet\" href=\"main.css\">"
        ),
        ReferenceItem(
            name = "<main>",
            category = "HTML Tag",
            description = "Specifies the dominant primary content of the <body>.",
            syntax = "<main><h1>Main Article</h1></main>",
            exampleCode = "<main>\n  <h2>Primary Lesson Content</h2>\n</main>"
        ),
        ReferenceItem(
            name = "<map>",
            category = "HTML Tag",
            description = "Defines an image map with clickable <area> regions.",
            syntax = "<map name=\"planetmap\">...</map>",
            exampleCode = "<map name=\"navigation\">\n  <area shape=\"default\" href=\"home.html\">\n</map>"
        ),
        ReferenceItem(
            name = "<mark>",
            category = "HTML Tag",
            description = "Defines highlighted or marked text for reference.",
            syntax = "<mark>Highlighted text</mark>",
            exampleCode = "<p>Do not forget to <mark>review CSS Flexbox</mark> today.</p>"
        ),
        ReferenceItem(
            name = "<meta>",
            category = "HTML Tag",
            description = "Provides metadata (character set, viewport scaling, author description).",
            syntax = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
            exampleCode = "<meta charset=\"UTF-8\">\n<meta name=\"description\" content=\"Web Development Course\">"
        ),
        ReferenceItem(
            name = "<meter>",
            category = "HTML Tag",
            description = "Represents a scalar measurement within a known range (gauge meter).",
            syntax = "<meter value=\"2\" min=\"0\" max=\"10\">2/10</meter>",
            exampleCode = "<label>Disk Usage:</label>\n<meter value=\"0.7\">70%</meter>"
        ),
        ReferenceItem(
            name = "<nav>",
            category = "HTML Tag",
            description = "Defines a section of navigation links.",
            syntax = "<nav><a href=\"#\">Home</a></nav>",
            exampleCode = "<nav>\n  <a href=\"#\">Dashboard</a> | <a href=\"#\">Settings</a>\n</nav>"
        ),
        ReferenceItem(
            name = "<ol>",
            category = "HTML Tag",
            description = "Defines an ordered (numbered) list.",
            syntax = "<ol><li>First</li><li>Second</li></ol>",
            exampleCode = "<ol>\n  <li>Step One</li>\n  <li>Step Two</li>\n</ol>"
        ),
        ReferenceItem(
            name = "<option>",
            category = "HTML Tag",
            description = "Defines an option item inside a <select> dropdown list.",
            syntax = "<select><option value=\"1\">One</option></select>",
            exampleCode = "<select>\n  <option value=\"html\">HTML5</option>\n  <option value=\"css\">CSS3</option>\n</select>"
        ),
        ReferenceItem(
            name = "<output>",
            category = "HTML Tag",
            description = "Represents the result of a calculation or user action.",
            syntax = "<output name=\"result\">42</output>",
            exampleCode = "<form oninput=\"result.value=parseInt(a.value)+parseInt(b.value)\">\n  <output name=\"result\">0</output>\n</form>"
        ),
        ReferenceItem(
            name = "<p>",
            category = "HTML Tag",
            description = "Defines a paragraph block of text.",
            syntax = "<p>Paragraph content...</p>",
            exampleCode = "<p>Welcome to the ultimate web development course.</p>"
        ),
        ReferenceItem(
            name = "<picture>",
            category = "HTML Tag",
            description = "Provides multiple image sources for different screen sizes or device types.",
            syntax = "<picture><source media=\"(min-width)\" srcset=\"img.jpg\"><img src=\"default.jpg\"></picture>",
            exampleCode = "<picture>\n  <source srcset=\"cyber-large.png\" media=\"(min-width: 800px)\">\n  <img src=\"cyber-small.png\" alt=\"Cyber\">\n</picture>"
        ),
        ReferenceItem(
            name = "<pre>",
            category = "HTML Tag",
            description = "Defines preformatted text with preserved whitespace and line breaks.",
            syntax = "<pre>Text with    spaces preserved.</pre>",
            exampleCode = "<pre>\n  function init() {\n      console.log('Ready');\n  }\n</pre>"
        ),
        ReferenceItem(
            name = "<progress>",
            category = "HTML Tag",
            description = "Represents the completion progress of a task (progress bar).",
            syntax = "<progress value=\"70\" max=\"100\">70%</progress>",
            exampleCode = "<label>Course Progress:</label>\n<progress value=\"60\" max=\"100\"></progress>"
        ),
        ReferenceItem(
            name = "<q>",
            category = "HTML Tag",
            description = "Defines a short inline quotation.",
            syntax = "<q>Code is poetry.</q>",
            exampleCode = "<p>Linus Torvalds said: <q>Talk is cheap. Show me the code.</q></p>"
        ),
        ReferenceItem(
            name = "<script>",
            category = "HTML Tag",
            description = "Embeds client-side executable scripts (JavaScript).",
            syntax = "<script>console.log('Hello');</script>",
            exampleCode = "<script>\n  alert('Welcome to Cyber Academy!');\n</script>"
        ),
        ReferenceItem(
            name = "<section>",
            category = "HTML Tag",
            description = "Defines a thematic grouping of content in a document.",
            syntax = "<section><h2>Chapter 1</h2>...</section>",
            exampleCode = "<section>\n  <h2>Module 1 Overview</h2>\n  <p>Introduction to HTML tags.</p>\n</section>"
        ),
        ReferenceItem(
            name = "<select>",
            category = "HTML Tag",
            description = "Defines a drop-down selection list containing <option> items.",
            syntax = "<select><option>Opt 1</option></select>",
            exampleCode = "<select>\n  <option>Dark Theme</option>\n  <option>Light Theme</option>\n</select>"
        ),
        ReferenceItem(
            name = "<span>",
            category = "HTML Tag",
            description = "Inline container for styling text or grouping inline elements.",
            syntax = "<span style=\"color: cyan;\">Inline text</span>",
            exampleCode = "<p>Status: <span style=\"color:#00ff9d;\">ONLINE</span></p>"
        ),
        ReferenceItem(
            name = "<strong>",
            category = "HTML Tag",
            description = "Defines strong importance with bold default styling.",
            syntax = "<strong>Important Notice</strong>",
            exampleCode = "<p><strong>Warning:</strong> Always backup your database.</p>"
        ),
        ReferenceItem(
            name = "<style>",
            category = "HTML Tag",
            description = "Contains internal CSS style rules for an HTML document.",
            syntax = "<style>body { background: #000; }</style>",
            exampleCode = "<style>\n  h1 { color: #00f2fe; }\n</style>"
        ),
        ReferenceItem(
            name = "<table>",
            category = "HTML Tag",
            description = "Creates a table container for rows and cells.",
            syntax = "<table><tr><td>Cell</td></tr></table>",
            exampleCode = "<table border=\"1\">\n  <tr><td>Data A</td><td>Data B</td></tr>\n</table>"
        ),
        ReferenceItem(
            name = "<textarea>",
            category = "HTML Tag",
            description = "Defines a multi-line text input control (text box).",
            syntax = "<textarea rows=\"4\" cols=\"50\">Default text...</textarea>",
            exampleCode = "<textarea placeholder=\"Write your code notes here...\"></textarea>"
        ),
        ReferenceItem(
            name = "<time>",
            category = "HTML Tag",
            description = "Represents a specific time or date stamp.",
            syntax = "<time datetime=\"2025-12-31\">Dec 31</time>",
            exampleCode = "<p>Course launched on <time datetime=\"2025-01-01\">January 1, 2025</time>.</p>"
        ),
        ReferenceItem(
            name = "<title>",
            category = "HTML Tag",
            description = "Defines the document title shown in browser tabs and search results.",
            syntax = "<title>Page Title</title>",
            exampleCode = "<head>\n  <title>HTML & CSS Academy</title>\n</head>"
        ),
        ReferenceItem(
            name = "<ul>",
            category = "HTML Tag",
            description = "Defines an unordered (bulleted) list.",
            syntax = "<ul><li>Item</li></ul>",
            exampleCode = "<ul>\n  <li>HTML</li>\n  <li>CSS</li>\n  <li>JavaScript</li>\n</ul>"
        ),
        ReferenceItem(
            name = "<video>",
            category = "HTML Tag",
            description = "Embeds video playback in HTML documents.",
            syntax = "<video controls src=\"movie.mp4\"></video>",
            exampleCode = "<video controls width=\"300\">\n  <source src=\"tutorial.mp4\" type=\"video/mp4\">\n</video>"
        ),

        // --- CSS PROPERTIES ---
        ReferenceItem(
            name = "background-color",
            category = "CSS Property",
            description = "Sets the background color of an element.",
            syntax = "background-color: #0b0f19;",
            exampleCode = "div { background-color: #131c2e; padding: 20px; }"
        ),
        ReferenceItem(
            name = "border",
            category = "CSS Property",
            description = "Sets an element's border width, style, and color in shorthand.",
            syntax = "border: 2px solid #00f2fe;",
            exampleCode = ".card { border: 2px solid #00f2fe; border-radius: 8px; }"
        ),
        ReferenceItem(
            name = "border-radius",
            category = "CSS Property",
            description = "Rounds the corners of an element's outer border edge.",
            syntax = "border-radius: 12px;",
            exampleCode = ".button { border-radius: 6px; padding: 10px; }"
        ),
        ReferenceItem(
            name = "box-shadow",
            category = "CSS Property",
            description = "Adds shadow effects around an element's frame (great for neon glows).",
            syntax = "box-shadow: 0 0 20px rgba(0,242,254,0.4);",
            exampleCode = ".glow-box { box-shadow: 0 0 25px rgba(0,242,254,0.5); }"
        ),
        ReferenceItem(
            name = "color",
            category = "CSS Property",
            description = "Sets the foreground text color of an element.",
            syntax = "color: #00f2fe;",
            exampleCode = "h1 { color: #00f2fe; font-family: monospace; }"
        ),
        ReferenceItem(
            name = "display",
            category = "CSS Property",
            description = "Specifies how an element is displayed (block, inline, flex, grid, none).",
            syntax = "display: flex; /* or grid, block, none */",
            exampleCode = ".container { display: flex; justify-content: center; }"
        ),
        ReferenceItem(
            name = "flex",
            category = "CSS Property",
            description = "Shorthand property for flex-grow, flex-shrink, and flex-basis.",
            syntax = "flex: 1;",
            exampleCode = ".item { flex: 1; margin: 5px; }"
        ),
        ReferenceItem(
            name = "font-family",
            category = "CSS Property",
            description = "Specifies the font typeface for text.",
            syntax = "font-family: monospace, sans-serif;",
            exampleCode = "body { font-family: monospace; }"
        ),
        ReferenceItem(
            name = "font-size",
            category = "CSS Property",
            description = "Sets the size of the font.",
            syntax = "font-size: 18px; /* or 1.5rem */",
            exampleCode = "h2 { font-size: 24px; color: #4facfe; }"
        ),
        ReferenceItem(
            name = "font-weight",
            category = "CSS Property",
            description = "Sets how thick or thin characters in text are displayed.",
            syntax = "font-weight: bold; /* or 400, 700, 900 */",
            exampleCode = ".bold-text { font-weight: bold; }"
        ),
        ReferenceItem(
            name = "gap",
            category = "CSS Property",
            description = "Sets the spacing between rows and columns in Flexbox and Grid containers.",
            syntax = "gap: 20px;",
            exampleCode = ".grid { display: grid; grid-template-columns: 1fr 1fr; gap: 15px; }"
        ),
        ReferenceItem(
            name = "grid-template-columns",
            category = "CSS Property",
            description = "Defines the column tracks in a CSS Grid layout.",
            syntax = "grid-template-columns: repeat(3, 1fr);",
            exampleCode = ".dashboard { display: grid; grid-template-columns: 1fr 2fr; }"
        ),
        ReferenceItem(
            name = "height & width",
            category = "CSS Property",
            description = "Sets the vertical and horizontal dimensions of an element.",
            syntax = "width: 100%; height: 200px;",
            exampleCode = ".box { width: 300px; height: 150px; background: #1a2642; }"
        ),
        ReferenceItem(
            name = "justify-content & align-items",
            category = "CSS Property",
            description = "Aligns flex items along the main and cross axes.",
            syntax = "justify-content: space-between; align-items: center;",
            exampleCode = ".navbar { display: flex; justify-content: space-between; align-items: center; }"
        ),
        ReferenceItem(
            name = "margin",
            category = "CSS Property",
            description = "Sets outer spacing around elements outside their border.",
            syntax = "margin: 20px auto;",
            exampleCode = ".centered-card { margin: 20px auto; width: 300px; }"
        ),
        ReferenceItem(
            name = "opacity",
            category = "CSS Property",
            description = "Sets the transparency level of an element.",
            syntax = "opacity: 0.8;",
            exampleCode = ".faded { opacity: 0.5; }"
        ),
        ReferenceItem(
            name = "padding",
            category = "CSS Property",
            description = "Sets inner spacing between the element content and its border.",
            syntax = "padding: 15px 25px;",
            exampleCode = "button { padding: 12px 24px; background: #00f2fe; }"
        ),
        ReferenceItem(
            name = "position",
            category = "CSS Property",
            description = "Specifies the positioning method (static, relative, absolute, fixed, sticky).",
            syntax = "position: relative; /* or absolute, fixed */",
            exampleCode = ".modal { position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); }"
        ),
        ReferenceItem(
            name = "text-align",
            category = "CSS Property",
            description = "Sets the horizontal alignment of text (left, right, center, justify).",
            syntax = "text-align: center;",
            exampleCode = "h1 { text-align: center; color: #00f2fe; }"
        ),
        ReferenceItem(
            name = "text-decoration",
            category = "CSS Property",
            description = "Sets or removes decorations on text (underline, line-through, none).",
            syntax = "text-decoration: none;",
            exampleCode = "a { text-decoration: none; color: #00f2fe; }"
        )
    )
}
