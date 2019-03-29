package MyProject

import MyProject.buildTypes.*
import MyProject.vcsRoots.*
import MyProject.vcsRoots.MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "16b96c6e-c385-4b95-a23d-9881ea78150e"
    extId = "MyProject"
    parentId = "_Root"
    name = "My Project"

    vcsRoot(MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster)
    vcsRoot(MyProject_HttpsGithubComTcqaReposDotNetSamplesRefsHeadsMaster)

    buildType(MyProject_Build)
    buildType(MyProject_BuildOnTemplate)

    template(MyProject_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_31"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = MyProject_HttpsGithubComTcqaReposCalculatorRefsHeadsMaster.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
