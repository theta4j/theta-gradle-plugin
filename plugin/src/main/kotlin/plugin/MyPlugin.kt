package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

open class MyPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {

            tasks.create("myTask") {
                group = "sample"
                doLast {
                    println("hello myTask")
                }
            }
        }
    }
}
