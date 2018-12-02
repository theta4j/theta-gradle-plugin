plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.0"
}

group = "org.theta4j"
version = "0.0.1"

gradlePlugin {
    plugins {
        create("gradle") {
            id = "org.theta4j.gradle"
            implementationClass = "org.theta4j.gradle.ThetaPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/theta4j/theta-gradle-plugin"
    vcsUrl = "https://github.com/theta4j/theta-gradle-plugin.git"
    description = "Gradle plugin for THETA plug-in development."
    (plugins) {
        "gradle" {
            // id is captured from java-gradle-plugin configuration
            displayName = "THETA Gradle plug-in"
            tags = listOf("theta")
            version = project.version.toString()
        }
    }
    mavenCoordinates {
        groupId = "org.theta4j"
        artifactId = "gradle"
        version = project.version.toString()
    }
}

publishing {
    repositories {
        maven(url = "build/repository")
    }
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build", "gradle", "3.2.1")
}
