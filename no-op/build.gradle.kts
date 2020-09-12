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