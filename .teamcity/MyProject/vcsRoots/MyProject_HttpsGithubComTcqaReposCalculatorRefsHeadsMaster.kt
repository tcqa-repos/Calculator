package MyProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster : GitVcsRoot({
    uuid = "b7f09231-f023-4ede-8a02-2020ff2d710c"
    extId = "MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster"
    name = "https://github.com/tcqa-repos/Calculator#refs/heads/master"
    url = "https://github.com/tcqa-repos/Calculator"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx752dd25e289c95a13cecab58e9da506c421401754f05a24750bace6f2df053bac3bf9152128ee989775d03cbe80d301b"
    }
})
