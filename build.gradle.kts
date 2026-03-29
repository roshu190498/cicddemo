// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

tasks.register("fixGradleCache") {
    doLast {
        val cacheDir = file("/Users/roshansinhe/.gradle/caches/journal-1")
        if (cacheDir.exists()) {
            if (cacheDir.deleteRecursively()) {
                println("Successfully deleted corrupted cache directory: ${cacheDir.absolutePath}")
            } else {
                println("Failed to delete cache directory.")
            }
        } else {
            println("Cache directory not found.")
        }
    }
}
