plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin)
    implementation(libs.dokka)
    implementation(libs.shadow)
    implementation(libs.paperWeight)
}
