pluginManagement {
    repositories {
        maven { url = uri("../plugin/build/repository") }
        google()
        jcenter()
    }
}

include(":app")
