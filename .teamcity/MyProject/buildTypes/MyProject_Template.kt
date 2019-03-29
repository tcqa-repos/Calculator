package MyProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.AntBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.AntBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ant

object MyProject_Template : Template({
    uuid = "94b6d11c-17a9-4b44-b1a7-d67e7af57759"
    extId = "MyProject_Template"
    name = "Template"

    steps {
        ant {
            name = "step 1"
            id = "RUNNER_154"
            mode = antScript {
                content = """
                    <project name="test" default="sleep">
                    <target name="sleep">
                    <sleep seconds="10"/>
                    </target>
                    </project>
                """.trimIndent()
            }
        }
        ant {
            name = "step 2"
            id = "RUNNER_155"
            mode = antScript {
                content = """
                    <project name="test" default="sleep">
                    <target name="sleep">
                    <sleep seconds="10"/>
                    </target>
                    </project>
                """.trimIndent()
            }
        }
        ant {
            name = "step 3"
            id = "RUNNER_157"
            mode = antScript {
                content = """
                    <project name="test" default="sleep">
                    <target name="sleep">
                    <sleep seconds="10"/>
                    </target>
                    </project>
                """.trimIndent()
            }
        }
        ant {
            name = "step 4"
            id = "RUNNER_158"
            mode = antScript {
                content = """
                    <project name="test" default="sleep">
                    <target name="sleep">
                    <sleep seconds="10"/>
                    </target>
                    </project>
                """.trimIndent()
            }
        }
        ant {
            name = "step 5"
            id = "RUNNER_160"
            mode = antScript {
                content = """
                    <project name="test" default="sleep">
                    <target name="sleep">
                    <sleep seconds="10"/>
                    </target>
                    </project>
                """.trimIndent()
            }
        }
    }
})
