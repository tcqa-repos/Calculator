package MyProject_SubProjectA.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectA_Build3_2 : BuildType({
    uuid = "afef5546-19ab-4f0d-8855-cb2c8644a06f"
    extId = "MyProject_SubProjectA_Build3_2"
    name = "Build3 (1)"

    vcs {
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster, "rules1 => Claculator")
        root(MyProject_SubProjectA.vcsRoots.MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster1)
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposDotNetSamplesRefsHeadsMaster, "+:. => .=>dotnet")

    }
})
