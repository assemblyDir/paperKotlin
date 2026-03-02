package com.github.assemblyDir.paperKotlin

import org.bukkit.event.Listener
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin

/**
 * Registers one or more event listeners for the given plugin.
 *
 * @receiver [JavaPlugin] instance
 * @param listeners One or more [Listener] instances to register
 */
fun JavaPlugin.registerEvents(
    vararg listeners: Listener
) = listeners.forEach { listener ->
    server.pluginManager.registerEvents(listener, this)
}

/**
 * Registers one or more event listeners for the given plugin.
 *
 * @receiver [PluginManager] instance
 * @param plugin [Plugin] instance
 * @param listeners One or more [Listener] instances to register
 */
fun PluginManager.registerEvents(
    plugin: Plugin,
    vararg listeners: Listener
) = listeners.forEach { listener ->
    registerEvents(listener, plugin)
}

/**
 * Registers one or more event listeners for the given plugin.
 *
 * @receiver [PluginManager] instance
 * @param plugin [Plugin] instance
 * @param listeners Iterable of [Listener] instances to register
 */
fun PluginManager.registerEvents(
    plugin: Plugin,
    listeners: Iterable<Listener>
) = listeners.forEach { listener ->
    registerEvents(listener, plugin)
}
