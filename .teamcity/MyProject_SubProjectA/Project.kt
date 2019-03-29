package MyProject_SubProjectA

import MyProject_SubProjectA.buildTypes.*
import MyProject_SubProjectA.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e2164e99-02fa-410d-ad9e-9b6239457506"
    extId = "MyProject_SubProjectA"
    parentId = "MyProject"
    name = "SubProjectA"

    vcsRoot(MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster1)
    vcsRoot(MyProject_SubProjectA_HttpsGithubComTcqaReposMyProjectRefsHeadsMaster)

    buildType(MyProject_SubProjectA_Build3_2)
    buildType(MyProject_SubProjectA_Build3)
    buildType(MyProject_SubProjectA_Build2)
    buildType(MyProject_SubProjectA_Build)

    template(MyProject_SubProjectA_Template)
})
