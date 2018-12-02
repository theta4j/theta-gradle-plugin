# theta-gradle-plugin

Gradle plugin for THETA plug-in development.

## Features

1. Grant automatically all runtime permissions on the installation.

## Usage

Add the plugin to your project `build.gradle.kts`.

This plugin requires Android Gradle plugin v3.2.0 or higher.

```kotlin
plugins {
    id("com.android.application")            // v3.2.0 or higher is required
    id("org.theta4j.gradle") version "0.0.1" // insert this line
}
```
