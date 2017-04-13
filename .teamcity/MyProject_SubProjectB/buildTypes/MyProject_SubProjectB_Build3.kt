package MyProject_SubProjectB.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectB_Build3 : BuildType({
    uuid = "6a0a9fe2-a624-4989-9500-6b460a4aa4f1"
    extId = "MyProject_SubProjectB_Build3"
    name = "Build3"

    vcs {
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster, "rules1 => Claculator")
        root(MyProject_SubProjectB.vcsRoots.MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster)
        root(MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposDotNetSamplesRefsHeadsMaster, "+:. => .=>dotnet")

    }
})
