package MyProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object MyProject_HttpsGithubComTcqaReposDotNetSamplesRefsHeadsMaster : GitVcsRoot({
    uuid = "7a40409d-ab66-4a50-af6b-d3591e27a937"
    extId = "MyProject_HttpsGithubComTcqaReposDotNetSamplesRefsHeadsMaster"
    name = "https://github.com/tcqa-repos/DotNetSamples#refs/heads/master"
    url = "https://github.com/tcqa-repos/DotNetSamples"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx752dd25e289c95a13cecab58e9da506c421401754f05a24750bace6f2df053bac3bf9152128ee989775d03cbe80d301b"
    }
})
