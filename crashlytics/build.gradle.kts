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
    api("com.google.firebase:firebase-crashlytics-ktx:18.1.0")
    api("com.inkapplications.kimchi:logger:1.1.0")
}
