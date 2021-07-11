plugins {
    id("com.android.library")
    kotlin("android")
    id("com.github.dcendents.android-maven")
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
    api("com.google.firebase:firebase-analytics-ktx:19.0.0")
    api("com.inkapplications.kimchi:analytics:1.1.0")
}
