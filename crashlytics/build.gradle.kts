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
    implementation(kotlin("stdlib"))
    api("com.google.firebase:firebase-crashlytics-ktx:17.2.1")
    api("com.github.inkapplications.kimchi:logger:1.0.2")
}
