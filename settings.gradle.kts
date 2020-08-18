rootProject.buildFileName = "build.gradle.kts"

include(":hyperion-leakcanary")

pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
    }

    plugins {
        id("org.jetbrains.kotlin.kapt") version "1.4.0"
        id("org.jetbrains.kotlin.android") version "1.4.0"
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:4.0.1")
            }
        }
    }
}
