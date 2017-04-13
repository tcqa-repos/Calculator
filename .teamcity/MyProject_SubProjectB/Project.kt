package MyProject_SubProjectB

import MyProject_SubProjectB.buildTypes.*
import MyProject_SubProjectB.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "4ea670a3-5d85-42dd-9081-99301e3aeb08"
    extId = "MyProject_SubProjectB"
    parentId = "MyProject"
    name = "SubProjectB"

    vcsRoot(MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster1)
    vcsRoot(MyProject_SubProjectB_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster)

    buildType(MyProject_SubProjectB_Build)
    buildType(MyProject_SubProjectB_Build3)
    buildType(MyProject_SubProjectB_Build2)
})
