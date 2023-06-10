plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("com.inkapplications.publishing")
}

android {
    compileSdk = 33
    defaultConfig {
        minSdk = 16
    }
    tasks.lint {
        enabled = false
    }
}

dependencies {
    api("com.google.firebase:firebase-crashlytics-ktx:18.3.7")
    api(libs.kimchi.logger)
}

kotlin {
    android {
        publishAllLibraryVariants()
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                name.set("Kimchi Firebase Crashlytics Bridge")
                description.set("Crashlytics adapter for Kimchi Logger")
                url.set("https://kimchi.inkapplications.com")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://choosealicense.com/licenses/mit/")
                    }
                }
                developers {
                    developer {
                        id.set("reneevandervelde")
                        name.set("Renee Vandervelde")
                        email.set("Renee@InkApplications.com")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/InkApplications/kimchi.git")
                    developerConnection.set("scm:git:ssh://git@github.com:InkApplications/kimchi.git")
                    url.set("https://github.com/InkApplications/kimchi")
                }
            }
        }
    }
}
