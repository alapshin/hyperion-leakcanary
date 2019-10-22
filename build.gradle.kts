allprojects {
    repositories {
        flatDir {
            dirs("libs")
        }
        google()
        jcenter()
        gradlePluginPortal()
    }
}

subprojects {
    project.afterEvaluate {
        project.tasks.withType(JavaCompile::class).configureEach {
            // Show more compilation errors
            // By default javac outputs 100 errors at most
            // When using multiple libraries that rely on annotation processing
            // this limit could be easily exceeded and real cause can be swallowed
            // See https://github.com/google/dagger/issues/306#issuecomment-180283287
            options.compilerArgs.addAll(listOf("-Xmaxerrs", "500"))
        }
    }
}

