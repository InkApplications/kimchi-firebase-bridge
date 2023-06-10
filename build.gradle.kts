import org.gradle.api.tasks.testing.logging.TestExceptionFormat

subprojects {
    repositories {
        mavenCentral()
        google()
    }
    tasks.withType(Test::class) {
        testLogging.exceptionFormat = TestExceptionFormat.FULL
    }
}

repositories {
    mavenCentral()
}

tasks.create("zipPublications", Zip::class) {
    archiveBaseName.set("publications")
    destinationDirectory.set(File(buildDir, "distributions"))
    from("analytics/build/repo/")
    from("crashlytics/build/repo/")
}
