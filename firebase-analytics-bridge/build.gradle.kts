plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(29)

    lintOptions {
        tasks.lint {
            enabled = false
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    api("com.google.firebase:firebase-analytics-ktx:17.5.0")
    api("com.github.inkapplications.kimchi:analytics:1.0.2")
}
