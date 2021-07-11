import org.gradle.api.tasks.testing.logging.TestExceptionFormat

buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.5.10"))
        classpath("com.android.tools.build:gradle:3.6.4")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
    }
}

subprojects {
    group = "com.github.inkapplications.kimchi-firebase-bridge"
    version = if (version != "unspecified") version else "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
    }
    tasks.withType(Test::class) {
        testLogging.exceptionFormat = TestExceptionFormat.FULL
    }
}
