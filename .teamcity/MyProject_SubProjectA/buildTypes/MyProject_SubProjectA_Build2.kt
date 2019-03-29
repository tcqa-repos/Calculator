package MyProject_SubProjectA.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object MyProject_SubProjectA_Build2 : BuildType({
    template(MyProject_SubProjectA.buildTypes.MyProject_SubProjectA_Template)
    uuid = "ee2e7080-72c3-4e27-bcdd-146fb2fbee8d"
    extId = "MyProject_SubProjectA_Build2"
    name = "Build2"
    description = "MyProject Calculator"
})
