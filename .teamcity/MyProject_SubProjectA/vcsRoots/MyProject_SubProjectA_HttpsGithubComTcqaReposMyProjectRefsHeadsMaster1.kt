package MyProject_SubProjectA.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster1 : GitVcsRoot({
    uuid = "481fa2bc-dcb3-4389-b0d6-8f7cbbce4033"
    extId = "MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster1"
    name = "https://github.com/tcqa-repos/My.Project#refs/heads/master (1)"
    url = "https://github.com/tcqa-repos/My.Project"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx752dd25e289c95a13cecab58e9da506c421401754f05a24750bace6f2df053bac3bf9152128ee989775d03cbe80d301b"
    }
})
