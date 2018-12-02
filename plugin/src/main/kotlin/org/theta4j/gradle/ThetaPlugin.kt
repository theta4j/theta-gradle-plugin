package org.theta4j.gradle

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

open class ThetaPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.afterEvaluate {
            val android = project.property("android") as AppExtension
            android.adbOptions.installOptions("-g") // grant all runtime permissions
        }
    }
}
