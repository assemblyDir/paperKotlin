plugins {
    io.papermc.paperweight.userdev
}

val paperDevBundle = "1.21.11-R0.1-SNAPSHOT"
val minecraft = paperDevBundle.substringBefore('-')

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle(paperDevBundle)
}

tasks.processResources {
    filteringCharset = "UTF-8"
    val properties = mapOf(
        "name" to rootProject.name,
        "description" to project.description,
        "version" to project.version.toString(),
        "group" to project.group.toString(),
        "minecraft_version" to minecraft,
    )
    inputs.properties(properties)
    filesMatching("paper-plugin.yml") {
        expand(properties)
    }
}

