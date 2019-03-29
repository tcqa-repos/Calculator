package MyProject_SubProjectA.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectA_Build3 : BuildType({
    uuid = "d6af11ea-ff38-468e-bad8-42a236c41574"
    extId = "MyProject_SubProjectA_Build3"
    name = "Build3"

    vcs {
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster, "rules1 => Claculator")
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposDotNetSamplesRefsHeadsMaster, "rules2 => 1")

    }
})
