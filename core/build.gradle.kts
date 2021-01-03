import Dependencies.GDX

plugins {
    java
    kotlin(Plugins.kotlinJvm)
}

group = App.groupId

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation(kotlin(Dependencies.Kotlin.stdLib))
    // GDX
    implementation(GDX.Core.box2d)
    implementation(GDX.Core.controllers)
    implementation(GDX.Core.core)
    // Testing
    testImplementation(Dependencies.Testing.testNg)
}
