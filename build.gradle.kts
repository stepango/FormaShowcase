// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.0-rc03")
    }
}

plugins {
    id("com.stepango.forma") version "0.0.1"
}

androidProjectConfiguration(
    minSdk = 21,
    targetSdk = 29,
    compileSdk = 29,
    kotlinVersion = "1.4.10",
    agpVersion = "4.0.0",
    versionCode = 1,
    versionName = "1.0",
    repositories = {
        google()
        jcenter()
    }
)
