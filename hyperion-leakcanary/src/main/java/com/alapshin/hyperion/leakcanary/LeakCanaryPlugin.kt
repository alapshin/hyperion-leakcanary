package com.alapshin.hyperion.leakcanary

import com.google.auto.service.AutoService
import com.willowtreeapps.hyperion.plugin.v1.Plugin
import com.willowtreeapps.hyperion.plugin.v1.PluginModule

@AutoService(Plugin::class)
class LeakCanaryPlugin : Plugin() {
    override fun createPluginModule(): PluginModule? {
        return LeakCanaryModule()
    }
}
