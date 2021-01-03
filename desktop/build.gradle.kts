import Dependencies.GDX

plugins {
    java
    kotlin(Plugins.kotlinJvm)
}

group = App.groupId
version = App.version

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation(kotlin(Dependencies.Kotlin.stdLib))
    // Internal modules
    implementation(project(Modules.core))
    // GDX
    implementation(GDX.Desktop.backendLwjgl)
    implementation(GDX.Desktop.box2DPlatform)
    implementation(GDX.Desktop.controllersDesktop)
    implementation(GDX.Desktop.controllersPlatform)
    implementation(GDX.Desktop.platform)
    // Testing
    testImplementation(Dependencies.Testing.testNg)
}
