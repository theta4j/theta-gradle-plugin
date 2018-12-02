import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("org.theta4j.gradle") version "0.0.1"
}

android {
    compileSdkVersion(25)
    // adbOptions.installOptions("-g") // grant all runtime permissions
}

dependencies {
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))
}
