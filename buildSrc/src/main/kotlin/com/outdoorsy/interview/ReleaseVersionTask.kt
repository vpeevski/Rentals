package com.outdoorsy.interview

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File
open class ReleaseVersionTask : DefaultTask {
    @Input
    var release: Boolean = false

    @OutputFile
    lateinit var destFile: File

    constructor() {
        group = "versioning"
        description = "Makes project a release version."
    }

    @TaskAction
    fun start() {
        (project.version as ProjectVersion)
    }
}