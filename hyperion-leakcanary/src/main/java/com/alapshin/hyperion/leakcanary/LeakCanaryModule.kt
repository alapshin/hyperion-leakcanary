package com.alapshin.hyperion.leakcanary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.willowtreeapps.hyperion.plugin.v1.PluginModule

import leakcanary.LeakCanary

class LeakCanaryModule : PluginModule(), View.OnClickListener {
    lateinit var view: View

    private fun updateView(dumpHeapEnabled: Boolean) {
        view.isSelected = dumpHeapEnabled
    }

    override fun onClick(v: View) {
        val isDumpHeapEnabled = LeakCanary.config.dumpHeap
        updateView(!isDumpHeapEnabled)
        LeakCanary.config = LeakCanary.config.copy(dumpHeap = !isDumpHeapEnabled)
    }

    override fun createPluginView(layoutInflater: LayoutInflater, parent: ViewGroup): View? {
        return layoutInflater.inflate(R.layout.hyperion_leakcanary_plugin_item, parent, false).also { v ->
            v.setOnClickListener(this)
            this.view = v
            updateView(LeakCanary.config.dumpHeap)
        }
    }
}
