# ClosureAutumn

ClosureAutumn is a warm dark theme for JetBrains IDEs version 2026.1 and later.
Its palette follows the local Closure-Autumn theme in Cursor and VS Code:
warm charcoal backgrounds, coral accents, pale-gold types, mint methods,
soft-green strings, and warm-white variables.

The plugin contains one UI theme and one matching editor color scheme. It has
its own plugin ID, so it can be installed alongside Closure Theme.

Language mappings cover Java, Kotlin, Groovy, Scala, Python, JavaScript,
TypeScript, PHP, Go, C/C++, SQL, Ruby, Rust, and common web, data, markup,
and shell formats. Rider-specific ReSharper mappings are included.

## Build

```powershell
.\gradlew.bat verifyPluginProjectConfiguration buildPlugin --console=plain --no-daemon
```

The generated package is `build/distributions/ClosureAutumn-1.0.0.zip`.
Gradle uses IntelliJ IDEA 2026.1.4 as its baseline. To use a local IDE instead,
pass `-PplatformPath=<path-to-ide>`.

Run `./gradlew.bat verifyPlugin` for cross-product compatibility checks.
This task may download IDE distributions.

## Install

In the IDE's plugin settings, choose **Install Plugin from Disk**, select
the generated ZIP, and restart the IDE. Select **ClosureAutumn** under
**Appearance & Behavior | Appearance** and **Editor | Color Scheme**.

Custom editor schemes may retain earlier colors. Select the bundled
ClosureAutumn scheme to see the palette shipped with the plugin.

## License

MIT. See [LICENSE](LICENSE).
