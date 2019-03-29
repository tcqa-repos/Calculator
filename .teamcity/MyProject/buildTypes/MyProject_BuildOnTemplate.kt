package MyProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_BuildOnTemplate : BuildType({
    template(MyProject.buildTypes.MyProject_Template)
    uuid = "e4245610-b0b6-4ac8-aee7-b374b1d6c055"
    extId = "MyProject_BuildOnTemplate"
    name = "Build on template"
})
