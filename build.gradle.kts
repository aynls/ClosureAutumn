import org.jetbrains.intellij.platform.gradle.IntelliJPlatformType
import org.jetbrains.intellij.platform.gradle.models.ProductRelease

plugins {
    id("org.jetbrains.intellij.platform") version "2.17.0"
}

group = "dev.closureautumn"
version = "1.0.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        val localPlatformPath = providers.gradleProperty("platformPath").orNull
        if (localPlatformPath != null) {
            local(localPlatformPath)
        } else {
            intellijIdea("2026.1.4")
        }
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "261"
        }
    }

    pluginVerification {
        ides {
            latest {
                types = listOf(
                    IntelliJPlatformType.IntellijIdea,
                    IntelliJPlatformType.PyCharm,
                    IntelliJPlatformType.WebStorm,
                    IntelliJPlatformType.PhpStorm,
                    IntelliJPlatformType.GoLand,
                    IntelliJPlatformType.CLion,
                    IntelliJPlatformType.DataGrip,
                    IntelliJPlatformType.Rider,
                    IntelliJPlatformType.RubyMine,
                    IntelliJPlatformType.RustRover,
                )
                channels = listOf(ProductRelease.Channel.RELEASE)
                sinceBuild = "261"
                untilBuild = "261.*"
            }
        }
    }
}

tasks {
    // A theme contributes no searchable settings, so launching an IDE to index
    // searchable options would add minutes without producing useful output.
    buildSearchableOptions {
        enabled = false
    }
}
