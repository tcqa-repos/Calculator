package Calculator

import Calculator.buildTypes.*
import Calculator.vcsRoots.*
import Calculator.vcsRoots.Calculator_HttpGithubComTcqaReposCalculatorRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "ca2e091a-9ce5-4524-b83a-a39e4c7a3997"
    extId = "Calculator"
    parentId = "_Root"
    name = "Calculator"

    vcsRoot(Calculator_HttpGithubComTcqaReposCalculatorRefsHeadsMaster)

    buildType(Calculator_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = Calculator_HttpGithubComTcqaReposCalculatorRefsHeadsMaster.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
