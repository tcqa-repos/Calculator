package Calculator.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.IdeaRunner
import jetbrains.buildServer.configs.kotlin.v10.IdeaRunner.*
import jetbrains.buildServer.configs.kotlin.v10.ideaRunner
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Calculator_Build : BuildType({
    uuid = "212be154-7bd2-4680-8710-ae19034c8d09"
    extId = "Calculator_Build"
    name = "Build"

    vcs {
        root(Calculator.vcsRoots.Calculator_HttpGithubComTcqaReposCalculatorRefsHeadsMaster)

    }

    steps {
        ideaRunner {
            pathToProject = ""
            jdk {
                name = "1.7"
                path = "%env.JDK_17%"
                patterns("jre/lib/*.jar", "jre/lib/ext/jfxrt.jar")
                extAnnotationPatterns("%teamcity.tool.idea%/lib/jdkAnnotations.jar")
            }
            jvmArgs = "-Xmx256m"
        }
    }

    triggers {
        vcs {
        }
    }
})
