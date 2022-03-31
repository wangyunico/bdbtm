package com.bytedance.bdbtm.services

import com.intellij.openapi.project.Project
import com.bytedance.bdbtm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
