package com.github.assemblyDir.paperKotlin

import org.bukkit.event.Listener
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.PluginManager

/**
 * Wrapper for [PluginManager.registerEvents]
 *
 * @receiver [PluginManager] instance
 * @param plugin [Plugin] instance
 * @param listeners [Listener] instance to register
 */
fun PluginManager.registerEvents(
    plugin: Plugin,
    listeners: Listener
) { registerEvents(listeners, plugin) }

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
) { for (listener in listeners) registerEvents(plugin, listener) }

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
) { for (listener in listeners) registerEvents(plugin, listener) }
