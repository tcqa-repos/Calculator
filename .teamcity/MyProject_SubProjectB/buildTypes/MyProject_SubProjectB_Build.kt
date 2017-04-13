package MyProject_SubProjectB.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectB_Build : BuildType({
    uuid = "f8820b37-7359-46f2-b674-fe597e4a6988"
    extId = "MyProject_SubProjectB_Build"
    name = "Build"
    description = "Calculator MyProject"

    artifactRules = "**/* => artifacts.zip"

    vcs {
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster)
        root(MyProject_SubProjectB.vcsRoots.MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster)

    }
})
