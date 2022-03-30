package com.github.wangyunico.bdbtm.services

import com.intellij.openapi.project.Project
import com.github.wangyunico.bdbtm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
