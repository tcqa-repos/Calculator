package Calculator.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Calculator_HttpGithubComTcqaReposCalculatorRefsHeadsMaster : GitVcsRoot({
    uuid = "b178c494-8d6f-4111-bd57-1d8d75ef8d30"
    extId = "Calculator_HttpGithubComTcqaReposCalculatorRefsHeadsMaster"
    name = "https://github.com/tcqa-repos/Calculator#refs/heads/master"
    url = "https://github.com/tcqa-repos/Calculator"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxxb4813732520f9587c2fb27cb30cc3e32"
    }
})
