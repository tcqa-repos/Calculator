package MyProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object MyProject_Build : BuildType({
    uuid = "5342d256-92db-46f0-a031-bd702493ffc6"
    extId = "MyProject_Build"
    name = "Build"

    artifactRules = "file.txt =>"

    steps {
        script {
            scriptContent = "echo some string >> file.txt"
        }
        script {
            scriptContent = """
                echo 1%
                echo 2%%
                echo 3%%%
                echo 4%%%%
            """.trimIndent()
        }
    }
})
