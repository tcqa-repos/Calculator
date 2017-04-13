package MyProject_SubProjectB.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster : GitVcsRoot({
    uuid = "3e628597-c268-4926-afa3-8341959262c0"
    extId = "MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster"
    name = "https://github.com/tcqa-repos/My.Project#refs/heads/master"
    url = "https://github.com/tcqa-repos/My.Project"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx752dd25e289c95a13cecab58e9da506c421401754f05a24750bace6f2df053bac3bf9152128ee989775d03cbe80d301b"
    }
})
