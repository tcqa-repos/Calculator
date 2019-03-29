package MyProject_SubProjectB.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectB_Build2 : BuildType({
    uuid = "c2ca3394-6b2f-459f-af64-b829d1e7faf2"
    extId = "MyProject_SubProjectB_Build2"
    name = "Build2"
    description = "MyProject Calculator"

    artifactRules = "**/* => artifacts.zip"

    vcs {
        root(MyProject_SubProjectB.vcsRoots.MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster1)
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster)

    }
})
