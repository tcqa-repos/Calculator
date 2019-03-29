package MyProject_SubProjectA.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectA_Template : Template({
    uuid = "d8d2ecb5-6dfe-4189-9c8d-e40bd1744460"
    extId = "MyProject_SubProjectA_Template"
    name = "Template"

    vcs {
        root(MyProject_SubProjectA.vcsRoots.MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster)
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster)

    }
})
