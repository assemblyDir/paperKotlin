plugins {
    `kotlin-convention`
    `publishing-convention`
    `paper-convention`
}

dependencies {
    api(project(":paperKotlin:core"))
    api(libs.bundles.kotlin)
}
