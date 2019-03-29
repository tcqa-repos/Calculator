package MyProject_SubProjectA.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectA_Build : BuildType({
    uuid = "4b95ca33-52f8-4b3f-998b-e7d0c19d5d47"
    extId = "MyProject_SubProjectA_Build"
    name = "Build"
    description = "Calculator MyProject"

    vcs {
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster)
        root(MyProject_SubProjectA.vcsRoots.MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster)

    }
})
